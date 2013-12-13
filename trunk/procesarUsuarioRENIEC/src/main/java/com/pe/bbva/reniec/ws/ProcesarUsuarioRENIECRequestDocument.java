/*
 * An XML document type.
 * Localname: procesarUsuarioRENIECRequest
 * Namespace: http://ws.reniec.bbva.pe.com
 * Java type: com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.pe.bbva.reniec.ws;


/**
 * A document containing one procesarUsuarioRENIECRequest(@http://ws.reniec.bbva.pe.com) element.
 *
 * This is a complex type.
 */
public interface ProcesarUsuarioRENIECRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProcesarUsuarioRENIECRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2B813EC47052A11836FD29A07119E5BE").resolveHandle("procesarusuarioreniecrequest25e6doctype");
    
    /**
     * Gets the "procesarUsuarioRENIECRequest" element
     */
    com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument.ProcesarUsuarioRENIECRequest getProcesarUsuarioRENIECRequest();
    
    /**
     * Sets the "procesarUsuarioRENIECRequest" element
     */
    void setProcesarUsuarioRENIECRequest(com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument.ProcesarUsuarioRENIECRequest procesarUsuarioRENIECRequest);
    
    /**
     * Appends and returns a new empty "procesarUsuarioRENIECRequest" element
     */
    com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument.ProcesarUsuarioRENIECRequest addNewProcesarUsuarioRENIECRequest();
    
    /**
     * An XML procesarUsuarioRENIECRequest(@http://ws.reniec.bbva.pe.com).
     *
     * This is a complex type.
     */
    public interface ProcesarUsuarioRENIECRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProcesarUsuarioRENIECRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2B813EC47052A11836FD29A07119E5BE").resolveHandle("procesarusuarioreniecrequest5f0celemtype");
        
        /**
         * Gets the "refRequestHeader" element
         */
        com.pe.bbva.reniec.ws.RefRequestHeader getRefRequestHeader();
        
        /**
         * Sets the "refRequestHeader" element
         */
        void setRefRequestHeader(com.pe.bbva.reniec.ws.RefRequestHeader refRequestHeader);
        
        /**
         * Appends and returns a new empty "refRequestHeader" element
         */
        com.pe.bbva.reniec.ws.RefRequestHeader addNewRefRequestHeader();
        
        /**
         * Gets the "refprocesarUsuarioRENIECRequest" element
         */
        com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest getRefprocesarUsuarioRENIECRequest();
        
        /**
         * Tests for nil "refprocesarUsuarioRENIECRequest" element
         */
        boolean isNilRefprocesarUsuarioRENIECRequest();
        
        /**
         * Sets the "refprocesarUsuarioRENIECRequest" element
         */
        void setRefprocesarUsuarioRENIECRequest(com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest refprocesarUsuarioRENIECRequest);
        
        /**
         * Appends and returns a new empty "refprocesarUsuarioRENIECRequest" element
         */
        com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest addNewRefprocesarUsuarioRENIECRequest();
        
        /**
         * Nils the "refprocesarUsuarioRENIECRequest" element
         */
        void setNilRefprocesarUsuarioRENIECRequest();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument.ProcesarUsuarioRENIECRequest newInstance() {
              return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument.ProcesarUsuarioRENIECRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument.ProcesarUsuarioRENIECRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument.ProcesarUsuarioRENIECRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument newInstance() {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
