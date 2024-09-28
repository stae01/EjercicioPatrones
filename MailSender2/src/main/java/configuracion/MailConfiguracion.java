/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package configuracion;

import dtos.Cuenta;
import dtos.Servidor;

/**
 *
 * @author carli
 */
public class MailConfiguracion {

    private Servidor servidor;
    private Cuenta cuenta;
    private String protocolo;

    // Constructor
    public MailConfiguracion(Servidor servidor, Cuenta cuenta, String protocolo) {
        this.servidor = servidor;
        this.cuenta = cuenta;
        this.protocolo = protocolo;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Servidor getServidor() {
        return servidor;
    }

    public void setServidor(Servidor servidor) {
        this.servidor = servidor;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

}
