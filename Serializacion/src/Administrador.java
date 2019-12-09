public class Administrador extends Empleado {
	
	private double incentivo;
	
	public Administrador(String n, double s, int anno, int mes, int dia) {
		
		super(n, s, anno, mes, dia);
		
		this.incentivo=0;
	}
	
	public double getSueldo() {
		
		double sueldoBase=super.getSueldo();
		
		return sueldoBase + incentivo;
	}
	
	public double getIncentivo() {
		
		return incentivo;
	}
	
	public void setIncentivo(double b) {
		
		incentivo = b;
	}
	
	@Override
	public String toString() {

		return super.toString() + " Incentivo=" + incentivo;
	}

}
