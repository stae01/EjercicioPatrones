package com.admincompras.mailsender.vista;

/**
 *
 * @author marlon
 */
public interface IFachadaMailSender {

    public void enviar(String servicio, String direccion, String destinatario, String asunto, String cuerpo);
    
}
