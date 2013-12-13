/*
 * XML Type:  RefRequestHeader
 * Namespace: http://ws.reniec.bbva.pe.com
 * Java type: com.pe.bbva.reniec.ws.RefRequestHeader
 *
 * Automatically generated - do not modify.
 */
package com.pe.bbva.reniec.ws.impl;
/**
 * An XML RefRequestHeader(@http://ws.reniec.bbva.pe.com).
 *
 * This is a complex type.
 */
public class RefRequestHeaderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.pe.bbva.reniec.ws.RefRequestHeader
{
    
    public RefRequestHeaderImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CANAL$0 = 
        new javax.xml.namespace.QName("", "canal");
    private static final javax.xml.namespace.QName CODIGOAPLICACION$2 = 
        new javax.xml.namespace.QName("", "codigoAplicacion");
    private static final javax.xml.namespace.QName IDEMPRESA$4 = 
        new javax.xml.namespace.QName("", "idEmpresa");
    private static final javax.xml.namespace.QName USUARIO$6 = 
        new javax.xml.namespace.QName("", "usuario");
    private static final javax.xml.namespace.QName FECHAHORAENVIO$8 = 
        new javax.xml.namespace.QName("", "fechaHoraEnvio");
    private static final javax.xml.namespace.QName IDTRANSACCION$10 = 
        new javax.xml.namespace.QName("", "idTransaccion");
    private static final javax.xml.namespace.QName CODIGOINTERFAZ$12 = 
        new javax.xml.namespace.QName("", "codigoInterfaz");
    
    
    /**
     * Gets the "canal" element
     */
    public java.lang.String getCanal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "canal" element
     */
    public org.apache.xmlbeans.XmlString xgetCanal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CANAL$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "canal" element
     */
    public boolean isSetCanal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANAL$0) != 0;
        }
    }
    
    /**
     * Sets the "canal" element
     */
    public void setCanal(java.lang.String canal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CANAL$0);
            }
            target.setStringValue(canal);
        }
    }
    
    /**
     * Sets (as xml) the "canal" element
     */
    public void xsetCanal(org.apache.xmlbeans.XmlString canal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CANAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CANAL$0);
            }
            target.set(canal);
        }
    }
    
    /**
     * Unsets the "canal" element
     */
    public void unsetCanal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANAL$0, 0);
        }
    }
    
    /**
     * Gets the "codigoAplicacion" element
     */
    public java.lang.String getCodigoAplicacion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOAPLICACION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codigoAplicacion" element
     */
    public org.apache.xmlbeans.XmlString xgetCodigoAplicacion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOAPLICACION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "codigoAplicacion" element
     */
    public boolean isSetCodigoAplicacion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODIGOAPLICACION$2) != 0;
        }
    }
    
    /**
     * Sets the "codigoAplicacion" element
     */
    public void setCodigoAplicacion(java.lang.String codigoAplicacion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOAPLICACION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIGOAPLICACION$2);
            }
            target.setStringValue(codigoAplicacion);
        }
    }
    
    /**
     * Sets (as xml) the "codigoAplicacion" element
     */
    public void xsetCodigoAplicacion(org.apache.xmlbeans.XmlString codigoAplicacion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOAPLICACION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGOAPLICACION$2);
            }
            target.set(codigoAplicacion);
        }
    }
    
    /**
     * Unsets the "codigoAplicacion" element
     */
    public void unsetCodigoAplicacion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODIGOAPLICACION$2, 0);
        }
    }
    
    /**
     * Gets the "idEmpresa" element
     */
    public java.lang.String getIdEmpresa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDEMPRESA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "idEmpresa" element
     */
    public org.apache.xmlbeans.XmlString xgetIdEmpresa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDEMPRESA$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "idEmpresa" element
     */
    public boolean isSetIdEmpresa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDEMPRESA$4) != 0;
        }
    }
    
    /**
     * Sets the "idEmpresa" element
     */
    public void setIdEmpresa(java.lang.String idEmpresa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDEMPRESA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDEMPRESA$4);
            }
            target.setStringValue(idEmpresa);
        }
    }
    
    /**
     * Sets (as xml) the "idEmpresa" element
     */
    public void xsetIdEmpresa(org.apache.xmlbeans.XmlString idEmpresa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDEMPRESA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDEMPRESA$4);
            }
            target.set(idEmpresa);
        }
    }
    
    /**
     * Unsets the "idEmpresa" element
     */
    public void unsetIdEmpresa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDEMPRESA$4, 0);
        }
    }
    
    /**
     * Gets the "usuario" element
     */
    public java.lang.String getUsuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "usuario" element
     */
    public org.apache.xmlbeans.XmlString xgetUsuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIO$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "usuario" element
     */
    public boolean isSetUsuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USUARIO$6) != 0;
        }
    }
    
    /**
     * Sets the "usuario" element
     */
    public void setUsuario(java.lang.String usuario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USUARIO$6);
            }
            target.setStringValue(usuario);
        }
    }
    
    /**
     * Sets (as xml) the "usuario" element
     */
    public void xsetUsuario(org.apache.xmlbeans.XmlString usuario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USUARIO$6);
            }
            target.set(usuario);
        }
    }
    
    /**
     * Unsets the "usuario" element
     */
    public void unsetUsuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USUARIO$6, 0);
        }
    }
    
    /**
     * Gets the "fechaHoraEnvio" element
     */
    public java.lang.String getFechaHoraEnvio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHAHORAENVIO$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fechaHoraEnvio" element
     */
    public org.apache.xmlbeans.XmlString xgetFechaHoraEnvio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FECHAHORAENVIO$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "fechaHoraEnvio" element
     */
    public boolean isSetFechaHoraEnvio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FECHAHORAENVIO$8) != 0;
        }
    }
    
    /**
     * Sets the "fechaHoraEnvio" element
     */
    public void setFechaHoraEnvio(java.lang.String fechaHoraEnvio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHAHORAENVIO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FECHAHORAENVIO$8);
            }
            target.setStringValue(fechaHoraEnvio);
        }
    }
    
    /**
     * Sets (as xml) the "fechaHoraEnvio" element
     */
    public void xsetFechaHoraEnvio(org.apache.xmlbeans.XmlString fechaHoraEnvio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FECHAHORAENVIO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FECHAHORAENVIO$8);
            }
            target.set(fechaHoraEnvio);
        }
    }
    
    /**
     * Unsets the "fechaHoraEnvio" element
     */
    public void unsetFechaHoraEnvio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FECHAHORAENVIO$8, 0);
        }
    }
    
    /**
     * Gets the "idTransaccion" element
     */
    public java.lang.String getIdTransaccion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDTRANSACCION$10, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDTRANSACCION$10, 0);
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
            return get_store().count_elements(IDTRANSACCION$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDTRANSACCION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDTRANSACCION$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDTRANSACCION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDTRANSACCION$10);
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
            get_store().remove_element(IDTRANSACCION$10, 0);
        }
    }
    
    /**
     * Gets the "codigoInterfaz" element
     */
    public java.lang.String getCodigoInterfaz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOINTERFAZ$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codigoInterfaz" element
     */
    public org.apache.xmlbeans.XmlString xgetCodigoInterfaz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOINTERFAZ$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "codigoInterfaz" element
     */
    public boolean isSetCodigoInterfaz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODIGOINTERFAZ$12) != 0;
        }
    }
    
    /**
     * Sets the "codigoInterfaz" element
     */
    public void setCodigoInterfaz(java.lang.String codigoInterfaz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOINTERFAZ$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIGOINTERFAZ$12);
            }
            target.setStringValue(codigoInterfaz);
        }
    }
    
    /**
     * Sets (as xml) the "codigoInterfaz" element
     */
    public void xsetCodigoInterfaz(org.apache.xmlbeans.XmlString codigoInterfaz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOINTERFAZ$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGOINTERFAZ$12);
            }
            target.set(codigoInterfaz);
        }
    }
    
    /**
     * Unsets the "codigoInterfaz" element
     */
    public void unsetCodigoInterfaz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODIGOINTERFAZ$12, 0);
        }
    }
}
