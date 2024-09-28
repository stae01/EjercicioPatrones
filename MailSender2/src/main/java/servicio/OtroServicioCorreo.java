/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import configuracion.MailConfiguracion;
import dtos.Correo;

/**
 *
 * @author carli
 */
public class OtroServicioCorreo implements IServicioCorreo {

    @Override
    public void enviarCorreo(Correo correo, MailConfiguracion configuracion) {
        System.out.println("\nOtros Servicio");
    }
    
}
