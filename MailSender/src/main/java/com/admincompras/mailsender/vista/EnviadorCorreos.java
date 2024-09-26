package com.admincompras.mailsender.vista;

import com.admincompras.mailsender.entidades.Configuracion;
import com.admincompras.mailsender.entidades.Correo;

/**
 *
 * @author marlon
 */
public class EnviadorCorreos {
    
    private Configuracion configuracion;
    private Correo correo;

    public EnviadorCorreos() {
    }

    public EnviadorCorreos(Configuracion configuracion, Correo correo) {
        this.configuracion = configuracion;
        this.correo = correo;
    }
    
    public void enviar() {
        System.out.println("Correo enviado a " + correo.getDestinatario());
    }
    
}
