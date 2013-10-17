/*
 * An XML document type.
 * Localname: requestHeader
 * Namespace: http://pe.grupobbva.com/SIMR/ents/header
 * Java type: com.grupobbva.pe.simr.ents.header.RequestHeaderDocument
 *
 * Automatically generated - do not modify.
 */
package com.grupobbva.pe.simr.ents.header.impl;
/**
 * A document containing one requestHeader(@http://pe.grupobbva.com/SIMR/ents/header) element.
 *
 * This is a complex type.
 */
public class RequestHeaderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.grupobbva.pe.simr.ents.header.RequestHeaderDocument
{
    
    public RequestHeaderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTHEADER$0 = 
        new javax.xml.namespace.QName("http://pe.grupobbva.com/SIMR/ents/header", "requestHeader");
    
    
    /**
     * Gets the "requestHeader" element
     */
    public com.grupobbva.pe.simr.ents.header.RequestHeader getRequestHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.grupobbva.pe.simr.ents.header.RequestHeader target = null;
            target = (com.grupobbva.pe.simr.ents.header.RequestHeader)get_store().find_element_user(REQUESTHEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "requestHeader" element
     */
    public void setRequestHeader(com.grupobbva.pe.simr.ents.header.RequestHeader requestHeader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.grupobbva.pe.simr.ents.header.RequestHeader target = null;
            target = (com.grupobbva.pe.simr.ents.header.RequestHeader)get_store().find_element_user(REQUESTHEADER$0, 0);
            if (target == null)
            {
                target = (com.grupobbva.pe.simr.ents.header.RequestHeader)get_store().add_element_user(REQUESTHEADER$0);
            }
            target.set(requestHeader);
        }
    }
    
    /**
     * Appends and returns a new empty "requestHeader" element
     */
    public com.grupobbva.pe.simr.ents.header.RequestHeader addNewRequestHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.grupobbva.pe.simr.ents.header.RequestHeader target = null;
            target = (com.grupobbva.pe.simr.ents.header.RequestHeader)get_store().add_element_user(REQUESTHEADER$0);
            return target;
        }
    }
}
