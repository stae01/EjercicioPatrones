/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package configuracion;

/**
 *
 * @author carli
 */
public class MailConfiguracion {
 private String servidorSmtp;
    private int puerto;
    private String usuario;
    private String contrasena;
    private String protocolo;

    // Constructor
    public MailConfiguracion(String servidorSmtp, int puerto, String usuario, String contrasena, String protocolo) {
        this.servidorSmtp = servidorSmtp;
        this.puerto = puerto;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.protocolo = protocolo;
    }

    // Getters y Setters
    public String getServidorSmtp() {
        return servidorSmtp;
    }

    public void setServidorSmtp(String servidorSmtp) {
        this.servidorSmtp = servidorSmtp;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }
}