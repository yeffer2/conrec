/*
 * XML Type:  usuarioRequest
 * Namespace: http://pe.grupobbva.com/SIMR/service/message
 * Java type: com.grupobbva.pe.simr.service.message.UsuarioRequest
 *
 * Automatically generated - do not modify.
 */
package com.grupobbva.pe.simr.service.message.impl;
/**
 * An XML usuarioRequest(@http://pe.grupobbva.com/SIMR/service/message).
 *
 * This is a complex type.
 */
public class UsuarioRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.grupobbva.pe.simr.service.message.UsuarioRequest
{
    
    public UsuarioRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFREQUESTHEADER$0 = 
        new javax.xml.namespace.QName("", "refRequestHeader");
    private static final javax.xml.namespace.QName REFUSUARIOREQUEST$2 = 
        new javax.xml.namespace.QName("", "refUsuarioRequest");
    
    
    /**
     * Gets the "refRequestHeader" element
     */
    public com.grupobbva.pe.simr.ents.header.RequestHeader getRefRequestHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.grupobbva.pe.simr.ents.header.RequestHeader target = null;
            target = (com.grupobbva.pe.simr.ents.header.RequestHeader)get_store().find_element_user(REFREQUESTHEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "refRequestHeader" element
     */
    public void setRefRequestHeader(com.grupobbva.pe.simr.ents.header.RequestHeader refRequestHeader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.grupobbva.pe.simr.ents.header.RequestHeader target = null;
            target = (com.grupobbva.pe.simr.ents.header.RequestHeader)get_store().find_element_user(REFREQUESTHEADER$0, 0);
            if (target == null)
            {
                target = (com.grupobbva.pe.simr.ents.header.RequestHeader)get_store().add_element_user(REFREQUESTHEADER$0);
            }
            target.set(refRequestHeader);
        }
    }
    
    /**
     * Appends and returns a new empty "refRequestHeader" element
     */
    public com.grupobbva.pe.simr.ents.header.RequestHeader addNewRefRequestHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.grupobbva.pe.simr.ents.header.RequestHeader target = null;
            target = (com.grupobbva.pe.simr.ents.header.RequestHeader)get_store().add_element_user(REFREQUESTHEADER$0);
            return target;
        }
    }
    
    /**
     * Gets the "refUsuarioRequest" element
     */
    public com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequest getRefUsuarioRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequest target = null;
            target = (com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequest)get_store().find_element_user(REFUSUARIOREQUEST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "refUsuarioRequest" element
     */
    public void setRefUsuarioRequest(com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequest refUsuarioRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequest target = null;
            target = (com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequest)get_store().find_element_user(REFUSUARIOREQUEST$2, 0);
            if (target == null)
            {
                target = (com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequest)get_store().add_element_user(REFUSUARIOREQUEST$2);
            }
            target.set(refUsuarioRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "refUsuarioRequest" element
     */
    public com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequest addNewRefUsuarioRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequest target = null;
            target = (com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequest)get_store().add_element_user(REFUSUARIOREQUEST$2);
            return target;
        }
    }
}
