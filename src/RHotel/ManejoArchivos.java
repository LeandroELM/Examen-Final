package RHotel;
import java.io.*;
public class ManejoArchivos {
File archivo;
	
		
	
	protected void creaArchivo() {
		
		archivo=new File("Archivo.txt");
		try {
			if(archivo.createNewFile()) {
				System.out.println("Archivado creado con exito");
			}
			else {
				System.out.println("Error al crear archivo");
			}
		}catch(IOException excepcion) {
			excepcion.printStackTrace(System.out);
			
		}
	}
   protected void EliminarArchivo() {
		
	
		if(archivo.delete()) {
			System.out.println("Archivado eliminado");
		}
		else {
			System.out.println("Error al eliminar el archivo");
		}
	}
	
   protected void escribirArchivo() {
	   
		   try {
			FileWriter escribir= new FileWriter(archivo);
			escribir.write("Saludos");
			escribir.close();
			System.out.println("Archivo anadido correctamente");
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
	     }
	
	
	public static void escribirArchivo(String nombreArchivo,String contenido) {
		File archivo = new File(nombreArchivo);
		
		try {
			PrintWriter salida = new PrintWriter(archivo);
			salida.println(contenido);
			salida.close();
			System.out.println("Se escribio en el archivo");
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
		}
		
		
		class escribiendo{
			public void escribir() {
				String frase="Prueba de escritura";
				
				try {
					FileWriter escritura=new FileWriter("C:Users/Usuario/Desktop/texto_nuevo.txt");
					for(int i=0;i<frase.length();i++) {
						escritura.write(frase.charAt(i));}
					escritura.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
			}
			
		}
	}
}
