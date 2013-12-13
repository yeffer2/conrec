/*
 * XML Type:  ProcesarUsuarioRENIECRequest
 * Namespace: http://ws.reniec.bbva.pe.com
 * Java type: com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest
 *
 * Automatically generated - do not modify.
 */
package com.pe.bbva.reniec.ws;


/**
 * An XML ProcesarUsuarioRENIECRequest(@http://ws.reniec.bbva.pe.com).
 *
 * This is a complex type.
 */
public interface ProcesarUsuarioRENIECRequest extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProcesarUsuarioRENIECRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2B813EC47052A11836FD29A07119E5BE").resolveHandle("procesarusuarioreniecrequestd1d6type");
    
    /**
     * Gets the "empresa" element
     */
    java.lang.String getEmpresa();
    
    /**
     * Gets (as xml) the "empresa" element
     */
    org.apache.xmlbeans.XmlString xgetEmpresa();
    
    /**
     * Tests for nil "empresa" element
     */
    boolean isNilEmpresa();
    
    /**
     * Sets the "empresa" element
     */
    void setEmpresa(java.lang.String empresa);
    
    /**
     * Sets (as xml) the "empresa" element
     */
    void xsetEmpresa(org.apache.xmlbeans.XmlString empresa);
    
    /**
     * Nils the "empresa" element
     */
    void setNilEmpresa();
    
    /**
     * Gets the "codigo" element
     */
    java.lang.String getCodigo();
    
    /**
     * Gets (as xml) the "codigo" element
     */
    org.apache.xmlbeans.XmlString xgetCodigo();
    
    /**
     * Tests for nil "codigo" element
     */
    boolean isNilCodigo();
    
    /**
     * Sets the "codigo" element
     */
    void setCodigo(java.lang.String codigo);
    
    /**
     * Sets (as xml) the "codigo" element
     */
    void xsetCodigo(org.apache.xmlbeans.XmlString codigo);
    
    /**
     * Nils the "codigo" element
     */
    void setNilCodigo();
    
    /**
     * Gets the "nombres" element
     */
    java.lang.String getNombres();
    
    /**
     * Gets (as xml) the "nombres" element
     */
    org.apache.xmlbeans.XmlString xgetNombres();
    
    /**
     * Tests for nil "nombres" element
     */
    boolean isNilNombres();
    
    /**
     * Sets the "nombres" element
     */
    void setNombres(java.lang.String nombres);
    
    /**
     * Sets (as xml) the "nombres" element
     */
    void xsetNombres(org.apache.xmlbeans.XmlString nombres);
    
    /**
     * Nils the "nombres" element
     */
    void setNilNombres();
    
    /**
     * Gets the "apellidoPaterno" element
     */
    java.lang.String getApellidoPaterno();
    
    /**
     * Gets (as xml) the "apellidoPaterno" element
     */
    org.apache.xmlbeans.XmlString xgetApellidoPaterno();
    
    /**
     * Tests for nil "apellidoPaterno" element
     */
    boolean isNilApellidoPaterno();
    
    /**
     * Sets the "apellidoPaterno" element
     */
    void setApellidoPaterno(java.lang.String apellidoPaterno);
    
    /**
     * Sets (as xml) the "apellidoPaterno" element
     */
    void xsetApellidoPaterno(org.apache.xmlbeans.XmlString apellidoPaterno);
    
    /**
     * Nils the "apellidoPaterno" element
     */
    void setNilApellidoPaterno();
    
    /**
     * Gets the "apellidoMaterno" element
     */
    java.lang.String getApellidoMaterno();
    
    /**
     * Gets (as xml) the "apellidoMaterno" element
     */
    org.apache.xmlbeans.XmlString xgetApellidoMaterno();
    
    /**
     * Tests for nil "apellidoMaterno" element
     */
    boolean isNilApellidoMaterno();
    
    /**
     * Sets the "apellidoMaterno" element
     */
    void setApellidoMaterno(java.lang.String apellidoMaterno);
    
    /**
     * Sets (as xml) the "apellidoMaterno" element
     */
    void xsetApellidoMaterno(org.apache.xmlbeans.XmlString apellidoMaterno);
    
    /**
     * Nils the "apellidoMaterno" element
     */
    void setNilApellidoMaterno();
    
    /**
     * Gets the "fechaNacimiento" element
     */
    java.lang.String getFechaNacimiento();
    
    /**
     * Gets (as xml) the "fechaNacimiento" element
     */
    org.apache.xmlbeans.XmlString xgetFechaNacimiento();
    
    /**
     * Tests for nil "fechaNacimiento" element
     */
    boolean isNilFechaNacimiento();
    
    /**
     * Sets the "fechaNacimiento" element
     */
    void setFechaNacimiento(java.lang.String fechaNacimiento);
    
    /**
     * Sets (as xml) the "fechaNacimiento" element
     */
    void xsetFechaNacimiento(org.apache.xmlbeans.XmlString fechaNacimiento);
    
    /**
     * Nils the "fechaNacimiento" element
     */
    void setNilFechaNacimiento();
    
    /**
     * Gets the "tipo" element
     */
    pe.gob.reniec.www.TipoType.Enum getTipo();
    
    /**
     * Gets (as xml) the "tipo" element
     */
    pe.gob.reniec.www.TipoType xgetTipo();
    
    /**
     * Tests for nil "tipo" element
     */
    boolean isNilTipo();
    
    /**
     * Sets the "tipo" element
     */
    void setTipo(pe.gob.reniec.www.TipoType.Enum tipo);
    
    /**
     * Sets (as xml) the "tipo" element
     */
    void xsetTipo(pe.gob.reniec.www.TipoType tipo);
    
    /**
     * Nils the "tipo" element
     */
    void setNilTipo();
    
    /**
     * Gets the "proceso" element
     */
    pe.gob.reniec.www.ProcesoType.Enum getProceso();
    
    /**
     * Gets (as xml) the "proceso" element
     */
    pe.gob.reniec.www.ProcesoType xgetProceso();
    
    /**
     * Tests for nil "proceso" element
     */
    boolean isNilProceso();
    
    /**
     * Sets the "proceso" element
     */
    void setProceso(pe.gob.reniec.www.ProcesoType.Enum proceso);
    
    /**
     * Sets (as xml) the "proceso" element
     */
    void xsetProceso(pe.gob.reniec.www.ProcesoType proceso);
    
    /**
     * Nils the "proceso" element
     */
    void setNilProceso();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest newInstance() {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
