/*
 * XML Type:  RequestHeader
 * Namespace: http://pe.grupobbva.com/SIMR/ents/header
 * Java type: com.grupobbva.pe.simr.ents.header.RequestHeader
 *
 * Automatically generated - do not modify.
 */
package com.grupobbva.pe.simr.ents.header;


/**
 * An XML RequestHeader(@http://pe.grupobbva.com/SIMR/ents/header).
 *
 * This is a complex type.
 */
public interface RequestHeader extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestHeader.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEE2A4CAB3D4633A513D8E834C653500A").resolveHandle("requestheader7c7ctype");
    
    /**
     * Gets the "canal" element
     */
    java.lang.String getCanal();
    
    /**
     * Gets (as xml) the "canal" element
     */
    org.apache.xmlbeans.XmlString xgetCanal();
    
    /**
     * True if has "canal" element
     */
    boolean isSetCanal();
    
    /**
     * Sets the "canal" element
     */
    void setCanal(java.lang.String canal);
    
    /**
     * Sets (as xml) the "canal" element
     */
    void xsetCanal(org.apache.xmlbeans.XmlString canal);
    
    /**
     * Unsets the "canal" element
     */
    void unsetCanal();
    
    /**
     * Gets the "codigoAplicacion" element
     */
    java.lang.String getCodigoAplicacion();
    
    /**
     * Gets (as xml) the "codigoAplicacion" element
     */
    org.apache.xmlbeans.XmlString xgetCodigoAplicacion();
    
    /**
     * True if has "codigoAplicacion" element
     */
    boolean isSetCodigoAplicacion();
    
    /**
     * Sets the "codigoAplicacion" element
     */
    void setCodigoAplicacion(java.lang.String codigoAplicacion);
    
    /**
     * Sets (as xml) the "codigoAplicacion" element
     */
    void xsetCodigoAplicacion(org.apache.xmlbeans.XmlString codigoAplicacion);
    
    /**
     * Unsets the "codigoAplicacion" element
     */
    void unsetCodigoAplicacion();
    
    /**
     * Gets the "idEmpresa" element
     */
    java.lang.String getIdEmpresa();
    
    /**
     * Gets (as xml) the "idEmpresa" element
     */
    org.apache.xmlbeans.XmlString xgetIdEmpresa();
    
    /**
     * True if has "idEmpresa" element
     */
    boolean isSetIdEmpresa();
    
    /**
     * Sets the "idEmpresa" element
     */
    void setIdEmpresa(java.lang.String idEmpresa);
    
    /**
     * Sets (as xml) the "idEmpresa" element
     */
    void xsetIdEmpresa(org.apache.xmlbeans.XmlString idEmpresa);
    
    /**
     * Unsets the "idEmpresa" element
     */
    void unsetIdEmpresa();
    
    /**
     * Gets the "usuario" element
     */
    java.lang.String getUsuario();
    
    /**
     * Gets (as xml) the "usuario" element
     */
    org.apache.xmlbeans.XmlString xgetUsuario();
    
    /**
     * True if has "usuario" element
     */
    boolean isSetUsuario();
    
    /**
     * Sets the "usuario" element
     */
    void setUsuario(java.lang.String usuario);
    
    /**
     * Sets (as xml) the "usuario" element
     */
    void xsetUsuario(org.apache.xmlbeans.XmlString usuario);
    
    /**
     * Unsets the "usuario" element
     */
    void unsetUsuario();
    
    /**
     * Gets the "fechaHoraEnvio" element
     */
    java.lang.String getFechaHoraEnvio();
    
    /**
     * Gets (as xml) the "fechaHoraEnvio" element
     */
    org.apache.xmlbeans.XmlString xgetFechaHoraEnvio();
    
    /**
     * True if has "fechaHoraEnvio" element
     */
    boolean isSetFechaHoraEnvio();
    
    /**
     * Sets the "fechaHoraEnvio" element
     */
    void setFechaHoraEnvio(java.lang.String fechaHoraEnvio);
    
    /**
     * Sets (as xml) the "fechaHoraEnvio" element
     */
    void xsetFechaHoraEnvio(org.apache.xmlbeans.XmlString fechaHoraEnvio);
    
    /**
     * Unsets the "fechaHoraEnvio" element
     */
    void unsetFechaHoraEnvio();
    
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
     * Gets the "codigoInterfaz" element
     */
    java.lang.String getCodigoInterfaz();
    
    /**
     * Gets (as xml) the "codigoInterfaz" element
     */
    org.apache.xmlbeans.XmlString xgetCodigoInterfaz();
    
    /**
     * True if has "codigoInterfaz" element
     */
    boolean isSetCodigoInterfaz();
    
    /**
     * Sets the "codigoInterfaz" element
     */
    void setCodigoInterfaz(java.lang.String codigoInterfaz);
    
    /**
     * Sets (as xml) the "codigoInterfaz" element
     */
    void xsetCodigoInterfaz(org.apache.xmlbeans.XmlString codigoInterfaz);
    
    /**
     * Unsets the "codigoInterfaz" element
     */
    void unsetCodigoInterfaz();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.grupobbva.pe.simr.ents.header.RequestHeader newInstance() {
          return (com.grupobbva.pe.simr.ents.header.RequestHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.grupobbva.pe.simr.ents.header.RequestHeader newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.grupobbva.pe.simr.ents.header.RequestHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.grupobbva.pe.simr.ents.header.RequestHeader parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.grupobbva.pe.simr.ents.header.RequestHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.grupobbva.pe.simr.ents.header.RequestHeader parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.grupobbva.pe.simr.ents.header.RequestHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.grupobbva.pe.simr.ents.header.RequestHeader parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.grupobbva.pe.simr.ents.header.RequestHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.grupobbva.pe.simr.ents.header.RequestHeader parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.grupobbva.pe.simr.ents.header.RequestHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.grupobbva.pe.simr.ents.header.RequestHeader parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.grupobbva.pe.simr.ents.header.RequestHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.grupobbva.pe.simr.ents.header.RequestHeader parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.grupobbva.pe.simr.ents.header.RequestHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.grupobbva.pe.simr.ents.header.RequestHeader parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.grupobbva.pe.simr.ents.header.RequestHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.grupobbva.pe.simr.ents.header.RequestHeader parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.grupobbva.pe.simr.ents.header.RequestHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.grupobbva.pe.simr.ents.header.RequestHeader parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.grupobbva.pe.simr.ents.header.RequestHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.grupobbva.pe.simr.ents.header.RequestHeader parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.grupobbva.pe.simr.ents.header.RequestHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.grupobbva.pe.simr.ents.header.RequestHeader parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.grupobbva.pe.simr.ents.header.RequestHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.grupobbva.pe.simr.ents.header.RequestHeader parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.grupobbva.pe.simr.ents.header.RequestHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.grupobbva.pe.simr.ents.header.RequestHeader parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.grupobbva.pe.simr.ents.header.RequestHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.grupobbva.pe.simr.ents.header.RequestHeader parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.grupobbva.pe.simr.ents.header.RequestHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.grupobbva.pe.simr.ents.header.RequestHeader parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.grupobbva.pe.simr.ents.header.RequestHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.grupobbva.pe.simr.ents.header.RequestHeader parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.grupobbva.pe.simr.ents.header.RequestHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
