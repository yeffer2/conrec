/*
 * XML Type:  UsuarioRes
 * Namespace: http://ws.reniec.bbva.pe.com
 * Java type: com.pe.bbva.reniec.ws.UsuarioRes
 *
 * Automatically generated - do not modify.
 */
package com.pe.bbva.reniec.ws.impl;
/**
 * An XML UsuarioRes(@http://ws.reniec.bbva.pe.com).
 *
 * This is a complex type.
 */
public class UsuarioResImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.pe.bbva.reniec.ws.UsuarioRes
{
    
    public UsuarioResImpl(org.apache.xmlbeans.SchemaType sType)
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
        new javax.xml.namespace.QName("", "okDni");
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
     * Tests for nil "empresa" element
     */
    public boolean isNilEmpresa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPRESA$0, 0);
            if (target == null) return false;
            return target.isNil();
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
     * Nils the "empresa" element
     */
    public void setNilEmpresa()
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
            target.setNil();
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
     * Tests for nil "codigo" element
     */
    public boolean isNilCodigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGO$2, 0);
            if (target == null) return false;
            return target.isNil();
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
     * Nils the "codigo" element
     */
    public void setNilCodigo()
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
            target.setNil();
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
     * Tests for nil "mensaje" element
     */
    public boolean isNilMensaje()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MENSAJE$4, 0);
            if (target == null) return false;
            return target.isNil();
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
     * Nils the "mensaje" element
     */
    public void setNilMensaje()
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
            target.setNil();
        }
    }
    
    /**
     * Gets the "okDni" element
     */
    public java.lang.String getOkDni()
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
     * Gets (as xml) the "okDni" element
     */
    public org.apache.xmlbeans.XmlString xgetOkDni()
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
     * Tests for nil "okDni" element
     */
    public boolean isNilOkDni()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OKDNI$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "okDni" element
     */
    public void setOkDni(java.lang.String okDni)
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
            target.setStringValue(okDni);
        }
    }
    
    /**
     * Sets (as xml) the "okDni" element
     */
    public void xsetOkDni(org.apache.xmlbeans.XmlString okDni)
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
            target.set(okDni);
        }
    }
    
    /**
     * Nils the "okDni" element
     */
    public void setNilOkDni()
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
            target.setNil();
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
     * Tests for nil "okNombres" element
     */
    public boolean isNilOkNombres()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OKNOMBRES$8, 0);
            if (target == null) return false;
            return target.isNil();
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
     * Nils the "okNombres" element
     */
    public void setNilOkNombres()
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
            target.setNil();
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
     * Tests for nil "okApellidoPaterno" element
     */
    public boolean isNilOkApellidoPaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OKAPELLIDOPATERNO$10, 0);
            if (target == null) return false;
            return target.isNil();
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
     * Nils the "okApellidoPaterno" element
     */
    public void setNilOkApellidoPaterno()
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
            target.setNil();
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
     * Tests for nil "okApellidoMaterno" element
     */
    public boolean isNilOkApellidoMaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OKAPELLIDOMATERNO$12, 0);
            if (target == null) return false;
            return target.isNil();
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
     * Nils the "okApellidoMaterno" element
     */
    public void setNilOkApellidoMaterno()
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
            target.setNil();
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
     * Tests for nil "okFechaNacimiento" element
     */
    public boolean isNilOkFechaNacimiento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OKFECHANACIMIENTO$14, 0);
            if (target == null) return false;
            return target.isNil();
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
     * Nils the "okFechaNacimiento" element
     */
    public void setNilOkFechaNacimiento()
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
            target.setNil();
        }
    }
}
