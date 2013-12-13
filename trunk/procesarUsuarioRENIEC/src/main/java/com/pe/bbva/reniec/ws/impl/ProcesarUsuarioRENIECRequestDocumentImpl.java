/*
 * An XML document type.
 * Localname: procesarUsuarioRENIECRequest
 * Namespace: http://ws.reniec.bbva.pe.com
 * Java type: com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.pe.bbva.reniec.ws.impl;
/**
 * A document containing one procesarUsuarioRENIECRequest(@http://ws.reniec.bbva.pe.com) element.
 *
 * This is a complex type.
 */
public class ProcesarUsuarioRENIECRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument
{
    
    public ProcesarUsuarioRENIECRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROCESARUSUARIORENIECREQUEST$0 = 
        new javax.xml.namespace.QName("http://ws.reniec.bbva.pe.com", "procesarUsuarioRENIECRequest");
    
    
    /**
     * Gets the "procesarUsuarioRENIECRequest" element
     */
    public com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument.ProcesarUsuarioRENIECRequest getProcesarUsuarioRENIECRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument.ProcesarUsuarioRENIECRequest target = null;
            target = (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument.ProcesarUsuarioRENIECRequest)get_store().find_element_user(PROCESARUSUARIORENIECREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "procesarUsuarioRENIECRequest" element
     */
    public void setProcesarUsuarioRENIECRequest(com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument.ProcesarUsuarioRENIECRequest procesarUsuarioRENIECRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument.ProcesarUsuarioRENIECRequest target = null;
            target = (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument.ProcesarUsuarioRENIECRequest)get_store().find_element_user(PROCESARUSUARIORENIECREQUEST$0, 0);
            if (target == null)
            {
                target = (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument.ProcesarUsuarioRENIECRequest)get_store().add_element_user(PROCESARUSUARIORENIECREQUEST$0);
            }
            target.set(procesarUsuarioRENIECRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "procesarUsuarioRENIECRequest" element
     */
    public com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument.ProcesarUsuarioRENIECRequest addNewProcesarUsuarioRENIECRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument.ProcesarUsuarioRENIECRequest target = null;
            target = (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument.ProcesarUsuarioRENIECRequest)get_store().add_element_user(PROCESARUSUARIORENIECREQUEST$0);
            return target;
        }
    }
    /**
     * An XML procesarUsuarioRENIECRequest(@http://ws.reniec.bbva.pe.com).
     *
     * This is a complex type.
     */
    public static class ProcesarUsuarioRENIECRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument.ProcesarUsuarioRENIECRequest
    {
        
        public ProcesarUsuarioRENIECRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REFREQUESTHEADER$0 = 
            new javax.xml.namespace.QName("", "refRequestHeader");
        private static final javax.xml.namespace.QName REFPROCESARUSUARIORENIECREQUEST$2 = 
            new javax.xml.namespace.QName("", "refprocesarUsuarioRENIECRequest");
        
        
        /**
         * Gets the "refRequestHeader" element
         */
        public com.pe.bbva.reniec.ws.RefRequestHeader getRefRequestHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.pe.bbva.reniec.ws.RefRequestHeader target = null;
                target = (com.pe.bbva.reniec.ws.RefRequestHeader)get_store().find_element_user(REFREQUESTHEADER$0, 0);
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
        public void setRefRequestHeader(com.pe.bbva.reniec.ws.RefRequestHeader refRequestHeader)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.pe.bbva.reniec.ws.RefRequestHeader target = null;
                target = (com.pe.bbva.reniec.ws.RefRequestHeader)get_store().find_element_user(REFREQUESTHEADER$0, 0);
                if (target == null)
                {
                    target = (com.pe.bbva.reniec.ws.RefRequestHeader)get_store().add_element_user(REFREQUESTHEADER$0);
                }
                target.set(refRequestHeader);
            }
        }
        
        /**
         * Appends and returns a new empty "refRequestHeader" element
         */
        public com.pe.bbva.reniec.ws.RefRequestHeader addNewRefRequestHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.pe.bbva.reniec.ws.RefRequestHeader target = null;
                target = (com.pe.bbva.reniec.ws.RefRequestHeader)get_store().add_element_user(REFREQUESTHEADER$0);
                return target;
            }
        }
        
        /**
         * Gets the "refprocesarUsuarioRENIECRequest" element
         */
        public com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest getRefprocesarUsuarioRENIECRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest target = null;
                target = (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest)get_store().find_element_user(REFPROCESARUSUARIORENIECREQUEST$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "refprocesarUsuarioRENIECRequest" element
         */
        public boolean isNilRefprocesarUsuarioRENIECRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest target = null;
                target = (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest)get_store().find_element_user(REFPROCESARUSUARIORENIECREQUEST$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "refprocesarUsuarioRENIECRequest" element
         */
        public void setRefprocesarUsuarioRENIECRequest(com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest refprocesarUsuarioRENIECRequest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest target = null;
                target = (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest)get_store().find_element_user(REFPROCESARUSUARIORENIECREQUEST$2, 0);
                if (target == null)
                {
                    target = (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest)get_store().add_element_user(REFPROCESARUSUARIORENIECREQUEST$2);
                }
                target.set(refprocesarUsuarioRENIECRequest);
            }
        }
        
        /**
         * Appends and returns a new empty "refprocesarUsuarioRENIECRequest" element
         */
        public com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest addNewRefprocesarUsuarioRENIECRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest target = null;
                target = (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest)get_store().add_element_user(REFPROCESARUSUARIORENIECREQUEST$2);
                return target;
            }
        }
        
        /**
         * Nils the "refprocesarUsuarioRENIECRequest" element
         */
        public void setNilRefprocesarUsuarioRENIECRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest target = null;
                target = (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest)get_store().find_element_user(REFPROCESARUSUARIORENIECREQUEST$2, 0);
                if (target == null)
                {
                    target = (com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest)get_store().add_element_user(REFPROCESARUSUARIORENIECREQUEST$2);
                }
                target.setNil();
            }
        }
    }
}
