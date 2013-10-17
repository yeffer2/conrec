/*
 * XML Type:  usuarioRequest
 * Namespace: http://pe.grupobbva.com/SIMR/service/message
 * Java type: com.grupobbva.pe.simr.service.message.UsuarioRequest
 *
 * Automatically generated - do not modify.
 */
package com.grupobbva.pe.simr.service.message;


/**
 * An XML usuarioRequest(@http://pe.grupobbva.com/SIMR/service/message).
 *
 * This is a complex type.
 */
public interface UsuarioRequest extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UsuarioRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEE2A4CAB3D4633A513D8E834C653500A").resolveHandle("usuariorequest32detype");
    
    /**
     * Gets the "refRequestHeader" element
     */
    com.grupobbva.pe.simr.ents.header.RequestHeader getRefRequestHeader();
    
    /**
     * Sets the "refRequestHeader" element
     */
    void setRefRequestHeader(com.grupobbva.pe.simr.ents.header.RequestHeader refRequestHeader);
    
    /**
     * Appends and returns a new empty "refRequestHeader" element
     */
    com.grupobbva.pe.simr.ents.header.RequestHeader addNewRefRequestHeader();
    
    /**
     * Gets the "refUsuarioRequest" element
     */
    com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequest getRefUsuarioRequest();
    
    /**
     * Sets the "refUsuarioRequest" element
     */
    void setRefUsuarioRequest(com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequest refUsuarioRequest);
    
    /**
     * Appends and returns a new empty "refUsuarioRequest" element
     */
    com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequest addNewRefUsuarioRequest();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.grupobbva.pe.simr.service.message.UsuarioRequest newInstance() {
          return (com.grupobbva.pe.simr.service.message.UsuarioRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.grupobbva.pe.simr.service.message.UsuarioRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.grupobbva.pe.simr.service.message.UsuarioRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.grupobbva.pe.simr.service.message.UsuarioRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.grupobbva.pe.simr.service.message.UsuarioRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.grupobbva.pe.simr.service.message.UsuarioRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.grupobbva.pe.simr.service.message.UsuarioRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.grupobbva.pe.simr.service.message.UsuarioRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.grupobbva.pe.simr.service.message.UsuarioRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.grupobbva.pe.simr.service.message.UsuarioRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.grupobbva.pe.simr.service.message.UsuarioRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.grupobbva.pe.simr.service.message.UsuarioRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.grupobbva.pe.simr.service.message.UsuarioRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.grupobbva.pe.simr.service.message.UsuarioRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.grupobbva.pe.simr.service.message.UsuarioRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.grupobbva.pe.simr.service.message.UsuarioRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.grupobbva.pe.simr.service.message.UsuarioRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.grupobbva.pe.simr.service.message.UsuarioRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.grupobbva.pe.simr.service.message.UsuarioRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.grupobbva.pe.simr.service.message.UsuarioRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.grupobbva.pe.simr.service.message.UsuarioRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.grupobbva.pe.simr.service.message.UsuarioRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.grupobbva.pe.simr.service.message.UsuarioRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.grupobbva.pe.simr.service.message.UsuarioRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.grupobbva.pe.simr.service.message.UsuarioRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.grupobbva.pe.simr.service.message.UsuarioRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.grupobbva.pe.simr.service.message.UsuarioRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.grupobbva.pe.simr.service.message.UsuarioRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.grupobbva.pe.simr.service.message.UsuarioRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.grupobbva.pe.simr.service.message.UsuarioRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.grupobbva.pe.simr.service.message.UsuarioRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.grupobbva.pe.simr.service.message.UsuarioRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.grupobbva.pe.simr.service.message.UsuarioRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.grupobbva.pe.simr.service.message.UsuarioRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.grupobbva.pe.simr.service.message.UsuarioRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
