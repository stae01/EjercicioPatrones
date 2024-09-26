/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import servicio.IServicioCorreo;
import servicio.JavaMailServicio;
import servicio.OtroServicioCorreo;

/**
 *
 * @author carli
 */
public class FactoryServicioCorreo {
       public static IServicioCorreo getServicioCorreo(String tipo) {
        if (tipo.equalsIgnoreCase("JavaMail")) {
            return new JavaMailServicio();
        } else if (tipo.equalsIgnoreCase("OtroServicio")) {
            return new OtroServicioCorreo();
        }
        throw new IllegalArgumentException("Tipo de servicio no soportado");
    }
}