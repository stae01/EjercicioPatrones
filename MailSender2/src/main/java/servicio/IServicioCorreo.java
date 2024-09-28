/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import dtos.Correo;
import configuracion.MailConfiguracion;

/**
 *
 * @author carli
 */
public interface IServicioCorreo {
   public void enviarCorreo(Correo correo, MailConfiguracion configuracion);
 
}
