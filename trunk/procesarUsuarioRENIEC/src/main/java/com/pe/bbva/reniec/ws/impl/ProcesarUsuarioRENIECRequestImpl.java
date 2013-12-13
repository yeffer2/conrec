/*
 * XML Type:  ProcesarUsuarioRENIECRequest
 * Namespace: http://ws.reniec.bbva.pe.com
 * Java type: com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest
 *
 * Automatically generated - do not modify.
 */
package com.pe.bbva.reniec.ws.impl;
/**
 * An XML ProcesarUsuarioRENIECRequest(@http://ws.reniec.bbva.pe.com).
 *
 * This is a complex type.
 */
public class ProcesarUsuarioRENIECRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest
{
    
    public ProcesarUsuarioRENIECRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMPRESA$0 = 
        new javax.xml.namespace.QName("", "empresa");
    private static final javax.xml.namespace.QName CODIGO$2 = 
        new javax.xml.namespace.QName("", "codigo");
    private static final javax.xml.namespace.QName NOMBRES$4 = 
        new javax.xml.namespace.QName("", "nombres");
    private static final javax.xml.namespace.QName APELLIDOPATERNO$6 = 
        new javax.xml.namespace.QName("", "apellidoPaterno");
    private static final javax.xml.namespace.QName APELLIDOMATERNO$8 = 
        new javax.xml.namespace.QName("", "apellidoMaterno");
    private static final javax.xml.namespace.QName FECHANACIMIENTO$10 = 
        new javax.xml.namespace.QName("", "fechaNacimiento");
    private static final javax.xml.namespace.QName TIPO$12 = 
        new javax.xml.namespace.QName("", "tipo");
    private static final javax.xml.namespace.QName PROCESO$14 = 
        new javax.xml.namespace.QName("", "proceso");
    
    
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
     * Gets the "nombres" element
     */
    public java.lang.String getNombres()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nombres" element
     */
    public org.apache.xmlbeans.XmlString xgetNombres()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRES$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "nombres" element
     */
    public boolean isNilNombres()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRES$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "nombres" element
     */
    public void setNombres(java.lang.String nombres)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRES$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBRES$4);
            }
            target.setStringValue(nombres);
        }
    }
    
    /**
     * Sets (as xml) the "nombres" element
     */
    public void xsetNombres(org.apache.xmlbeans.XmlString nombres)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRES$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBRES$4);
            }
            target.set(nombres);
        }
    }
    
    /**
     * Nils the "nombres" element
     */
    public void setNilNombres()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRES$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBRES$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "apellidoPaterno" element
     */
    public java.lang.String getApellidoPaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDOPATERNO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "apellidoPaterno" element
     */
    public org.apache.xmlbeans.XmlString xgetApellidoPaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOPATERNO$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "apellidoPaterno" element
     */
    public boolean isNilApellidoPaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOPATERNO$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "apellidoPaterno" element
     */
    public void setApellidoPaterno(java.lang.String apellidoPaterno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDOPATERNO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APELLIDOPATERNO$6);
            }
            target.setStringValue(apellidoPaterno);
        }
    }
    
    /**
     * Sets (as xml) the "apellidoPaterno" element
     */
    public void xsetApellidoPaterno(org.apache.xmlbeans.XmlString apellidoPaterno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOPATERNO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APELLIDOPATERNO$6);
            }
            target.set(apellidoPaterno);
        }
    }
    
    /**
     * Nils the "apellidoPaterno" element
     */
    public void setNilApellidoPaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOPATERNO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APELLIDOPATERNO$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "apellidoMaterno" element
     */
    public java.lang.String getApellidoMaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDOMATERNO$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "apellidoMaterno" element
     */
    public org.apache.xmlbeans.XmlString xgetApellidoMaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOMATERNO$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "apellidoMaterno" element
     */
    public boolean isNilApellidoMaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOMATERNO$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "apellidoMaterno" element
     */
    public void setApellidoMaterno(java.lang.String apellidoMaterno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDOMATERNO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APELLIDOMATERNO$8);
            }
            target.setStringValue(apellidoMaterno);
        }
    }
    
    /**
     * Sets (as xml) the "apellidoMaterno" element
     */
    public void xsetApellidoMaterno(org.apache.xmlbeans.XmlString apellidoMaterno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOMATERNO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APELLIDOMATERNO$8);
            }
            target.set(apellidoMaterno);
        }
    }
    
    /**
     * Nils the "apellidoMaterno" element
     */
    public void setNilApellidoMaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOMATERNO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APELLIDOMATERNO$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "fechaNacimiento" element
     */
    public java.lang.String getFechaNacimiento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHANACIMIENTO$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fechaNacimiento" element
     */
    public org.apache.xmlbeans.XmlString xgetFechaNacimiento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FECHANACIMIENTO$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "fechaNacimiento" element
     */
    public boolean isNilFechaNacimiento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FECHANACIMIENTO$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "fechaNacimiento" element
     */
    public void setFechaNacimiento(java.lang.String fechaNacimiento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHANACIMIENTO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FECHANACIMIENTO$10);
            }
            target.setStringValue(fechaNacimiento);
        }
    }
    
    /**
     * Sets (as xml) the "fechaNacimiento" element
     */
    public void xsetFechaNacimiento(org.apache.xmlbeans.XmlString fechaNacimiento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FECHANACIMIENTO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FECHANACIMIENTO$10);
            }
            target.set(fechaNacimiento);
        }
    }
    
    /**
     * Nils the "fechaNacimiento" element
     */
    public void setNilFechaNacimiento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FECHANACIMIENTO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FECHANACIMIENTO$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "tipo" element
     */
    public pe.gob.reniec.www.TipoType.Enum getTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO$12, 0);
            if (target == null)
            {
                return null;
            }
            return (pe.gob.reniec.www.TipoType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "tipo" element
     */
    public pe.gob.reniec.www.TipoType xgetTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            pe.gob.reniec.www.TipoType target = null;
            target = (pe.gob.reniec.www.TipoType)get_store().find_element_user(TIPO$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "tipo" element
     */
    public boolean isNilTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            pe.gob.reniec.www.TipoType target = null;
            target = (pe.gob.reniec.www.TipoType)get_store().find_element_user(TIPO$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "tipo" element
     */
    public void setTipo(pe.gob.reniec.www.TipoType.Enum tipo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPO$12);
            }
            target.setEnumValue(tipo);
        }
    }
    
    /**
     * Sets (as xml) the "tipo" element
     */
    public void xsetTipo(pe.gob.reniec.www.TipoType tipo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            pe.gob.reniec.www.TipoType target = null;
            target = (pe.gob.reniec.www.TipoType)get_store().find_element_user(TIPO$12, 0);
            if (target == null)
            {
                target = (pe.gob.reniec.www.TipoType)get_store().add_element_user(TIPO$12);
            }
            target.set(tipo);
        }
    }
    
    /**
     * Nils the "tipo" element
     */
    public void setNilTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            pe.gob.reniec.www.TipoType target = null;
            target = (pe.gob.reniec.www.TipoType)get_store().find_element_user(TIPO$12, 0);
            if (target == null)
            {
                target = (pe.gob.reniec.www.TipoType)get_store().add_element_user(TIPO$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "proceso" element
     */
    public pe.gob.reniec.www.ProcesoType.Enum getProceso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESO$14, 0);
            if (target == null)
            {
                return null;
            }
            return (pe.gob.reniec.www.ProcesoType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "proceso" element
     */
    public pe.gob.reniec.www.ProcesoType xgetProceso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            pe.gob.reniec.www.ProcesoType target = null;
            target = (pe.gob.reniec.www.ProcesoType)get_store().find_element_user(PROCESO$14, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "proceso" element
     */
    public boolean isNilProceso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            pe.gob.reniec.www.ProcesoType target = null;
            target = (pe.gob.reniec.www.ProcesoType)get_store().find_element_user(PROCESO$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "proceso" element
     */
    public void setProceso(pe.gob.reniec.www.ProcesoType.Enum proceso)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESO$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCESO$14);
            }
            target.setEnumValue(proceso);
        }
    }
    
    /**
     * Sets (as xml) the "proceso" element
     */
    public void xsetProceso(pe.gob.reniec.www.ProcesoType proceso)
    {
        synchronized (monitor())
        {
            check_orphaned();
            pe.gob.reniec.www.ProcesoType target = null;
            target = (pe.gob.reniec.www.ProcesoType)get_store().find_element_user(PROCESO$14, 0);
            if (target == null)
            {
                target = (pe.gob.reniec.www.ProcesoType)get_store().add_element_user(PROCESO$14);
            }
            target.set(proceso);
        }
    }
    
    /**
     * Nils the "proceso" element
     */
    public void setNilProceso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            pe.gob.reniec.www.ProcesoType target = null;
            target = (pe.gob.reniec.www.ProcesoType)get_store().find_element_user(PROCESO$14, 0);
            if (target == null)
            {
                target = (pe.gob.reniec.www.ProcesoType)get_store().add_element_user(PROCESO$14);
            }
            target.setNil();
        }
    }
}
