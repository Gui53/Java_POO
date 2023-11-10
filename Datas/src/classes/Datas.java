package classes;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		/*Date data = new Date(2023,10,8);
		System.out.println(data);*/
		
		LocalDate data = LocalDate.now();	
		System.out.println(data);
			
		LocalDate dataOf = LocalDate.of(2023, 11, 7);	
		System.out.println(dataOf);
		
		LocalTime agora = LocalTime.now();
		System.out.println(agora);
		
		LocalTime horaCafe = LocalTime.of(10,00,00);
		System.out.println(horaCafe);
		
		LocalDateTime dataHora = LocalDateTime.now();
		System.out.println(dataHora.getDayOfMonth());
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/yyyy/MM");
		String dataFormada = dataHora.format(formatador);
		System.out.println(dataFormada);
		
		System.out.println(dataHora.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
	
	}

}


