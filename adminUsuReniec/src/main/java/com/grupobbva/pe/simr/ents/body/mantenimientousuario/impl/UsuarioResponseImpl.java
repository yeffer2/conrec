/*
 * XML Type:  UsuarioResponse
 * Namespace: http://pe.grupobbva.com/SIMR/ents/body/mantenimientoUsuario
 * Java type: com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioResponse
 *
 * Automatically generated - do not modify.
 */
package com.grupobbva.pe.simr.ents.body.mantenimientousuario.impl;
/**
 * An XML UsuarioResponse(@http://pe.grupobbva.com/SIMR/ents/body/mantenimientoUsuario).
 *
 * This is a complex type.
 */
public class UsuarioResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioResponse
{
    
    public UsuarioResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMPRESA$0 = 
        new javax.xml.namespace.QName("", "empresa");
    private static final javax.xml.namespace.QName CODIGO$2 = 
        new javax.xml.namespace.QName("", "codigo");
    private static final javax.xml.namespace.QName MENSAJE$4 = 
        new javax.xml.namespace.QName("", "mensaje");
    private static final javax.xml.namespace.QName OKDNI$6 = 
        new javax.xml.namespace.QName("", "okDNI");
    private static final javax.xml.namespace.QName OKNOMBRES$8 = 
        new javax.xml.namespace.QName("", "okNombres");
    private static final javax.xml.namespace.QName OKAPELLIDOPATERNO$10 = 
        new javax.xml.namespace.QName("", "okApellidoPaterno");
    private static final javax.xml.namespace.QName OKAPELLIDOMATERNO$12 = 
        new javax.xml.namespace.QName("", "okApellidoMaterno");
    private static final javax.xml.namespace.QName OKFECHANACIMIENTO$14 = 
        new javax.xml.namespace.QName("", "okFechaNacimiento");
    
    
    /**
     * Gets the "empresa" element
     */
    public java.lang.String getEmpresa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPRESA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "empresa" element
     */
    public org.apache.xmlbeans.XmlString xgetEmpresa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPRESA$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "empresa" element
     */
    public boolean isSetEmpresa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMPRESA$0) != 0;
        }
    }
    
    /**
     * Sets the "empresa" element
     */
    public void setEmpresa(java.lang.String empresa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPRESA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMPRESA$0);
            }
            target.setStringValue(empresa);
        }
    }
    
    /**
     * Sets (as xml) the "empresa" element
     */
    public void xsetEmpresa(org.apache.xmlbeans.XmlString empresa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPRESA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMPRESA$0);
            }
            target.set(empresa);
        }
    }
    
    /**
     * Unsets the "empresa" element
     */
    public void unsetEmpresa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMPRESA$0, 0);
        }
    }
    
    /**
     * Gets the "codigo" element
     */
    public java.lang.String getCodigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codigo" element
     */
    public org.apache.xmlbeans.XmlString xgetCodigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "codigo" element
     */
    public boolean isSetCodigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODIGO$2) != 0;
        }
    }
    
    /**
     * Sets the "codigo" element
     */
    public void setCodigo(java.lang.String codigo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIGO$2);
            }
            target.setStringValue(codigo);
        }
    }
    
    /**
     * Sets (as xml) the "codigo" element
     */
    public void xsetCodigo(org.apache.xmlbeans.XmlString codigo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGO$2);
            }
            target.set(codigo);
        }
    }
    
    /**
     * Unsets the "codigo" element
     */
    public void unsetCodigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODIGO$2, 0);
        }
    }
    
    /**
     * Gets the "mensaje" element
     */
    public java.lang.String getMensaje()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENSAJE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mensaje" element
     */
    public org.apache.xmlbeans.XmlString xgetMensaje()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MENSAJE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "mensaje" element
     */
    public boolean isSetMensaje()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MENSAJE$4) != 0;
        }
    }
    
    /**
     * Sets the "mensaje" element
     */
    public void setMensaje(java.lang.String mensaje)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENSAJE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MENSAJE$4);
            }
            target.setStringValue(mensaje);
        }
    }
    
    /**
     * Sets (as xml) the "mensaje" element
     */
    public void xsetMensaje(org.apache.xmlbeans.XmlString mensaje)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MENSAJE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MENSAJE$4);
            }
            target.set(mensaje);
        }
    }
    
    /**
     * Unsets the "mensaje" element
     */
    public void unsetMensaje()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MENSAJE$4, 0);
        }
    }
    
    /**
     * Gets the "okDNI" element
     */
    public java.lang.String getOkDNI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OKDNI$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "okDNI" element
     */
    public org.apache.xmlbeans.XmlString xgetOkDNI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OKDNI$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "okDNI" element
     */
    public boolean isSetOkDNI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OKDNI$6) != 0;
        }
    }
    
    /**
     * Sets the "okDNI" element
     */
    public void setOkDNI(java.lang.String okDNI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OKDNI$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OKDNI$6);
            }
            target.setStringValue(okDNI);
        }
    }
    
    /**
     * Sets (as xml) the "okDNI" element
     */
    public void xsetOkDNI(org.apache.xmlbeans.XmlString okDNI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OKDNI$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OKDNI$6);
            }
            target.set(okDNI);
        }
    }
    
    /**
     * Unsets the "okDNI" element
     */
    public void unsetOkDNI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OKDNI$6, 0);
        }
    }
    
    /**
     * Gets the "okNombres" element
     */
    public java.lang.String getOkNombres()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OKNOMBRES$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "okNombres" element
     */
    public org.apache.xmlbeans.XmlString xgetOkNombres()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OKNOMBRES$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "okNombres" element
     */
    public boolean isSetOkNombres()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OKNOMBRES$8) != 0;
        }
    }
    
    /**
     * Sets the "okNombres" element
     */
    public void setOkNombres(java.lang.String okNombres)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OKNOMBRES$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OKNOMBRES$8);
            }
            target.setStringValue(okNombres);
        }
    }
    
    /**
     * Sets (as xml) the "okNombres" element
     */
    public void xsetOkNombres(org.apache.xmlbeans.XmlString okNombres)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OKNOMBRES$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OKNOMBRES$8);
            }
            target.set(okNombres);
        }
    }
    
    /**
     * Unsets the "okNombres" element
     */
    public void unsetOkNombres()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OKNOMBRES$8, 0);
        }
    }
    
    /**
     * Gets the "okApellidoPaterno" element
     */
    public java.lang.String getOkApellidoPaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OKAPELLIDOPATERNO$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "okApellidoPaterno" element
     */
    public org.apache.xmlbeans.XmlString xgetOkApellidoPaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OKAPELLIDOPATERNO$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "okApellidoPaterno" element
     */
    public boolean isSetOkApellidoPaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OKAPELLIDOPATERNO$10) != 0;
        }
    }
    
    /**
     * Sets the "okApellidoPaterno" element
     */
    public void setOkApellidoPaterno(java.lang.String okApellidoPaterno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OKAPELLIDOPATERNO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OKAPELLIDOPATERNO$10);
            }
            target.setStringValue(okApellidoPaterno);
        }
    }
    
    /**
     * Sets (as xml) the "okApellidoPaterno" element
     */
    public void xsetOkApellidoPaterno(org.apache.xmlbeans.XmlString okApellidoPaterno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OKAPELLIDOPATERNO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OKAPELLIDOPATERNO$10);
            }
            target.set(okApellidoPaterno);
        }
    }
    
    /**
     * Unsets the "okApellidoPaterno" element
     */
    public void unsetOkApellidoPaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OKAPELLIDOPATERNO$10, 0);
        }
    }
    
    /**
     * Gets the "okApellidoMaterno" element
     */
    public java.lang.String getOkApellidoMaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OKAPELLIDOMATERNO$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "okApellidoMaterno" element
     */
    public org.apache.xmlbeans.XmlString xgetOkApellidoMaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OKAPELLIDOMATERNO$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "okApellidoMaterno" element
     */
    public boolean isSetOkApellidoMaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OKAPELLIDOMATERNO$12) != 0;
        }
    }
    
    /**
     * Sets the "okApellidoMaterno" element
     */
    public void setOkApellidoMaterno(java.lang.String okApellidoMaterno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OKAPELLIDOMATERNO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OKAPELLIDOMATERNO$12);
            }
            target.setStringValue(okApellidoMaterno);
        }
    }
    
    /**
     * Sets (as xml) the "okApellidoMaterno" element
     */
    public void xsetOkApellidoMaterno(org.apache.xmlbeans.XmlString okApellidoMaterno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OKAPELLIDOMATERNO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OKAPELLIDOMATERNO$12);
            }
            target.set(okApellidoMaterno);
        }
    }
    
    /**
     * Unsets the "okApellidoMaterno" element
     */
    public void unsetOkApellidoMaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OKAPELLIDOMATERNO$12, 0);
        }
    }
    
    /**
     * Gets the "okFechaNacimiento" element
     */
    public java.lang.String getOkFechaNacimiento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OKFECHANACIMIENTO$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "okFechaNacimiento" element
     */
    public org.apache.xmlbeans.XmlString xgetOkFechaNacimiento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OKFECHANACIMIENTO$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "okFechaNacimiento" element
     */
    public boolean isSetOkFechaNacimiento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OKFECHANACIMIENTO$14) != 0;
        }
    }
    
    /**
     * Sets the "okFechaNacimiento" element
     */
    public void setOkFechaNacimiento(java.lang.String okFechaNacimiento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OKFECHANACIMIENTO$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OKFECHANACIMIENTO$14);
            }
            target.setStringValue(okFechaNacimiento);
        }
    }
    
    /**
     * Sets (as xml) the "okFechaNacimiento" element
     */
    public void xsetOkFechaNacimiento(org.apache.xmlbeans.XmlString okFechaNacimiento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OKFECHANACIMIENTO$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OKFECHANACIMIENTO$14);
            }
            target.set(okFechaNacimiento);
        }
    }
    
    /**
     * Unsets the "okFechaNacimiento" element
     */
    public void unsetOkFechaNacimiento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OKFECHANACIMIENTO$14, 0);
        }
    }
}
