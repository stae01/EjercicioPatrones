package com.admincompras.mailsender.entidades;

/**
 *
 * @author marlon
 */
public class Configuracion {
    
    private Servicio servicio;
    private CuentaCorreo cuentaCorreo;

    public Configuracion() {
    }

    public Configuracion(Servicio servicio, CuentaCorreo cuentaCorreo) {
        this.servicio = servicio;
        this.cuentaCorreo = cuentaCorreo;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public CuentaCorreo getCuentaCorreo() {
        return cuentaCorreo;
    }

    public void setCuentaCorreo(CuentaCorreo cuentaCorreo) {
        this.cuentaCorreo = cuentaCorreo;
    }
    
}
