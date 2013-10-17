/*
 * An XML document type.
 * Localname: usuarioResponse
 * Namespace: http://pe.grupobbva.com/SIMR/service/message
 * Java type: com.grupobbva.pe.simr.service.message.UsuarioResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.grupobbva.pe.simr.service.message.impl;
/**
 * A document containing one usuarioResponse(@http://pe.grupobbva.com/SIMR/service/message) element.
 *
 * This is a complex type.
 */
public class UsuarioResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.grupobbva.pe.simr.service.message.UsuarioResponseDocument
{
    
    public UsuarioResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USUARIORESPONSE$0 = 
        new javax.xml.namespace.QName("http://pe.grupobbva.com/SIMR/service/message", "usuarioResponse");
    
    
    /**
     * Gets the "usuarioResponse" element
     */
    public com.grupobbva.pe.simr.service.message.UsuarioResponse getUsuarioResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.grupobbva.pe.simr.service.message.UsuarioResponse target = null;
            target = (com.grupobbva.pe.simr.service.message.UsuarioResponse)get_store().find_element_user(USUARIORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usuarioResponse" element
     */
    public void setUsuarioResponse(com.grupobbva.pe.simr.service.message.UsuarioResponse usuarioResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.grupobbva.pe.simr.service.message.UsuarioResponse target = null;
            target = (com.grupobbva.pe.simr.service.message.UsuarioResponse)get_store().find_element_user(USUARIORESPONSE$0, 0);
            if (target == null)
            {
                target = (com.grupobbva.pe.simr.service.message.UsuarioResponse)get_store().add_element_user(USUARIORESPONSE$0);
            }
            target.set(usuarioResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "usuarioResponse" element
     */
    public com.grupobbva.pe.simr.service.message.UsuarioResponse addNewUsuarioResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.grupobbva.pe.simr.service.message.UsuarioResponse target = null;
            target = (com.grupobbva.pe.simr.service.message.UsuarioResponse)get_store().add_element_user(USUARIORESPONSE$0);
            return target;
        }
    }
}
