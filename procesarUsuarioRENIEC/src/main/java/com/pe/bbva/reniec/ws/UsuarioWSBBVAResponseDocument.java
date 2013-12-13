/*
 * An XML document type.
 * Localname: usuarioWSBBVAResponse
 * Namespace: http://ws.reniec.bbva.pe.com
 * Java type: com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.pe.bbva.reniec.ws;


/**
 * A document containing one usuarioWSBBVAResponse(@http://ws.reniec.bbva.pe.com) element.
 *
 * This is a complex type.
 */
public interface UsuarioWSBBVAResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UsuarioWSBBVAResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2B813EC47052A11836FD29A07119E5BE").resolveHandle("usuariowsbbvaresponse71acdoctype");
    
    /**
     * Gets the "usuarioWSBBVAResponse" element
     */
    com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument.UsuarioWSBBVAResponse getUsuarioWSBBVAResponse();
    
    /**
     * Sets the "usuarioWSBBVAResponse" element
     */
    void setUsuarioWSBBVAResponse(com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument.UsuarioWSBBVAResponse usuarioWSBBVAResponse);
    
    /**
     * Appends and returns a new empty "usuarioWSBBVAResponse" element
     */
    com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument.UsuarioWSBBVAResponse addNewUsuarioWSBBVAResponse();
    
    /**
     * An XML usuarioWSBBVAResponse(@http://ws.reniec.bbva.pe.com).
     *
     * This is a complex type.
     */
    public interface UsuarioWSBBVAResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UsuarioWSBBVAResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2B813EC47052A11836FD29A07119E5BE").resolveHandle("usuariowsbbvaresponsec4aaelemtype");
        
        /**
         * Gets the "usuarioWSBBVAReturn" element
         */
        com.pe.bbva.reniec.ws.UsuarioResponse getUsuarioWSBBVAReturn();
        
        /**
         * Tests for nil "usuarioWSBBVAReturn" element
         */
        boolean isNilUsuarioWSBBVAReturn();
        
        /**
         * Sets the "usuarioWSBBVAReturn" element
         */
        void setUsuarioWSBBVAReturn(com.pe.bbva.reniec.ws.UsuarioResponse usuarioWSBBVAReturn);
        
        /**
         * Appends and returns a new empty "usuarioWSBBVAReturn" element
         */
        com.pe.bbva.reniec.ws.UsuarioResponse addNewUsuarioWSBBVAReturn();
        
        /**
         * Nils the "usuarioWSBBVAReturn" element
         */
        void setNilUsuarioWSBBVAReturn();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument.UsuarioWSBBVAResponse newInstance() {
              return (com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument.UsuarioWSBBVAResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument.UsuarioWSBBVAResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument.UsuarioWSBBVAResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument newInstance() {
          return (com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
