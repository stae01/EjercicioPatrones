/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package configuracion;

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
            configuracionActual = new MailConfiguracion("smtp.example.com", 587, "user@example.com", "password", "JavaMail");
        }
        return configuracionActual;
    }

    // Método para actualizar la configuración
    public static void setConfiguracion(MailConfiguracion nuevaConfiguracion) {
        configuracionActual = nuevaConfiguracion;
        System.out.println("Configuración actualizada: " + nuevaConfiguracion.getServidorSmtp());
    }
}
