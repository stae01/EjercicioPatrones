/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import dtos.Correo;
import configuracion.MailConfiguracion;

/**
 *
 * @author carli
 */
public class JavaMailServicio implements IServicioCorreo{

    @Override
    public void enviarCorreo(Correo correo, MailConfiguracion configuracion) {
        System.out.println("Java Mail API");
    }
    
}
