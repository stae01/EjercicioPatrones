package com.admincompras.mailsender.vista;

import com.admincompras.mailsender.entidades.Configuracion;
import com.admincompras.mailsender.entidades.Correo;

/**
 *
 * @author marlon
 */
public class FachadaMailSender implements IFachadaMailSender {

    public FachadaMailSender() {
    }

    @Override
    public void enviar(String servicio, String direccion, String destinatario, String asunto, String cuerpo) {
        Configuracion configuracion = new Configuracion();
        Correo correo = new Correo(destinatario, asunto, cuerpo);
        
        EnviadorCorreos enviadorCorreos = new EnviadorCorreos(configuracion, correo);
        
        enviadorCorreos.enviar();
    }
    
}
