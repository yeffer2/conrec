/*
 * An XML document type.
 * Localname: usuarioWSBBVAResponse
 * Namespace: http://ws.reniec.bbva.pe.com
 * Java type: com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.pe.bbva.reniec.ws.impl;
/**
 * A document containing one usuarioWSBBVAResponse(@http://ws.reniec.bbva.pe.com) element.
 *
 * This is a complex type.
 */
public class UsuarioWSBBVAResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument
{
    
    public UsuarioWSBBVAResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USUARIOWSBBVARESPONSE$0 = 
        new javax.xml.namespace.QName("http://ws.reniec.bbva.pe.com", "usuarioWSBBVAResponse");
    
    
    /**
     * Gets the "usuarioWSBBVAResponse" element
     */
    public com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument.UsuarioWSBBVAResponse getUsuarioWSBBVAResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument.UsuarioWSBBVAResponse target = null;
            target = (com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument.UsuarioWSBBVAResponse)get_store().find_element_user(USUARIOWSBBVARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usuarioWSBBVAResponse" element
     */
    public void setUsuarioWSBBVAResponse(com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument.UsuarioWSBBVAResponse usuarioWSBBVAResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument.UsuarioWSBBVAResponse target = null;
            target = (com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument.UsuarioWSBBVAResponse)get_store().find_element_user(USUARIOWSBBVARESPONSE$0, 0);
            if (target == null)
            {
                target = (com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument.UsuarioWSBBVAResponse)get_store().add_element_user(USUARIOWSBBVARESPONSE$0);
            }
            target.set(usuarioWSBBVAResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "usuarioWSBBVAResponse" element
     */
    public com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument.UsuarioWSBBVAResponse addNewUsuarioWSBBVAResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument.UsuarioWSBBVAResponse target = null;
            target = (com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument.UsuarioWSBBVAResponse)get_store().add_element_user(USUARIOWSBBVARESPONSE$0);
            return target;
        }
    }
    /**
     * An XML usuarioWSBBVAResponse(@http://ws.reniec.bbva.pe.com).
     *
     * This is a complex type.
     */
    public static class UsuarioWSBBVAResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument.UsuarioWSBBVAResponse
    {
        
        public UsuarioWSBBVAResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName USUARIOWSBBVARETURN$0 = 
            new javax.xml.namespace.QName("", "usuarioWSBBVAReturn");
        
        
        /**
         * Gets the "usuarioWSBBVAReturn" element
         */
        public com.pe.bbva.reniec.ws.UsuarioResponse getUsuarioWSBBVAReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.pe.bbva.reniec.ws.UsuarioResponse target = null;
                target = (com.pe.bbva.reniec.ws.UsuarioResponse)get_store().find_element_user(USUARIOWSBBVARETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "usuarioWSBBVAReturn" element
         */
        public boolean isNilUsuarioWSBBVAReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.pe.bbva.reniec.ws.UsuarioResponse target = null;
                target = (com.pe.bbva.reniec.ws.UsuarioResponse)get_store().find_element_user(USUARIOWSBBVARETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "usuarioWSBBVAReturn" element
         */
        public void setUsuarioWSBBVAReturn(com.pe.bbva.reniec.ws.UsuarioResponse usuarioWSBBVAReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.pe.bbva.reniec.ws.UsuarioResponse target = null;
                target = (com.pe.bbva.reniec.ws.UsuarioResponse)get_store().find_element_user(USUARIOWSBBVARETURN$0, 0);
                if (target == null)
                {
                    target = (com.pe.bbva.reniec.ws.UsuarioResponse)get_store().add_element_user(USUARIOWSBBVARETURN$0);
                }
                target.set(usuarioWSBBVAReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "usuarioWSBBVAReturn" element
         */
        public com.pe.bbva.reniec.ws.UsuarioResponse addNewUsuarioWSBBVAReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.pe.bbva.reniec.ws.UsuarioResponse target = null;
                target = (com.pe.bbva.reniec.ws.UsuarioResponse)get_store().add_element_user(USUARIOWSBBVARETURN$0);
                return target;
            }
        }
        
        /**
         * Nils the "usuarioWSBBVAReturn" element
         */
        public void setNilUsuarioWSBBVAReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.pe.bbva.reniec.ws.UsuarioResponse target = null;
                target = (com.pe.bbva.reniec.ws.UsuarioResponse)get_store().find_element_user(USUARIOWSBBVARETURN$0, 0);
                if (target == null)
                {
                    target = (com.pe.bbva.reniec.ws.UsuarioResponse)get_store().add_element_user(USUARIOWSBBVARETURN$0);
                }
                target.setNil();
            }
        }
    }
}
