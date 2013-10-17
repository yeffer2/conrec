/*
 * An XML document type.
 * Localname: usuarioResponse
 * Namespace: http://pe.grupobbva.com/SIMR/service/message
 * Java type: com.grupobbva.pe.simr.service.message.UsuarioResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.grupobbva.pe.simr.service.message;


/**
 * A document containing one usuarioResponse(@http://pe.grupobbva.com/SIMR/service/message) element.
 *
 * This is a complex type.
 */
public interface UsuarioResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UsuarioResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEE2A4CAB3D4633A513D8E834C653500A").resolveHandle("usuarioresponse6092doctype");
    
    /**
     * Gets the "usuarioResponse" element
     */
    com.grupobbva.pe.simr.service.message.UsuarioResponse getUsuarioResponse();
    
    /**
     * Sets the "usuarioResponse" element
     */
    void setUsuarioResponse(com.grupobbva.pe.simr.service.message.UsuarioResponse usuarioResponse);
    
    /**
     * Appends and returns a new empty "usuarioResponse" element
     */
    com.grupobbva.pe.simr.service.message.UsuarioResponse addNewUsuarioResponse();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.grupobbva.pe.simr.service.message.UsuarioResponseDocument newInstance() {
          return (com.grupobbva.pe.simr.service.message.UsuarioResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.grupobbva.pe.simr.service.message.UsuarioResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.grupobbva.pe.simr.service.message.UsuarioResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.grupobbva.pe.simr.service.message.UsuarioResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.grupobbva.pe.simr.service.message.UsuarioResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.grupobbva.pe.simr.service.message.UsuarioResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.grupobbva.pe.simr.service.message.UsuarioResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.grupobbva.pe.simr.service.message.UsuarioResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.grupobbva.pe.simr.service.message.UsuarioResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.grupobbva.pe.simr.service.message.UsuarioResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.grupobbva.pe.simr.service.message.UsuarioResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.grupobbva.pe.simr.service.message.UsuarioResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.grupobbva.pe.simr.service.message.UsuarioResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.grupobbva.pe.simr.service.message.UsuarioResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.grupobbva.pe.simr.service.message.UsuarioResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.grupobbva.pe.simr.service.message.UsuarioResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.grupobbva.pe.simr.service.message.UsuarioResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.grupobbva.pe.simr.service.message.UsuarioResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.grupobbva.pe.simr.service.message.UsuarioResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.grupobbva.pe.simr.service.message.UsuarioResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.grupobbva.pe.simr.service.message.UsuarioResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.grupobbva.pe.simr.service.message.UsuarioResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.grupobbva.pe.simr.service.message.UsuarioResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.grupobbva.pe.simr.service.message.UsuarioResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.grupobbva.pe.simr.service.message.UsuarioResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.grupobbva.pe.simr.service.message.UsuarioResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.grupobbva.pe.simr.service.message.UsuarioResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.grupobbva.pe.simr.service.message.UsuarioResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.grupobbva.pe.simr.service.message.UsuarioResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.grupobbva.pe.simr.service.message.UsuarioResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.grupobbva.pe.simr.service.message.UsuarioResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.grupobbva.pe.simr.service.message.UsuarioResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.grupobbva.pe.simr.service.message.UsuarioResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.grupobbva.pe.simr.service.message.UsuarioResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.grupobbva.pe.simr.service.message.UsuarioResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
