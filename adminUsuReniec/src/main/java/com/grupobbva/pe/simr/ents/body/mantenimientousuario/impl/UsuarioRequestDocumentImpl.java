/*
 * An XML document type.
 * Localname: usuarioRequest
 * Namespace: http://pe.grupobbva.com/SIMR/ents/body/mantenimientoUsuario
 * Java type: com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.grupobbva.pe.simr.ents.body.mantenimientousuario.impl;
/**
 * A document containing one usuarioRequest(@http://pe.grupobbva.com/SIMR/ents/body/mantenimientoUsuario) element.
 *
 * This is a complex type.
 */
public class UsuarioRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequestDocument
{
    
    public UsuarioRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USUARIOREQUEST$0 = 
        new javax.xml.namespace.QName("http://pe.grupobbva.com/SIMR/ents/body/mantenimientoUsuario", "usuarioRequest");
    
    
    /**
     * Gets the "usuarioRequest" element
     */
    public com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequest getUsuarioRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequest target = null;
            target = (com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequest)get_store().find_element_user(USUARIOREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usuarioRequest" element
     */
    public void setUsuarioRequest(com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequest usuarioRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequest target = null;
            target = (com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequest)get_store().find_element_user(USUARIOREQUEST$0, 0);
            if (target == null)
            {
                target = (com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequest)get_store().add_element_user(USUARIOREQUEST$0);
            }
            target.set(usuarioRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "usuarioRequest" element
     */
    public com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequest addNewUsuarioRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequest target = null;
            target = (com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequest)get_store().add_element_user(USUARIOREQUEST$0);
            return target;
        }
    }
}
