package ficherosBinarios_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GuardarYRecuperarEstado extends EstadoPartida {

	
	public void guardarEstado(EstadoPartida nombre) throws Exception{
		
		File fichero = new File("C:/Users/Christian/Desktop/Pruebas/Guardar.dat");
		
		FileOutputStream fileout = new FileOutputStream(fichero, true);
		
		ObjectOutputStream fileoutput = new ObjectOutputStream(fileout);

		fileoutput.writeObject(nombre);
		
		fileoutput.close();
		
	}
	
	public void recuperarEstado(EstadoPartida nombre) throws Exception{
		
		File fichero = new File("C:/Users/Christian/Desktop/Pruebas/Guardar.dat");
		
		FileInputStream filein = new FileInputStream(fichero);

		ObjectInputStream fileinput = new ObjectInputStream(filein);
		
		do {
			
			nombre = (EstadoPartida) fileinput.readObject();
			
			System.out.println(nombre.toString());	
			
		} while (nombre != null);

		
		fileinput.close();
				
	}

}
