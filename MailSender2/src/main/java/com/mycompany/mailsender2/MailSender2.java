/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mailsender2;

import dtos.Correo;
import configuracion.MailConfiguracion;
import configuracion.MailConfiguracionManager;
import dtos.Cuenta;
import dtos.Servidor;
import fachada.MailFachada;

/**
 *
 * @author carli
 */
public class MailSender2 {

    public static void main(String[] args) {
        
        // Enviar correo con la configuración por defecto
        MailFachada mailFacade = new MailFachada();
        mailFacade.enviarCorreo(new Correo("destinatario@example.com", "Asunto", "Cuerpo del mensaje"));

        // Cambiar la configuración al vuelo
        MailConfiguracion nuevaConfig = new MailConfiguracion(new Servidor("smtp.otroservicio.com", "465"), new Cuenta("otroUsuario@example.com", "nuevaPassword"), "OtroServicio");
        MailConfiguracionManager.setConfiguracion(nuevaConfig);

        // Enviar correo con la nueva configuración
        MailFachada otroMailFacade = new MailFachada();
        otroMailFacade.enviarCorreo(new Correo("otro@example.com", "Nuevo Asunto", "Cuerpo del nuevo mensaje"));
    }
}

