package ficherosBinarios_1;

import java.io.*;

public class Ejercicio_2 {
	
	public static void main(String [] args)throws IOException{
	
		String[] nombres = {"Christian", "Andrés", "Álex"};
		
		int[] edad = {35, 32, 31};
		
		try {
		
		File fichero = new File("C:/Users/Christian/Desktop/Pruebas/FicherosDatos.dat");
		
		FileOutputStream fileout = new FileOutputStream(fichero, true);
		
		DataOutputStream fileoutput= new DataOutputStream(fileout); 
		
		for (int i = 0; i < nombres.length; i++){
			fileoutput.writeUTF(nombres[i]);
			fileoutput.writeInt(edad[i]);
		}
		
		fileoutput.close();
		
		FileInputStream filein = new FileInputStream(fichero);
		
		DataInputStream fileinput = new DataInputStream(filein);
		
		while(fileinput.available()>0) {  
	           
            // reads characters encoded with modified UTF-8  
            String k = fileinput.readUTF();
            
            int l = fileinput.readInt();
            
            System.out.println(k + ", " + l); 

         }  
		
		}catch(Exception e) {
			
		}
		
	}	

}
