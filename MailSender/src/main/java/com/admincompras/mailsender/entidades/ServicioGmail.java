package com.admincompras.mailsender.entidades;

/**
 *
 * @author marlon
 */
public class ServicioGmail extends Servicio {

    public ServicioGmail(String servidor, String puerto, String autenticacion, String conexionSegura) {
        super("smtp.gmail.com", "587", "true", "true");
    }
    
}
