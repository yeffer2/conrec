package pe.com.bbva.reniec.utileria;

import com.vaadin.terminal.Resource;
import com.vaadin.ui.MenuBar;

@SuppressWarnings("serial")
public class ReniecMenuBar extends MenuBar {

	
	public ReniecMenuItem addItem(String codigo, String caption, Command command) {
		ReniecMenuItem newItem = new ReniecMenuItem(caption, null, command, codigo);
		getItems().add((MenuItem)newItem);
        requestRepaint();
		return newItem;
	}
	
	public ReniecMenuItem addItem(String codigo, String caption, Resource icon, Command command) {
		ReniecMenuItem newItem = new ReniecMenuItem(caption, icon, command, codigo);
		getItems().add((MenuItem)newItem);
        requestRepaint();
		return newItem;
	}
	
	public class ReniecMenuItem extends MenuItem {
		
		
		private String codigo;

		public ReniecMenuItem(String caption, Resource icon,
				Command command, String codigo) {
			super(caption, icon, command);
			this.codigo = codigo;
		}

		public String getCodigo() {
			return codigo;
		}

		public ReniecMenuItem addItem(String codigo, 
				String caption, Command command) {
			MenuItem menuItem = super.addItem(caption, command);
			int index = getChildren().indexOf(menuItem);
			
			ReniecMenuItem newItem = new ReniecMenuItem(caption, null, command, codigo);
			newItem.setParent(this);
			getChildren().set(index, newItem);
			requestRepaint();
			return newItem;
		}

		public ReniecMenuItem addItem(String codigo, 
				String caption, Resource icon, Command command) {
			MenuItem menuItem = super.addItem(caption, command);
			int index = getChildren().indexOf(menuItem);
			
			ReniecMenuItem newItem = new ReniecMenuItem(caption, icon, command, codigo);
			newItem.setParent(this);
			getChildren().set(index, newItem);
			requestRepaint();
			return newItem;
		}
		
	}

}
