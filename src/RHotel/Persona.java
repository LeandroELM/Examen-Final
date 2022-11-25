package RHotel;
import java.util.Scanner;

public class Persona {
Scanner entrada;
	
	public Persona() {
	entrada=new Scanner(System.in);
	}
	
	public String mostrarString(String titulo) {
		String s1="";
		while(s1.equals("")) {
	    System.out.println(titulo);
		s1=entrada.nextLine();
		if(!s1.matches("^[A-Z1a-z]*$")) {
		 s1="";
		}	
		}
		return s1;
		
	}

}

