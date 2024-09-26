/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fachada;

import configuracion.MailConfiguracion;
import configuracion.MailConfiguracionManager;
import factory.FactoryServicioCorreo;
import servicio.IServicioCorreo;

/**
 *
 * @author carli
 */
public class MailFachada {
     private IServicioCorreo servicioCorreo;

    public MailFachada() {
        // Obtener configuración actual
        MailConfiguracion config = MailConfiguracionManager.getConfiguracion();
        this.servicioCorreo = FactoryServicioCorreo.getServicioCorreo(config.getProtocolo());
    }

    public void enviarCorreo(String destinatario, String asunto, String cuerpo) {
        servicioCorreo.enviarCorreo(destinatario, asunto, cuerpo);
    }
}