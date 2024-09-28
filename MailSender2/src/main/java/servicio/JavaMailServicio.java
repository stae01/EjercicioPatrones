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
        
        System.out.println("\nDestinatario: " + correo.getDestinatario());
        System.out.println("Asunto: " + correo.getAsunto());
        System.out.println("Cuerpo: " + correo.getCuerpo());
        
        System.out.println("\nServidor: " + configuracion.getServidor().getTipo());
        System.out.println("Puerto: " + configuracion.getServidor().getPuerto());
        System.out.println("Dirección: " + configuracion.getCuenta().getDireccion());
        System.out.println("Contraseña: " + configuracion.getCuenta().getContrasena());
    }
    
}
