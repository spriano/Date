
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
public class LocalData {

	public static void main(String[] args) {
		/* Creare una data
		 * Si utilzza il metodo of() della classe 
		 * LocalDate
		 * LocalDate è una classe immutabile
		 * non si può modificare
		 */
		
		LocalDate ld= LocalDate.of(1950, 6, 16);
		System.out.println(ld);
		
		/* Creare la data di oggi
		 * Si utilzza il metodo now() della classe 
		 * LocalDate
		 */
		
		LocalDate ld1= LocalDate.now();
		System.out.println(ld1);
		
		/* per saper il numero di giorni
		 * del mese di ld1 
		 * si utilizza il metodo lengthOfMonth()
		 * che restituisce il numero di giorni come intero 
		 * 
		 */
		
		
		int numeroGiorni=ld1.lengthOfMonth();
		System.out.println("giorni del mese di ld1 " +numeroGiorni);
		
		/* per sapere il giorno della settimana
		 * di una data 
		 * si utilizza il La classe DayOfWeek
		 * si ottine una istanza della classe 
		 * col metodo getDayOfWeek() di LocalDate
		 * 
		 */
		System.out.println(ld1);
		DayOfWeek giorno = ld1.getDayOfWeek(); 
		System.out.println(giorno);
		
		/* Period fornisce il periodo in anni,mesi e giorni 
		 * fra due date mediante il metodo between(data1,data2)
		 * per un'stanza del periodo 
		 * Period p= Period.between(data1,data2)
		 * Per ottenere gli anni si usa il metodo getYears()
		 * che fornisce un intero 
		 * int anni=p.getYears() analogamente per mesi e giorni
		 * int mesi=p.getMonths()
		 * int giorni=p.getDays()
		 * int giorni=p.getDays()
		 */
		LocalDate nascita=LocalDate.of(1950, 6, 16);
		LocalDate adesso= LocalDate.now();
		System.out.println("data di nascita "+nascita);
		Period p=Period.between(nascita, adesso);
		int anni=p.getYears();
		int mesi=p.getMonths();
		int giorni=p.getDays();
		System.out.println("anni "+anni);
		System.out.println("mesi "+mesi);
		System.out.println("giorni "+giorni);
		
		if(anni>=18)
			System.out.println("sei maggiorenne");
		else
			System.out.println("sei minorenne");
			
		

	}

}
