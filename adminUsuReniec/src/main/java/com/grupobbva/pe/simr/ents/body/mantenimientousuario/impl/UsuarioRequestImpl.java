/*
 * XML Type:  UsuarioRequest
 * Namespace: http://pe.grupobbva.com/SIMR/ents/body/mantenimientoUsuario
 * Java type: com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequest
 *
 * Automatically generated - do not modify.
 */
package com.grupobbva.pe.simr.ents.body.mantenimientousuario.impl;
/**
 * An XML UsuarioRequest(@http://pe.grupobbva.com/SIMR/ents/body/mantenimientoUsuario).
 *
 * This is a complex type.
 */
public class UsuarioRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequest
{
    
    public UsuarioRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
     * True if has "nombres" element
     */
    public boolean isSetNombres()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOMBRES$4) != 0;
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
     * Unsets the "nombres" element
     */
    public void unsetNombres()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOMBRES$4, 0);
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
     * True if has "apellidoPaterno" element
     */
    public boolean isSetApellidoPaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APELLIDOPATERNO$6) != 0;
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
     * Unsets the "apellidoPaterno" element
     */
    public void unsetApellidoPaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APELLIDOPATERNO$6, 0);
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
     * True if has "apellidoMaterno" element
     */
    public boolean isSetApellidoMaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APELLIDOMATERNO$8) != 0;
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
     * Unsets the "apellidoMaterno" element
     */
    public void unsetApellidoMaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APELLIDOMATERNO$8, 0);
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
     * True if has "fechaNacimiento" element
     */
    public boolean isSetFechaNacimiento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FECHANACIMIENTO$10) != 0;
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
     * Unsets the "fechaNacimiento" element
     */
    public void unsetFechaNacimiento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FECHANACIMIENTO$10, 0);
        }
    }
    
    /**
     * Gets the "tipo" element
     */
    public java.lang.String getTipo()
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
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tipo" element
     */
    public org.apache.xmlbeans.XmlString xgetTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPO$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "tipo" element
     */
    public boolean isSetTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPO$12) != 0;
        }
    }
    
    /**
     * Sets the "tipo" element
     */
    public void setTipo(java.lang.String tipo)
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
            target.setStringValue(tipo);
        }
    }
    
    /**
     * Sets (as xml) the "tipo" element
     */
    public void xsetTipo(org.apache.xmlbeans.XmlString tipo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPO$12);
            }
            target.set(tipo);
        }
    }
    
    /**
     * Unsets the "tipo" element
     */
    public void unsetTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPO$12, 0);
        }
    }
    
    /**
     * Gets the "proceso" element
     */
    public java.lang.String getProceso()
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
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "proceso" element
     */
    public org.apache.xmlbeans.XmlString xgetProceso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROCESO$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "proceso" element
     */
    public boolean isSetProceso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESO$14) != 0;
        }
    }
    
    /**
     * Sets the "proceso" element
     */
    public void setProceso(java.lang.String proceso)
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
            target.setStringValue(proceso);
        }
    }
    
    /**
     * Sets (as xml) the "proceso" element
     */
    public void xsetProceso(org.apache.xmlbeans.XmlString proceso)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROCESO$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROCESO$14);
            }
            target.set(proceso);
        }
    }
    
    /**
     * Unsets the "proceso" element
     */
    public void unsetProceso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESO$14, 0);
        }
    }
}
