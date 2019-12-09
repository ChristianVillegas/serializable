import java.io.Serializable;
import java.util.*;

public class Empleado implements Serializable {
	
	private String nombre;
	
	private double sueldo;
	
	private Date fechaContrato;

	public Empleado(String n, double s, int anno, int mes, int dia) {
		
		this.nombre=n;
		
		this.sueldo=s;
		
		GregorianCalendar calendario = new GregorianCalendar(anno, mes-1, dia);
		
		this.fechaContrato=calendario.getTime();
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public double getSueldo() {
		
		return sueldo;
	}
	
	public Date fechaContrato() {
		
		return fechaContrato;
	}

	
	public void setFechaContrato(Date fechaContrato) {
		
		this.fechaContrato = fechaContrato;
	}

	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}

	public void setSueldo(double sueldo) {
		
		this.sueldo = sueldo;
	}

	public void subirSueldo(double porcentaje) {
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
	}

	@Override
	public String toString() {
		
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + ", fechaContrato=" + fechaContrato + "]";
	}
		
}
