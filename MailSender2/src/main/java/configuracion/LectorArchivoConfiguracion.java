package configuracion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author marlon
 */
public class LectorArchivoConfiguracion {

    File archivo;

    public LectorArchivoConfiguracion() {
        this.crearArchivoConfiguracion();
    }
    
    public void actualizarConfiguracion(String servidor, String puerto) {
        this.escribirArchivoConfiguracion(servidor, puerto);
    }
    
    public String leerServidor() {
        return this.leerArchivoConfiguracion()[0];
    }
    
    public String leerPuerto() {
        return this.leerArchivoConfiguracion()[1];
    }

    private void crearArchivoConfiguracion() {
        this.archivo = new File("archivo.txt");
        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo de configuración creado con éxito");
            } else {
                System.out.println("Error al crear archivo; probablemente ya existe");
            }
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    private void escribirArchivoConfiguracion(String servidor, String puerto) {
        try {
            FileWriter escritura = new FileWriter(archivo);
            escritura.write(servidor);
            escritura.write("\n" + puerto);
            escritura.close();
        } catch(IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    private String[] leerArchivoConfiguracion() {
        String servidor = "";
        String puerto = "";
        
        try {
            FileReader lector = new FileReader(this.archivo);
            BufferedReader lectura = new BufferedReader(lector);
            
            servidor = lectura.readLine();
            
            puerto = lectura.readLine();
            
        } catch(IOException ex) {
            ex.printStackTrace(System.out);
        }
        
        String[] arreglo = new String[2];
        arreglo[0] = servidor;
        arreglo[1] = puerto;
        
        return arreglo;
    }

}
