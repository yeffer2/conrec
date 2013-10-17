/*
 * XML Type:  usuarioResponse
 * Namespace: http://pe.grupobbva.com/SIMR/service/message
 * Java type: com.grupobbva.pe.simr.service.message.UsuarioResponse
 *
 * Automatically generated - do not modify.
 */
package com.grupobbva.pe.simr.service.message.impl;
/**
 * An XML usuarioResponse(@http://pe.grupobbva.com/SIMR/service/message).
 *
 * This is a complex type.
 */
public class UsuarioResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.grupobbva.pe.simr.service.message.UsuarioResponse
{
    
    public UsuarioResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFRESPONSEHEADER$0 = 
        new javax.xml.namespace.QName("", "refResponseHeader");
    private static final javax.xml.namespace.QName REFUSUARIORESPONSE$2 = 
        new javax.xml.namespace.QName("", "refUsuarioResponse");
    
    
    /**
     * Gets the "refResponseHeader" element
     */
    public com.grupobbva.pe.simr.ents.header.ResponseHeader getRefResponseHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.grupobbva.pe.simr.ents.header.ResponseHeader target = null;
            target = (com.grupobbva.pe.simr.ents.header.ResponseHeader)get_store().find_element_user(REFRESPONSEHEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "refResponseHeader" element
     */
    public void setRefResponseHeader(com.grupobbva.pe.simr.ents.header.ResponseHeader refResponseHeader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.grupobbva.pe.simr.ents.header.ResponseHeader target = null;
            target = (com.grupobbva.pe.simr.ents.header.ResponseHeader)get_store().find_element_user(REFRESPONSEHEADER$0, 0);
            if (target == null)
            {
                target = (com.grupobbva.pe.simr.ents.header.ResponseHeader)get_store().add_element_user(REFRESPONSEHEADER$0);
            }
            target.set(refResponseHeader);
        }
    }
    
    /**
     * Appends and returns a new empty "refResponseHeader" element
     */
    public com.grupobbva.pe.simr.ents.header.ResponseHeader addNewRefResponseHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.grupobbva.pe.simr.ents.header.ResponseHeader target = null;
            target = (com.grupobbva.pe.simr.ents.header.ResponseHeader)get_store().add_element_user(REFRESPONSEHEADER$0);
            return target;
        }
    }
    
    /**
     * Gets the "refUsuarioResponse" element
     */
    public com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioResponse getRefUsuarioResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioResponse target = null;
            target = (com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioResponse)get_store().find_element_user(REFUSUARIORESPONSE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "refUsuarioResponse" element
     */
    public void setRefUsuarioResponse(com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioResponse refUsuarioResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioResponse target = null;
            target = (com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioResponse)get_store().find_element_user(REFUSUARIORESPONSE$2, 0);
            if (target == null)
            {
                target = (com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioResponse)get_store().add_element_user(REFUSUARIORESPONSE$2);
            }
            target.set(refUsuarioResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "refUsuarioResponse" element
     */
    public com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioResponse addNewRefUsuarioResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioResponse target = null;
            target = (com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioResponse)get_store().add_element_user(REFUSUARIORESPONSE$2);
            return target;
        }
    }
}
