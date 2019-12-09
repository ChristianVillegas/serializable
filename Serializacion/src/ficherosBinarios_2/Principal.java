package ficherosBinarios_2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EstadoPartida inicio = new EstadoPartida();
		inicio.setPosicion(1, 1);
		
		GuardarYRecuperarEstado arbitro = new GuardarYRecuperarEstado(); 
		try {
			arbitro.guardarEstado(inicio);
			arbitro.recuperarEstado(inicio);
		}catch(Exception e) {
			
		}
		
	}

}