import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String nome;
	private String cognome;
	private LocalDate nascita;
	public Persona(String nome, String cognome, LocalDate nascita) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.nascita = nascita;
	}
	public int getEta() {
		LocalDate adesso=LocalDate.now();
		Period p=Period.between(nascita, adesso);
		return p.getYears();
		
	}
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	@Override
	public String toString() {
		return "nome=" + nome + ", cognome=" + cognome + ", nascita=" + nascita ;
	}
	public LocalDate getNascita() {
		return nascita;
	}
	
	
	

}
