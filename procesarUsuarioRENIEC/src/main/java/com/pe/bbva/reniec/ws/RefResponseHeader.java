/*
 * XML Type:  RefResponseHeader
 * Namespace: http://ws.reniec.bbva.pe.com
 * Java type: com.pe.bbva.reniec.ws.RefResponseHeader
 *
 * Automatically generated - do not modify.
 */
package com.pe.bbva.reniec.ws;


/**
 * An XML RefResponseHeader(@http://ws.reniec.bbva.pe.com).
 *
 * This is a complex type.
 */
public interface RefResponseHeader extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RefResponseHeader.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2B813EC47052A11836FD29A07119E5BE").resolveHandle("refresponseheaderee51type");
    
    /**
     * Gets the "idTransaccion" element
     */
    java.lang.String getIdTransaccion();
    
    /**
     * Gets (as xml) the "idTransaccion" element
     */
    org.apache.xmlbeans.XmlString xgetIdTransaccion();
    
    /**
     * True if has "idTransaccion" element
     */
    boolean isSetIdTransaccion();
    
    /**
     * Sets the "idTransaccion" element
     */
    void setIdTransaccion(java.lang.String idTransaccion);
    
    /**
     * Sets (as xml) the "idTransaccion" element
     */
    void xsetIdTransaccion(org.apache.xmlbeans.XmlString idTransaccion);
    
    /**
     * Unsets the "idTransaccion" element
     */
    void unsetIdTransaccion();
    
    /**
     * Gets the "codigoRespuesta" element
     */
    java.lang.String getCodigoRespuesta();
    
    /**
     * Gets (as xml) the "codigoRespuesta" element
     */
    org.apache.xmlbeans.XmlString xgetCodigoRespuesta();
    
    /**
     * True if has "codigoRespuesta" element
     */
    boolean isSetCodigoRespuesta();
    
    /**
     * Sets the "codigoRespuesta" element
     */
    void setCodigoRespuesta(java.lang.String codigoRespuesta);
    
    /**
     * Sets (as xml) the "codigoRespuesta" element
     */
    void xsetCodigoRespuesta(org.apache.xmlbeans.XmlString codigoRespuesta);
    
    /**
     * Unsets the "codigoRespuesta" element
     */
    void unsetCodigoRespuesta();
    
    /**
     * Gets the "mensajeRespuesta" element
     */
    java.lang.String getMensajeRespuesta();
    
    /**
     * Gets (as xml) the "mensajeRespuesta" element
     */
    org.apache.xmlbeans.XmlString xgetMensajeRespuesta();
    
    /**
     * True if has "mensajeRespuesta" element
     */
    boolean isSetMensajeRespuesta();
    
    /**
     * Sets the "mensajeRespuesta" element
     */
    void setMensajeRespuesta(java.lang.String mensajeRespuesta);
    
    /**
     * Sets (as xml) the "mensajeRespuesta" element
     */
    void xsetMensajeRespuesta(org.apache.xmlbeans.XmlString mensajeRespuesta);
    
    /**
     * Unsets the "mensajeRespuesta" element
     */
    void unsetMensajeRespuesta();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.pe.bbva.reniec.ws.RefResponseHeader newInstance() {
          return (com.pe.bbva.reniec.ws.RefResponseHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.pe.bbva.reniec.ws.RefResponseHeader newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.pe.bbva.reniec.ws.RefResponseHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.pe.bbva.reniec.ws.RefResponseHeader parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.pe.bbva.reniec.ws.RefResponseHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.pe.bbva.reniec.ws.RefResponseHeader parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.pe.bbva.reniec.ws.RefResponseHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.pe.bbva.reniec.ws.RefResponseHeader parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.RefResponseHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.pe.bbva.reniec.ws.RefResponseHeader parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.RefResponseHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.pe.bbva.reniec.ws.RefResponseHeader parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.RefResponseHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.pe.bbva.reniec.ws.RefResponseHeader parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.RefResponseHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.pe.bbva.reniec.ws.RefResponseHeader parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.RefResponseHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.pe.bbva.reniec.ws.RefResponseHeader parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.RefResponseHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.pe.bbva.reniec.ws.RefResponseHeader parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.RefResponseHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.pe.bbva.reniec.ws.RefResponseHeader parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.RefResponseHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.pe.bbva.reniec.ws.RefResponseHeader parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.pe.bbva.reniec.ws.RefResponseHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.pe.bbva.reniec.ws.RefResponseHeader parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.pe.bbva.reniec.ws.RefResponseHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.pe.bbva.reniec.ws.RefResponseHeader parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.pe.bbva.reniec.ws.RefResponseHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.pe.bbva.reniec.ws.RefResponseHeader parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.pe.bbva.reniec.ws.RefResponseHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.pe.bbva.reniec.ws.RefResponseHeader parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.pe.bbva.reniec.ws.RefResponseHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.pe.bbva.reniec.ws.RefResponseHeader parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.pe.bbva.reniec.ws.RefResponseHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
