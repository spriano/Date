import java.time.LocalDate;

public class TetPersona {

	public static void main(String[] args) {
		Persona p=new Persona("aldo","spriano",LocalDate.of(1950, 6, 16));
		
		System.out.println(p);
		System.out.println("eta anni "+p.getEta());

	}

}
