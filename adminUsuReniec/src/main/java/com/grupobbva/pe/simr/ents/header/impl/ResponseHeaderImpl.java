/*
 * XML Type:  ResponseHeader
 * Namespace: http://pe.grupobbva.com/SIMR/ents/header
 * Java type: com.grupobbva.pe.simr.ents.header.ResponseHeader
 *
 * Automatically generated - do not modify.
 */
package com.grupobbva.pe.simr.ents.header.impl;
/**
 * An XML ResponseHeader(@http://pe.grupobbva.com/SIMR/ents/header).
 *
 * This is a complex type.
 */
public class ResponseHeaderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.grupobbva.pe.simr.ents.header.ResponseHeader
{
    
    public ResponseHeaderImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDTRANSACCION$0 = 
        new javax.xml.namespace.QName("", "idTransaccion");
    private static final javax.xml.namespace.QName CODIGORESPUESTA$2 = 
        new javax.xml.namespace.QName("", "codigoRespuesta");
    private static final javax.xml.namespace.QName MENSAJERESPUESTA$4 = 
        new javax.xml.namespace.QName("", "mensajeRespuesta");
    
    
    /**
     * Gets the "idTransaccion" element
     */
    public java.lang.String getIdTransaccion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDTRANSACCION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "idTransaccion" element
     */
    public org.apache.xmlbeans.XmlString xgetIdTransaccion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDTRANSACCION$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "idTransaccion" element
     */
    public boolean isSetIdTransaccion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDTRANSACCION$0) != 0;
        }
    }
    
    /**
     * Sets the "idTransaccion" element
     */
    public void setIdTransaccion(java.lang.String idTransaccion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDTRANSACCION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDTRANSACCION$0);
            }
            target.setStringValue(idTransaccion);
        }
    }
    
    /**
     * Sets (as xml) the "idTransaccion" element
     */
    public void xsetIdTransaccion(org.apache.xmlbeans.XmlString idTransaccion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDTRANSACCION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDTRANSACCION$0);
            }
            target.set(idTransaccion);
        }
    }
    
    /**
     * Unsets the "idTransaccion" element
     */
    public void unsetIdTransaccion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDTRANSACCION$0, 0);
        }
    }
    
    /**
     * Gets the "codigoRespuesta" element
     */
    public java.lang.String getCodigoRespuesta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGORESPUESTA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codigoRespuesta" element
     */
    public org.apache.xmlbeans.XmlString xgetCodigoRespuesta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGORESPUESTA$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "codigoRespuesta" element
     */
    public boolean isSetCodigoRespuesta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODIGORESPUESTA$2) != 0;
        }
    }
    
    /**
     * Sets the "codigoRespuesta" element
     */
    public void setCodigoRespuesta(java.lang.String codigoRespuesta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGORESPUESTA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIGORESPUESTA$2);
            }
            target.setStringValue(codigoRespuesta);
        }
    }
    
    /**
     * Sets (as xml) the "codigoRespuesta" element
     */
    public void xsetCodigoRespuesta(org.apache.xmlbeans.XmlString codigoRespuesta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGORESPUESTA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGORESPUESTA$2);
            }
            target.set(codigoRespuesta);
        }
    }
    
    /**
     * Unsets the "codigoRespuesta" element
     */
    public void unsetCodigoRespuesta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODIGORESPUESTA$2, 0);
        }
    }
    
    /**
     * Gets the "mensajeRespuesta" element
     */
    public java.lang.String getMensajeRespuesta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENSAJERESPUESTA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mensajeRespuesta" element
     */
    public org.apache.xmlbeans.XmlString xgetMensajeRespuesta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MENSAJERESPUESTA$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "mensajeRespuesta" element
     */
    public boolean isSetMensajeRespuesta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MENSAJERESPUESTA$4) != 0;
        }
    }
    
    /**
     * Sets the "mensajeRespuesta" element
     */
    public void setMensajeRespuesta(java.lang.String mensajeRespuesta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENSAJERESPUESTA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MENSAJERESPUESTA$4);
            }
            target.setStringValue(mensajeRespuesta);
        }
    }
    
    /**
     * Sets (as xml) the "mensajeRespuesta" element
     */
    public void xsetMensajeRespuesta(org.apache.xmlbeans.XmlString mensajeRespuesta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MENSAJERESPUESTA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MENSAJERESPUESTA$4);
            }
            target.set(mensajeRespuesta);
        }
    }
    
    /**
     * Unsets the "mensajeRespuesta" element
     */
    public void unsetMensajeRespuesta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MENSAJERESPUESTA$4, 0);
        }
    }
}
