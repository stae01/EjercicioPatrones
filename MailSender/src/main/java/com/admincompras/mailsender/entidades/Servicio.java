package com.admincompras.mailsender.entidades;

/**
 *
 * @author marlon
 */
public abstract class Servicio {
    
    protected String servidor;
    protected String puerto;
    protected String autenticacion;
    protected String conexionSegura;

    public Servicio() {
    }

    public Servicio(String servidor, String puerto, String autenticacion, String conexionSegura) {
        this.servidor = servidor;
        this.puerto = puerto;
        this.autenticacion = autenticacion;
        this.conexionSegura = conexionSegura;
    }

    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getAutenticacion() {
        return autenticacion;
    }

    public void setAutenticacion(String autenticacion) {
        this.autenticacion = autenticacion;
    }

    public String getConexionSegura() {
        return conexionSegura;
    }

    public void setConexionSegura(String conexionSegura) {
        this.conexionSegura = conexionSegura;
    }
    
}
