package interfaz;

/**
 * @author Hugo Garcia
 * date 03/04/2024
 * @version 09-2023
 */

public class pajaro extends animal {
private int pluma;

public pajaro(String sexo, String nombre,int pluma) {
		super(sexo, nombre);
		this.pluma=pluma;
	}

	public void voz() {
		System.out.println("Pio");
		
	}
	
	public int decirplumas() {
		return pluma;
	}

}
