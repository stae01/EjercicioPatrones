/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package configuracion;

import dtos.Cuenta;
import dtos.Servidor;

/**
 *
 * @author carli
 */
public class MailConfiguracionManager {

    private static MailConfiguracion configuracionActual;

    // Método para obtener la configuración actual
    public static MailConfiguracion getConfiguracion() {
        if (configuracionActual == null) {
            // Valores por defecto o cargar de un archivo de configuración
            configuracionActual = new MailConfiguracion(new Servidor("smtp.example.com", "587"), new Cuenta("user@example.com", "password"), "JavaMail");
        }
        return configuracionActual;
    }

    // Método para actualizar la configuración
    public static void actualizarConfiguracion(MailConfiguracion nuevaConfiguracion) {
        
        LectorArchivoConfiguracion archivoConfiguracion = new LectorArchivoConfiguracion();
        archivoConfiguracion.actualizarConfiguracion(nuevaConfiguracion.getServidor().getTipo(), nuevaConfiguracion.getServidor().getPuerto());
        
        configuracionActual = nuevaConfiguracion;
        
        System.out.println("Configuración actualizada: " + nuevaConfiguracion.getServidor().getTipo());
    }
}
