package fachada;

import configuracion.LectorArchivoConfiguracion;

/**
 *
 * @author marlon
 */
public class ConsultarFachada {
    
    public String consultarConfiguracion() {
        LectorArchivoConfiguracion lectorArchivoConfiguracion = new LectorArchivoConfiguracion();
        
        String servidor = lectorArchivoConfiguracion.leerServidor();
        String puerto = lectorArchivoConfiguracion.leerPuerto();
        String direccion = lectorArchivoConfiguracion.leerDireccion();
        String contrasena = lectorArchivoConfiguracion.leerContrasena();
        String protocolo = lectorArchivoConfiguracion.leerProtocolo();
        
        return "Servidor: " + servidor + "\nPuerto: " + puerto + "\nDirección: " + direccion + "\nContraseña: " + contrasena + "\nProtocolo: " + protocolo;
    }
    
}
