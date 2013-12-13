/*
 * XML Type:  UsuarioResponse
 * Namespace: http://ws.reniec.bbva.pe.com
 * Java type: com.pe.bbva.reniec.ws.UsuarioResponse
 *
 * Automatically generated - do not modify.
 */
package com.pe.bbva.reniec.ws.impl;
/**
 * An XML UsuarioResponse(@http://ws.reniec.bbva.pe.com).
 *
 * This is a complex type.
 */
public class UsuarioResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.pe.bbva.reniec.ws.UsuarioResponse
{
    
    public UsuarioResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFRESPONSEHEADER$0 = 
        new javax.xml.namespace.QName("", "refResponseHeader");
    private static final javax.xml.namespace.QName REFUSUARIOWSRESPONSE$2 = 
        new javax.xml.namespace.QName("", "refUsuarioWSResponse");
    
    
    /**
     * Gets the "refResponseHeader" element
     */
    public com.pe.bbva.reniec.ws.RefResponseHeader getRefResponseHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.pe.bbva.reniec.ws.RefResponseHeader target = null;
            target = (com.pe.bbva.reniec.ws.RefResponseHeader)get_store().find_element_user(REFRESPONSEHEADER$0, 0);
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
    public void setRefResponseHeader(com.pe.bbva.reniec.ws.RefResponseHeader refResponseHeader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.pe.bbva.reniec.ws.RefResponseHeader target = null;
            target = (com.pe.bbva.reniec.ws.RefResponseHeader)get_store().find_element_user(REFRESPONSEHEADER$0, 0);
            if (target == null)
            {
                target = (com.pe.bbva.reniec.ws.RefResponseHeader)get_store().add_element_user(REFRESPONSEHEADER$0);
            }
            target.set(refResponseHeader);
        }
    }
    
    /**
     * Appends and returns a new empty "refResponseHeader" element
     */
    public com.pe.bbva.reniec.ws.RefResponseHeader addNewRefResponseHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.pe.bbva.reniec.ws.RefResponseHeader target = null;
            target = (com.pe.bbva.reniec.ws.RefResponseHeader)get_store().add_element_user(REFRESPONSEHEADER$0);
            return target;
        }
    }
    
    /**
     * Gets the "refUsuarioWSResponse" element
     */
    public com.pe.bbva.reniec.ws.UsuarioRes getRefUsuarioWSResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.pe.bbva.reniec.ws.UsuarioRes target = null;
            target = (com.pe.bbva.reniec.ws.UsuarioRes)get_store().find_element_user(REFUSUARIOWSRESPONSE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "refUsuarioWSResponse" element
     */
    public boolean isNilRefUsuarioWSResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.pe.bbva.reniec.ws.UsuarioRes target = null;
            target = (com.pe.bbva.reniec.ws.UsuarioRes)get_store().find_element_user(REFUSUARIOWSRESPONSE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "refUsuarioWSResponse" element
     */
    public void setRefUsuarioWSResponse(com.pe.bbva.reniec.ws.UsuarioRes refUsuarioWSResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.pe.bbva.reniec.ws.UsuarioRes target = null;
            target = (com.pe.bbva.reniec.ws.UsuarioRes)get_store().find_element_user(REFUSUARIOWSRESPONSE$2, 0);
            if (target == null)
            {
                target = (com.pe.bbva.reniec.ws.UsuarioRes)get_store().add_element_user(REFUSUARIOWSRESPONSE$2);
            }
            target.set(refUsuarioWSResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "refUsuarioWSResponse" element
     */
    public com.pe.bbva.reniec.ws.UsuarioRes addNewRefUsuarioWSResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.pe.bbva.reniec.ws.UsuarioRes target = null;
            target = (com.pe.bbva.reniec.ws.UsuarioRes)get_store().add_element_user(REFUSUARIOWSRESPONSE$2);
            return target;
        }
    }
    
    /**
     * Nils the "refUsuarioWSResponse" element
     */
    public void setNilRefUsuarioWSResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.pe.bbva.reniec.ws.UsuarioRes target = null;
            target = (com.pe.bbva.reniec.ws.UsuarioRes)get_store().find_element_user(REFUSUARIOWSRESPONSE$2, 0);
            if (target == null)
            {
                target = (com.pe.bbva.reniec.ws.UsuarioRes)get_store().add_element_user(REFUSUARIOWSRESPONSE$2);
            }
            target.setNil();
        }
    }
}
