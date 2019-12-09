import java.io.*;

public class serializacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Administrador jefe = new Administrador("Bruce", 10000, 2014, 07, 15);
		
		jefe.setIncentivo(3000);
		
		Empleado[] personal = new Empleado[3];
		
		personal[0]=jefe;
		
		personal[1]=new Empleado("Maikel", 2000, 2018, 02, 01);
		
		personal[2]=new Empleado("Rosalia", 2200, 2017, 01, 15);
		
		try {
			
			ObjectOutputStream ficheroOut = new ObjectOutputStream(new FileOutputStream("C:/Users/Christian/Desktop/Pruebas/empleado.dat"));
			
			ficheroOut.writeObject(personal);
			
			ficheroOut.close();
			
			ObjectInputStream ficheroIn = new ObjectInputStream(new FileInputStream("C:/Users/Christian/Desktop/Pruebas/empleado.dat"));
			
			Empleado[] personal_recuperado=(Empleado[]) ficheroIn.readObject();
			
			ficheroIn.close();
			
			//Recorro la array con un for each
			/*for(Empleado e : personal_recuperado) {
				
				System.out.println(e);
			}*/
			
			//Recorro la array con un for
			for(int i = 0; i < personal_recuperado.length; i++) {
				System.out.println(personal_recuperado[i]);
			}
			
		}catch(Exception e) {
			
		}
	}

}
