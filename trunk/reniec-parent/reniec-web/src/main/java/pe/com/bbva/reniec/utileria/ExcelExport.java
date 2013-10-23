package pe.com.bbva.reniec.utileria;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import com.vaadin.data.Item;
import com.vaadin.ui.Table;

public class ExcelExport {

	final static String nombreReporteCargaMasiva = "DETALLE DE CARGA MASIVA";

	@SuppressWarnings("unchecked")
	public static <T> ByteArrayOutputStream exportarCargaMasiva(
			Table tablaCabecera, Table tablaDetalle) throws Exception {

		Object[] columnas = tablaCabecera.getVisibleColumns();
		Object[] columnasDetalle = tablaDetalle.getVisibleColumns();
		Item valores = tablaCabecera
				.getItem((Integer) tablaCabecera.getValue());

		HSSFWorkbook libro = new HSSFWorkbook();
		HSSFSheet hoja = libro.createSheet();
		HSSFRow fila = null;
		HSSFCell celda = null;
		int iFila = 0;
		fila = hoja.createRow(iFila++);
		celda = fila.createCell(0);
		celda.setCellValue(new HSSFRichTextString(nombreReporteCargaMasiva));
		CellRangeAddress region = new CellRangeAddress(0, 0, 0,
				columnasDetalle.length - 1);
		hoja.addMergedRegion(region);
		celda.setCellStyle(getStyleHeader(libro));
		for (int i = 1; i < region.getNumberOfCells(); i++) {
			celda = fila.createCell(i);
			celda.setCellStyle(getStyleHeader(libro));
		}

		iFila++;
		for (Object columna : columnas) {
			fila = hoja.createRow(iFila);
			celda = fila.createCell(0);
			celda.setCellValue(tablaCabecera.getColumnHeader(columna));
			region = new CellRangeAddress(iFila, iFila, 0, 2);
			hoja.addMergedRegion(region);

			celda = fila.createCell(3);
			celda.setCellValue(valores.getItemProperty(columna).toString());
			region = new CellRangeAddress(iFila, iFila, 3,
					columnasDetalle.length - 1);
			hoja.addMergedRegion(region);
			iFila++;
		}
		iFila++;

		fila = hoja.createRow(iFila++);
		int iColumna = 0;
		for (Object columnaDetalle : columnasDetalle) {
			celda = fila.createCell(iColumna++);
			celda.setCellValue(tablaDetalle.getColumnHeader(columnaDetalle));
			celda.setCellStyle(getStyleHeader(libro));
		}

		Collection<T> detalles = (Collection<T>) tablaDetalle.getItemIds();

		for (T detalle : detalles) {
			Item item = tablaDetalle.getItem(detalle);
			fila = hoja.createRow(iFila++);
			iColumna = 0;
			for (Object columnaDetalle : columnasDetalle) {
				celda = fila.createCell(iColumna++);
				celda.setCellValue(item.getItemProperty(columnaDetalle)
						.toString());
			}
		}

		for (int i = 0; i < columnasDetalle.length; i++)
			hoja.autoSizeColumn(i);

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		libro.write(baos);
		return baos;

	}

	private static CellStyle getStyleHeader(HSSFWorkbook workbook) {
		HSSFCellStyle style = workbook.createCellStyle();
		style.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
		style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		style.setBorderBottom(CellStyle.BORDER_THIN);
		style.setBorderLeft(CellStyle.BORDER_THIN);
		style.setBorderRight(CellStyle.BORDER_THIN);
		style.setBorderTop(CellStyle.BORDER_THIN);
		style.setAlignment(CellStyle.ALIGN_CENTER);

		HSSFFont defaultFont = workbook.createFont();
		defaultFont.setFontHeightInPoints((short) 10);
		defaultFont.setFontName("Arial");
		defaultFont.setColor(IndexedColors.BLACK.getIndex());
		defaultFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		defaultFont.setItalic(false);
		style.setFont(defaultFont);
		return style;

	}

}
