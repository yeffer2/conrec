/*
 * An XML document type.
 * Localname: responseHeader
 * Namespace: http://pe.grupobbva.com/SIMR/ents/header
 * Java type: com.grupobbva.pe.simr.ents.header.ResponseHeaderDocument
 *
 * Automatically generated - do not modify.
 */
package com.grupobbva.pe.simr.ents.header.impl;
/**
 * A document containing one responseHeader(@http://pe.grupobbva.com/SIMR/ents/header) element.
 *
 * This is a complex type.
 */
public class ResponseHeaderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.grupobbva.pe.simr.ents.header.ResponseHeaderDocument
{
    
    public ResponseHeaderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSEHEADER$0 = 
        new javax.xml.namespace.QName("http://pe.grupobbva.com/SIMR/ents/header", "responseHeader");
    
    
    /**
     * Gets the "responseHeader" element
     */
    public com.grupobbva.pe.simr.ents.header.ResponseHeader getResponseHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.grupobbva.pe.simr.ents.header.ResponseHeader target = null;
            target = (com.grupobbva.pe.simr.ents.header.ResponseHeader)get_store().find_element_user(RESPONSEHEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "responseHeader" element
     */
    public void setResponseHeader(com.grupobbva.pe.simr.ents.header.ResponseHeader responseHeader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.grupobbva.pe.simr.ents.header.ResponseHeader target = null;
            target = (com.grupobbva.pe.simr.ents.header.ResponseHeader)get_store().find_element_user(RESPONSEHEADER$0, 0);
            if (target == null)
            {
                target = (com.grupobbva.pe.simr.ents.header.ResponseHeader)get_store().add_element_user(RESPONSEHEADER$0);
            }
            target.set(responseHeader);
        }
    }
    
    /**
     * Appends and returns a new empty "responseHeader" element
     */
    public com.grupobbva.pe.simr.ents.header.ResponseHeader addNewResponseHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.grupobbva.pe.simr.ents.header.ResponseHeader target = null;
            target = (com.grupobbva.pe.simr.ents.header.ResponseHeader)get_store().add_element_user(RESPONSEHEADER$0);
            return target;
        }
    }
}
