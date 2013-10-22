package pe.com.bbva.reniec.utileria;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.vaadin.data.Container.Indexed;
import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.util.MethodProperty;
import com.vaadin.service.FileTypeResolver;
import com.vaadin.terminal.Resource;
import com.vaadin.ui.treetable.Collapsible;

public class CollapsibleFileSystemContainer implements Collapsible, Indexed {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static String PROPERTY_NAME = "Nombre Archivo";

    public static String PROPERTY_SIZE = "Tamaño";

    public static String PROPERTY_ICON = "Icon";

    public static String PROPERTY_LASTMODIFIED = "Fecha de Modificación";
    
    public static Collection<String> FILE_PROPERTIES;

    private final static Method FILEITEM_LASTMODIFIED;

    private final static Method FILEITEM_NAME;

    private final static Method FILEITEM_ICON;

    private final static Method FILEITEM_SIZE;
    
    static {

        FILE_PROPERTIES = new ArrayList<String>();
        FILE_PROPERTIES.add(PROPERTY_NAME);
        FILE_PROPERTIES.add(PROPERTY_ICON);
        FILE_PROPERTIES.add(PROPERTY_SIZE);
        FILE_PROPERTIES.add(PROPERTY_LASTMODIFIED);
        FILE_PROPERTIES = Collections.unmodifiableCollection(FILE_PROPERTIES);
        try {
            FILEITEM_LASTMODIFIED = FileItem.class.getMethod("lastModified",
                    new Class[] {});
            FILEITEM_NAME = FileItem.class.getMethod("getName", new Class[] {});
            FILEITEM_ICON = FileItem.class.getMethod("getIcon", new Class[] {});
            FILEITEM_SIZE = FileItem.class.getMethod("getSize", new Class[] {});
        } catch (final NoSuchMethodException e) {
            throw new RuntimeException(
                    "Internal error finding methods in FilesystemContainer");
        }
    }

    private File[] roots = new File[] {};
    

    private FilenameFilter filter = null;
    
    public CollapsibleFileSystemContainer(File root) {
    	if (root != null) {
            roots = new File[] { root };
        }
    }

    public void addRoot(File root) {
        if (root != null) {
            final File[] newRoots = new File[roots.length + 1];
            for (int i = 0; i < roots.length; i++) {
                newRoots[i] = roots[i];
            }
            newRoots[roots.length] = root;
            roots = newRoots;
        }
    }

    public boolean areChildrenAllowed(Object itemId) {
        return itemId instanceof File && ((File) itemId).canRead()
                && ((File) itemId).isDirectory();
    }

    public Collection<File> getChildren(Object itemId) {

        if (!(itemId instanceof File)) {
            return Collections.unmodifiableCollection(new LinkedList<File>());
        }
        File[] f;
        if (filter != null) {
            f = ((File) itemId).listFiles(filter);
        } else {
            f = ((File) itemId).listFiles();
        }

        if (f == null) {
            return Collections.unmodifiableCollection(new LinkedList<File>());
        }

        final List<File> l = Arrays.asList(f);
        Collections.sort(l);

        return Collections.unmodifiableCollection(l);
    }

    public Object getParent(Object itemId) {

        if (!(itemId instanceof File)) {
            return null;
        }
        return ((File) itemId).getParentFile();
    }

    public boolean hasChildren(Object itemId) {

        if (!(itemId instanceof File)) {
            return false;
        }
        String[] l;
        if (filter != null) {
            l = ((File) itemId).list(filter);
        } else {
            l = ((File) itemId).list();
        }
        return (l != null) && (l.length > 0);
    }

    public boolean isRoot(Object itemId) {

        if (!(itemId instanceof File)) {
            return false;
        }
        for (int i = 0; i < roots.length; i++) {
            if (roots[i].equals(itemId)) {
                return true;
            }
        }
        return false;
    }

    public Collection<File> rootItemIds() {

        File[] f;

        // in single root case we use children
        if (roots.length == 1) {
            if (filter != null) {
                f = roots[0].listFiles(filter);
            } else {
                f = roots[0].listFiles();
            }
        } else {
            f = roots;
        }

        if (f == null) {
            return Collections.unmodifiableCollection(new LinkedList<File>());
        }

        final List<File> l = Arrays.asList(f);
        Collections.sort(l);

        return Collections.unmodifiableCollection(l);
    }

    public boolean setChildrenAllowed(Object itemId, boolean areChildrenAllowed)
            throws UnsupportedOperationException {

        throw new UnsupportedOperationException(
                "Conversion file to/from directory is not supported");
    }

    public boolean setParent(Object itemId, Object newParentId)
            throws UnsupportedOperationException {

        throw new UnsupportedOperationException("File moving is not supported");
    }

    public boolean containsId(Object itemId) {

        if (!(itemId instanceof File)) {
            return false;
        }
        boolean val = false;

        for (int i = 0; !val & i < roots.length; i++) {
            try {
                val |= ((File) itemId).getCanonicalPath().startsWith(
                        roots[i].getCanonicalPath());
            } catch (final IOException e) {
            }

        }
        if (val && filter != null) {
            val &= filter.accept(((File) itemId).getParentFile(),
                    ((File) itemId).getName());
        }
        return val;
    }

    public Item getItem(Object itemId) {

        if (!(itemId instanceof File)) {
            return null;
        }
        return new FileItem((File) itemId);
    }

    public Collection<File> getItemIds() {

        File[] f;
        if (roots.length == 1) {
            if (filter != null) {
                f = roots[0].listFiles(filter);
            } else {
                f = roots[0].listFiles();
            }
        } else {
            f = roots;
        }

        if (f == null) {
            return Collections.unmodifiableCollection(new LinkedList<File>());
        }

        final List<File> l = Arrays.asList(f);
        Collections.sort(l);
        return Collections.unmodifiableCollection(l);

    }

    public Property getContainerProperty(Object itemId, Object propertyId) {

        if (!(itemId instanceof File)) {
            return null;
        }

        if (propertyId.equals(PROPERTY_NAME)) {
            return new MethodProperty(getType(propertyId), new FileItem(
                    (File) itemId), FILEITEM_NAME, null);
        }

        if (propertyId.equals(PROPERTY_ICON)) {
            return new MethodProperty(getType(propertyId), new FileItem(
                    (File) itemId), FILEITEM_ICON, null);
        }

        if (propertyId.equals(PROPERTY_SIZE)) {
            return new MethodProperty(getType(propertyId), new FileItem(
                    (File) itemId), FILEITEM_SIZE, null);
        }

        if (propertyId.equals(PROPERTY_LASTMODIFIED)) {
            return new MethodProperty(getType(propertyId), new FileItem(
                    (File) itemId), FILEITEM_LASTMODIFIED, null);
        }
        return null;
    }

    public Collection<String> getContainerPropertyIds() {
        return FILE_PROPERTIES;
    }

    public Class<?> getType(Object propertyId) {

        if (propertyId.equals(PROPERTY_NAME)) {
            return String.class;
        }
        if (propertyId.equals(PROPERTY_ICON)) {
            return Resource.class;
        }
        if (propertyId.equals(PROPERTY_SIZE)) {
            return String.class;
        }
        if (propertyId.equals(PROPERTY_LASTMODIFIED)) {
            //return Date.class;
        	return String.class;
        }
        return null;
    }

    public int size() {
        return getPreorder().size();
    }

    private List<File> preorder;

    private List<File> getPreorder() {
        if (preorder == null) {
            preorder = new ArrayList<File>();
            for (File root : roots) {
                preorder.add(root);
                loadVisibleSubtree(root);
            }

        }
        return preorder;
    }

    private void loadVisibleSubtree(File root) {
        if (!isCollapsed(root)) {
            File[] f;
            if (filter != null) {
                f = root.listFiles(filter);
            } else {
                f = root.listFiles();
            }
            if (f != null) {
                for (File file : f) {
                    preorder.add(file);
                    loadVisibleSubtree(file);
                }
            }
        }
    }

    public class FileItem implements Item {

        private final File file;

        private FileItem(File file) {
            this.file = file;
        }

        public Property getItemProperty(Object id) {
            return getContainerProperty(file, id);
        }

        public Collection<String> getItemPropertyIds() {
            return getContainerPropertyIds();
        }

        @Override
        public int hashCode() {
            return file.hashCode()
                    ^ CollapsibleFileSystemContainer.this.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof FileItem)) {
                return false;
            }
            final FileItem fi = (FileItem) obj;
            return fi.getHost() == getHost() && fi.file.equals(file);
        }

        private CollapsibleFileSystemContainer getHost() {
            return CollapsibleFileSystemContainer.this;
        }

        public String lastModified() { //Date
            //return new Date(file.lastModified());
        	Date fechaModificacion = new Date(file.lastModified());
        	SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        	return formateador.format(fechaModificacion);
        }

        public String getName() {
            return file.getName();
        }

        public Resource getIcon() {
            return FileTypeResolver.getIcon(file);
        }

        public String getSize() {
            if (file.isDirectory()) {
                return "";
            }
            return file.length() + " KB";
        }
        
        @Override
        public String toString() {
            if ("".equals(file.getName())) {
                return file.getAbsolutePath();
            }
            return file.getName();
        }

        public boolean addItemProperty(Object id, Property property)
                throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Filesystem container "
                    + "does not support adding new properties");
        }

        public boolean removeItemProperty(Object id)
                throws UnsupportedOperationException {
            throw new UnsupportedOperationException(
                    "Filesystem container does not support property removal");
        }

    }

    public static class FileExtensionFilter implements FilenameFilter,
            Serializable {

        private final String filter;

        public FileExtensionFilter(String fileExtension) {
            filter = "." + fileExtension;
        }

        public boolean accept(File dir, String name) {
            if (name.endsWith(filter)) {
                return true;
            }
            return new File(dir, name).isDirectory();
        }

    }

    public FilenameFilter getFilter() {
        return filter;
    }

    public void setFilter(FilenameFilter filter) {
        this.filter = filter;
    }

    public void setFilter(String extension) {
        filter = new FileExtensionFilter(extension);
    }

    public boolean addContainerProperty(Object propertyId, Class<?> type,
            Object defaultValue) throws UnsupportedOperationException {
        throw new UnsupportedOperationException(
                "File system container does not support this operation");
    }

    public Object addItem() throws UnsupportedOperationException {
        throw new UnsupportedOperationException(
                "File system container does not support this operation");
    }

    public Item addItem(Object itemId) throws UnsupportedOperationException {
        throw new UnsupportedOperationException(
                "File system container does not support this operation");
    }

    public boolean removeAllItems() throws UnsupportedOperationException {
        throw new UnsupportedOperationException(
                "File system container does not support this operation");
    }

    public boolean removeItem(Object itemId)
            throws UnsupportedOperationException {
        throw new UnsupportedOperationException(
                "File system container does not support this operation");
    }

    public boolean removeContainerProperty(Object propertyId)
            throws UnsupportedOperationException {
        throw new UnsupportedOperationException(
                "File system container does not support this operation");
    }

    Set<File> openDirectories = new HashSet<File>();

    public boolean isCollapsed(Object itemId) {
        return !openDirectories.contains(itemId);
    }

    public void setCollapsed(Object itemId, boolean collapsed) {
        if (collapsed) {
            openDirectories.remove(itemId);
        } else {
            openDirectories.add((File) itemId);
        }
        preorder = null;
    }

    public Object addItemAfter(Object previousItemId)
            throws UnsupportedOperationException {
        throw new UnsupportedOperationException(
                "File system container does not support this operation");
    }

    public Item addItemAfter(Object previousItemId, Object newItemId)
            throws UnsupportedOperationException {
        throw new UnsupportedOperationException(
                "File system container does not support this operation");
    }

    public Object firstItemId() {
        return roots[0];
    }

    public boolean isFirstId(Object itemId) {
        return itemId.equals(firstItemId());
    }

    public boolean isLastId(Object itemId) {
        return itemId.equals(lastItemId());
    }

    public Object lastItemId() {
        return getPreorder().get(size() - 1);
    }

    public Object nextItemId(Object itemId) {
        int indexOf = getPreorder().indexOf(itemId) + 1;
        if (indexOf == size()) {
            return null;
        }
        return getPreorder().get(indexOf);
    }

    public Object prevItemId(Object itemId) {
        int indexOf = getPreorder().indexOf(itemId) - 1;
        if (indexOf < 0) {
            return null;
        }
        return getPreorder().get(indexOf);
    }

    public Object addItemAt(int index) throws UnsupportedOperationException {
        throw new UnsupportedOperationException(
                "File system container does not support this operation");
    }

    public Item addItemAt(int index, Object newItemId)
            throws UnsupportedOperationException {
        throw new UnsupportedOperationException(
                "File system container does not support this operation");
    }

    public Object getIdByIndex(int index) {
        return getPreorder().get(index);
    }

    public int indexOfId(Object itemId) {
        return getPreorder().indexOf(itemId);
    }
	
}