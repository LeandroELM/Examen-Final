package RHotel;
import java.util.*;
import static RHotel.ManejoArchivos.*;

public class TestHotel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion=0,disponible=0,reservar=0,noches=0,Nhabitaciones=0;
		int valor=0,cont=0,j=0;
		float precio=0,total=0;
		String  fechaDreserva = null;
		boolean salir = false;	
	   
	    int edad;
	    int id ;
	    

		
		  
			DReserva hotel = new DReserva(precio,(int) total,disponible,reservar,noches);
			
			while(!salir) {
				System.out.println("||-------------------------------------------------------------------------||");
				System.out.println("||Bienvenido reserva para el hotel Punta cacique estimado cliente----------||");
				System.out.println("||-------------------------------------------------------------------------||");
				System.out.println("");	
				
				ManejoArchivos archivos = new ManejoArchivos();
				archivos.creaArchivo();
				archivos.escribirArchivo();
				do {
					System.out.printf("Ingrese su edad :");
					
					while(!sc.hasNextInt()) {
                        String next=sc.next();
                        System.out.println(next + " No es un caracter valido");
                        System.out.printf("Ingrese su edad :");
                        
					}
					edad=sc.nextInt();
					break;
				}while(true);
				
				

				do {
					System.out.printf("Ingrese su documento de identificacion :");
					while(!sc.hasNextInt()) {
                        String next=sc.next();
                        System.out.println(next + " No es un caracter valido");
                        System.out.printf("Ingrese su documento nuevamente :");
                        
					}
					id=sc.nextInt();
					break;
				}while(true);
				
				Persona in = new Persona();
				String nombreC=in.mostrarString("Ingrese el nombre del cliente :");
				
				System.out.println("Eliga que habitacion desea reservar");
				System.out.println("1.Individual"
						+ "\n2.doble"
						+"\n3.triple"
						+"\n4.Familiar"
						+"\n5.platino"
						+"\n6.vip "
						+"\n7.suite"
						+ "\n8.Salir");
				System.out.println("");
				System.out.println("Que opcion desea?");
				opcion=sc.nextInt();
				switch(opcion) {
				
				case 1:
					System.out.println("1.habitacion individual");
					System.out.println("Habitacion para una persona contiene cosas basicas ");
					precio=250;
					System.out.println("El precio por noches es de " + precio + "$");
					Nhabitaciones=10;
					System.out.println("Habitaciones disponibles " + Nhabitaciones);
					do {
						System.out.printf("Cuantas habitaciones resrvera?");
						
						while(!sc.hasNextInt()) {
	                        String next=sc.next();
	                        System.out.println(next + " No es un caracter valido");
	                        System.out.printf("Cuantas habitaciones reservar? :");
	                        
						}
						reservar=sc.nextInt();
						break;
					}while(true);
					
					System.out.println("");
					if(reservar>Nhabitaciones) {
						System.out.println("No hay habitaciones disponibles");
					
					}else{
						System.out.println("seleccione una fecha de reserva");
						System.out.println("1.24 de diciembre 2022"
								+ "\n2. 28 de diciembre de 2022"
								+ "\n3. 31 de diciembre 2022"
								+ "\n4. 01 de enero de 2023"
								+ "\n5. 07 de enero de 2023");
						System.out.println("");
						System.out.println("Seleccione");
						opcion=sc.nextInt();
						System.out.println("");
						do {
							System.out.printf("Cuantas noches se hospedara?");
							
							while(!sc.hasNextInt()) {
		                        String next=sc.next();
		                        System.out.println(next + " No es un caracter valido");
		                        System.out.printf("Cuantas noches se hospedara?");
		                        
							}
							noches=sc.nextInt();
							break;
						}while(true);
						System.out.println();
						switch(opcion) {
						case 1: fechaDreserva = "24 de diciembre de 2022";
						break;
						case 2: fechaDreserva = " 28 de diciembre de 2022";
						break;
						case 3: fechaDreserva = "31 de diciembre de 2022";
						break;
						case 4: fechaDreserva = "01 de enero de 2023";
						break;
						
						case 5: fechaDreserva = "07 de enero de 2022";
						break ;
						
						default :System.out.println("No hay habitaciones disponibles!");
						break;
						}
						if(reservar>Nhabitaciones) {
							System.out.println("No hay disponibilidad de habitaciones");
							
						}
						else {
							System.out.println("");
							 
						    System.out.println("Nombre del cliente es : " + nombreC);
							System.out.println("Documento identidad :" + id);
							System.out.println("La Edad del cliente es :" + edad);
							System.out.println("El precio de las " +  hotel.obtenerReserva(reservar) + "  noches reservadas  es de $ " + hotel.obtenerPrecio (precio, reservar) 
							+ "\nPrecio de las  " + noches + " noches reservadas $ " + hotel.obtenerNoches(noches, precio));
						
							System.out.println("Fecha de reserva :" + fechaDreserva );
							System.out.println("Total del servicio $" + hotel.obtnerTotal(total, noches, precio));
							 System.out.println("Realizara otra reserva estimado cliente? S/N");
			 	    		 String estado =sc.next().toUpperCase();
			 	    		 if(!estado.contentEquals("S")) {
			 	    			 salir = true;
			 	    			 System.out.println("-----Reserva con exito----");
			 	    		 }
						}
						System.out.println("");
						break;
						
						
					}
					
					
				case 2:
					System.out.println("Habitacion doble");
					System.out.println("Una habitacion asignada como su nombre lo dice para dos "
							+ "personas para pasar un buen tiempo de calidad ya sean amigos o "
							+ "pareja etc contiene buenos beneficios");
					precio=450;
					System.out.println("El precio de la noche es de :" + precio + " $");
					Nhabitaciones=12;
					System.out.println("Num habitaciones disponibles =" + Nhabitaciones);

					do {
						System.out.printf("Cuantas habitaciones resrvera?");
						
						while(!sc.hasNextInt()) {
	                        String next=sc.next();
	                        System.out.println(next + " No es un caracter valido");
	                        System.out.printf("Cuantas habitaciones resrvara? :");
	                        
						}
						reservar=sc.nextInt();
						break;
					}while(true);
					System.out.println("");
					if(reservar>Nhabitaciones) {
						System.out.println("No hay habitaciones disponibles");
					}
					else {
						System.out.println("seleccione una fecha de reserva");
						System.out.println("1.24 de diciembre 2022"
								+ "\n2. 28 de diciembre de 2022"
								+ "\n3. 31 de diciembre 2022"
								+ "\n4. 01 de enero de 2023"
								+ "\n5. 07 de enero de 2023");
						System.out.println("");
						System.out.println("Seleccione");
						opcion=sc.nextInt();
						System.out.println("");

						do {
							System.out.printf("cuantas noches se hospedara :");
							
							while(!sc.hasNextInt()) {
		                        String next=sc.next();
		                        System.out.println(next + " No es un caracter valido");
		                        System.out.printf("vuelva a ingresar las noches :");
		                        
							}
							noches=sc.nextInt();
							break;
						}while(true);
						System.out.println("");
						switch(opcion) {
						case 1: fechaDreserva = "24 de diciembre de 2022";
						break;
						case 2: fechaDreserva = " 28 de diciembre de 2022";
						break;
						case 3: fechaDreserva = "31 de diciembre de 2022";
						break;
						case 4: fechaDreserva = "01 de enero de 2023";
						break;
						
						case 5: fechaDreserva = "07 de enero de 2022";
						break ;
						
						default :System.out.println("No hay habitaciones disponibles!");
						break;
						}
						if(reservar>Nhabitaciones) {
							System.out.println("No hay disponibilidad de habitaciones");
							
						}
						else {
							System.out.println("");
							System.out.println("Nombre del cliente :" + nombreC);
							System.out.println("Documento identidad :" + id);
							System.out.println("La edad del cliente es :" + edad);
							System.out.println("El precio de las " +  hotel.obtenerReserva(reservar) + "  haitaciones reservadas $ " + hotel.obtenerPrecio (precio, reservar) 
							+ "\nPrecio de las noches " + noches + " reservadas $ " + hotel.obtenerNoches(noches, precio));
						
							System.out.println("Fecha de reserva :" + fechaDreserva);
							System.out.println("Total del servicio $" + hotel.obtnerTotal(total, noches, precio));
							System.out.println("Gracias por reservar estimado cliente");
							 System.out.println("Realizara otra reserva estimado cliente? S/N");
			 	    		 String estado =sc.next().toUpperCase();
			 	    		 if(!estado.contentEquals("S")) {
			 	    			 salir = true;
			 	    			 System.out.println("-------------------Reserva con exito---------------------");
			 	    			 System.out.println("||||||||Gracias estimado cliente por preferir nuestros servicios||||||||");
			 	    		 }
						}
						System.out.println("");
					break;
					}
					case 3:
						System.out.println("---------------Habitacion triple-------");
						System.out.println("Una habitacion asignada para 3 personas una habitacion de buen tamaño servivio WIFI,servicio al cliente "
								+ " Buen hospedaje para pasar una noche tranquila"
								+ ", comodidad garantizada");
						precio=567;
						System.out.println("El precio de la noche es de :" + precio + " $");
						Nhabitaciones=6;
						System.out.println("Num habitaciones disponibles =" + Nhabitaciones);
						System.out.println("Cuantas habitaciones reservara?");
						reservar=sc.nextInt();
						System.out.println("");
						if(reservar>Nhabitaciones) {
							System.out.println("No hay habitaciones disponibles");
						}
						else{
							System.out.println("seleccione una fecha de reserva");
							System.out.println("1.24 de diciembre 2022"
									+ "\n2. 28 de diciembre de 2022"
									+ "\n3. 31 de diciembre 2022"
									+ "\n4. 01 de enero de 2023"
									+ "\n5. 07 de enero de 2023");
							System.out.println("");
							System.out.println("Seleccione");
							opcion=sc.nextInt();
							System.out.println("");
							System.out.println("Cuantos dias se hospedara?");
							noches=sc.nextInt();
							System.out.println("");
							switch(opcion) {
							case 1: fechaDreserva = "24 de diciembre de 2022";
							break;
							case 2: fechaDreserva = " 28 de diciembre de 2022";
							break;
							case 3: fechaDreserva = "31 de diciembre de 2022";
							break;
							case 4: fechaDreserva = "01 de enero de 2023";
							break;
							
							case 5: fechaDreserva = "07 de enero de 2022";
							break ;
							
							default :System.out.println("No hay habitaciones disponibles!");
							break;
							}
							if(reservar>Nhabitaciones) {
								System.out.println("No hay disponibilidad de habitaciones");
								
							}
							else {
								System.out.println("");
								System.out.println("Nombre del cliente :" + nombreC);
								System.out.println("Documento identidad :" + id);
								System.out.println("La edad del cliente es :" + edad);
								System.out.println("El precio de las " +  hotel.obtenerReserva(reservar) + "  haitaciones reservadas $ " + hotel.obtenerPrecio (precio, reservar) 
								+ "\nPrecio de las noches " + noches + " reservadas $ " + hotel.obtenerNoches(noches, precio));
							
								System.out.println("Fecha de reserva :" + fechaDreserva);
								System.out.println("Total del servicio $" + hotel.obtnerTotal(total, noches, precio));
								System.out.println("Gracias por reservar estimado cliente");
							
							System.out.println("");
					
							break;
							}
						}
						
						
					case 4 :
						System.out.println("|||<<<|||<<<|||habitacion Familiar||>>>||>>>||");
						System.out.println("Habitacion familiar comodidad garantizada,"
								+ "se ofrece todos los servivios disponibles del hotel,una cama matrimonial y 3 camas"
								+ ", para una persona,tv 36 pulgadas  ");
						precio=650;
						System.out.println("El precio por noches es de " + precio + "$");
						Nhabitaciones=4;
						System.out.println("Habitaciones disponibles " + Nhabitaciones);
						System.out.println("Cuantas habitaciones reservara?");
						reservar=sc.nextInt();
						System.out.println("");
						if(reservar>Nhabitaciones) {
							System.out.println("No hay habitaciones disponibles");
						
						}else{
							System.out.println("seleccione una fecha de reserva");
							System.out.println("1.24 de diciembre 2022"
									+ "\n2. 28 de diciembre de 2022"
									+ "\n3. 31 de diciembre 2022"
									+ "\n4. 01 de enero de 2023"
									+ "\n5. 07 de enero de 2023");
							System.out.println("");
							System.out.println("Seleccione");
							opcion=sc.nextInt();
							System.out.println("");
							System.out.println("Cuantos dias se hospedara?");
							noches=sc.nextInt();
							System.out.println();
							switch(opcion) {
							case 1: fechaDreserva = "24 de diciembre de 2022";
							break;
							case 2: fechaDreserva = " 28 de diciembre de 2022";
							break;
							case 3: fechaDreserva = "31 de diciembre de 2022";
							break;
							case 4: fechaDreserva = "01 de enero de 2023";
							break;
							
							case 5: fechaDreserva = "07 de enero de 2022";
							break ;
							
							default :System.out.println("No hay habitaciones disponibles!");
							break;
							}
							if(reservar>Nhabitaciones) {
								System.out.println("No hay disponibilidad de habitaciones");
								
							}
							else {
								System.out.println("");
								 
							    System.out.println("Nombre del cliente es : " +  nombreC);
								System.out.println("Documento identidad :" + id);
								System.out.println("La Edad del cliente es :" + edad);
								System.out.println("El precio de las " +  hotel.obtenerReserva(reservar) + "  noches reservadas  es de $ " + hotel.obtenerPrecio (precio, reservar) 
								+ "\nPrecio de las  " + noches + " noches reservadas $ " + hotel.obtenerNoches(noches, precio));
							
								System.out.println("Fecha de reserva :" + fechaDreserva );
								System.out.println("Total del servicio $" + hotel.obtnerTotal(total, noches, precio));
								 System.out.println("Realizara otra reserva estimado cliente? S/N");
				 	    		 String estado =sc.next().toUpperCase();
				 	    		 if(!estado.contentEquals("S")) {
				 	    			 salir = true;
				 	    			 System.out.println("-------------------Reserva con exito---------------------");
				 	    			 System.out.println("||||||||Gracias estimado cliente por preferir nuestros servicios||||||||");
				 	    		 }
							}
							System.out.println("");
							break;
							
							
						}
					case 5:
						System.out.println("<<<<<<<<<habitacion platino>>>>>><<<");
						System.out.println("Habitacion para una cantidad de 7 personas,por dicho nombre que "
								+ "porta la habitacion ofrece servicios premiun para el cliente "
								+ "con todo lo necesario a su gusto");
						precio=673;
						System.out.println("El precio por noches es de " + precio + "$");
						Nhabitaciones=7;
						System.out.println("Habitaciones disponibles " + Nhabitaciones);
						do {
							System.out.printf("Cuantas habitaciones resrvera?");
							
							while(!sc.hasNextInt()) {
		                        String next=sc.next();
		                        System.out.println(next + " No es un caracter valido");
		                        System.out.printf("Cuantas habitaciones resrvara? :");
		                        
							}
							reservar=sc.nextInt();
							break;
						}while(true);
						
						System.out.println("");
						if(reservar>Nhabitaciones) {
							System.out.println("No hay habitaciones disponibles");
						
						}else{
							System.out.println("seleccione una fecha de reserva");
							System.out.println("1.24 de diciembre 2022"
									+ "\n2. 28 de diciembre de 2022"
									+ "\n3. 31 de diciembre 2022"
									+ "\n4. 01 de enero de 2023"
									+ "\n5. 07 de enero de 2023");
							System.out.println("");
							System.out.println("Seleccione");
							opcion=sc.nextInt();
							System.out.println("");
							do {
								System.out.printf("Cuantas noches se hospedara?");
								
								while(!sc.hasNextInt()) {
			                        String next=sc.next();
			                        System.out.println(next + " No es un caracter valido");
			                        System.out.printf("Cuantas noches se hospedara?");
			                        
								}
								noches=sc.nextInt();
								break;
							}while(true);
							System.out.println();
							switch(opcion) {
							case 1: fechaDreserva = "24 de diciembre de 2022";
							break;
							case 2: fechaDreserva = " 28 de diciembre de 2022";
							break;
							case 3: fechaDreserva = "31 de diciembre de 2022";
							break;
							case 4: fechaDreserva = "01 de enero de 2023";
							break;
							
							case 5: fechaDreserva = "07 de enero de 2022";
							break ;
							
							default :System.out.println("No hay habitaciones disponibles!");
							break;
							}
							if(reservar>Nhabitaciones) {
								System.out.println("No hay disponibilidad de habitaciones");
								
							}
							else {
								System.out.println("");
								 
							    System.out.println("Nombre del cliente es : " + nombreC);
								System.out.println("Documento identidad :" + id);
								System.out.println("La Edad del cliente es :" + edad);
								System.out.println("El precio de las " +  hotel.obtenerReserva(reservar) + "  noches reservadas  es de $ " + hotel.obtenerPrecio (precio, reservar) 
								+ "\nPrecio de las  " + noches + " noches reservadas $ " + hotel.obtenerNoches(noches, precio));
							
								System.out.println("Fecha de reserva :" + fechaDreserva );
								System.out.println("Total del servicio C$" + hotel.obtnerTotal(total, noches, precio));
								 System.out.println("Realizara otra reserva estimado cliente? S/N");
				 	    		 String estado =sc.next().toUpperCase();
				 	    		 if(!estado.contentEquals("S")) {
				 	    			 salir = true;
				 	    			 System.out.println("-----Reserva con exito----");
				 	    		 }
							}
							System.out.println("");
							break;
							
							
						}
				
					case 6:
						System.out.println("1.habitacion vip");
						System.out.println("Habitacion para una cantidad para dos personas, "
								+ " la habitacion ofrece servicios exclusivos para el cliente "
								+ "con todo lo necesario a su gusto "
								+ "la segunda mejor habitacion que hay un poco costosa pero valdra la pena su reserva");
						precio=750;
						System.out.println("El precio por noches es de " + precio + "$");
						Nhabitaciones=5;
						System.out.println("Habitaciones disponibles " + Nhabitaciones);
						do {
							System.out.printf("Cuantas habitaciones resrvera?");
							
							while(!sc.hasNextInt()) {
		                        String next=sc.next();
		                        System.out.println(next + " No es un caracter valido");
		                        System.out.printf("Cuantas habitaciones resrvara? :");
		                        
							}
							reservar=sc.nextInt();
							break;
						}while(true);
						
						System.out.println("");
						if(reservar>Nhabitaciones) {
							System.out.println("No hay habitaciones disponibles");
						
						}else{
							System.out.println("seleccione una fecha de reserva");
							System.out.println("1.24 de diciembre 2022"
									+ "\n2. 28 de diciembre de 2022"
									+ "\n3. 31 de diciembre 2022"
									+ "\n4. 01 de enero de 2023"
									+ "\n5. 07 de enero de 2023");
							System.out.println("");
							System.out.println("Seleccione");
							opcion=sc.nextInt();
							System.out.println("");
							do {
								System.out.printf("Cuantas noches se hospedara?");
								
								while(!sc.hasNextInt()) {
			                        String next=sc.next();
			                        System.out.println(next + " No es un caracter valido");
			                        System.out.printf("Cuantas noches se hospedara?");
			                        
								}
								noches=sc.nextInt();
								break;
							}while(true);
							System.out.println();
							switch(opcion) {
							case 1: fechaDreserva = "24 de diciembre de 2022";
							break;
							case 2: fechaDreserva = " 28 de diciembre de 2022";
							break;
							case 3: fechaDreserva = "31 de diciembre de 2022";
							break;
							case 4: fechaDreserva = "01 de enero de 2023";
							break;
							
							case 5: fechaDreserva = "07 de enero de 2022";
							break ;
							
							default :System.out.println("No hay habitaciones disponibles!");
							break;
							}
							if(reservar>Nhabitaciones) {
								System.out.println("No hay disponibilidad de habitaciones");
								
							}
							else {
								System.out.println("");
								 
							    System.out.println("Nombre del cliente es : " + nombreC);
								System.out.println("Documento identidad :" + id);
								System.out.println("La Edad del cliente es :" + edad);
								System.out.println("El precio de las " +  hotel.obtenerReserva(reservar) + "  noches reservadas  es de $ " + hotel.obtenerPrecio (precio, reservar) 
								+ "\nPrecio de las  " + noches + " noches reservadas $ " + hotel.obtenerNoches(noches, precio));
							
								System.out.println("Fecha de reserva :" + fechaDreserva );
								System.out.println("Total del servicio $" + hotel.obtnerTotal(total, noches, precio));
								 System.out.println("Realizara otra reserva estimado cliente? S/N");
				 	    		 String estado =sc.next().toUpperCase();
				 	    		 if(!estado.contentEquals("S")) {
				 	    			 salir = true;
				 	    			 System.out.println("-----Reserva con exito----");
				 	    		 }
							}
							System.out.println("");
							break;
							
							
						}
				
					case 7:
						System.out.println("||--||--||--||Habitacion suite°||--||--||--||--||");
						System.out.println("Habitacion para cantidad personas limitadas,por dicho nombre que "
								+ "porta la habitacion ofrece servicios exclusivos para el cliente "
								+ "con todo lo necesario a su gusto para que dar detalles "
								+ "la habitacion ofrece todo lo que el hotel dispone :piscina,billar,gimnasio,"
								+ "bar de bebidas alcholicas,servicio al cliente,etc.");
						precio=958;
						System.out.println("El precio por noches es de " + precio + "$");
						Nhabitaciones=2;
						System.out.println("Habitaciones disponibles " + Nhabitaciones);
						do {
							System.out.printf("Cuantas habitaciones resrvera?");
							
							while(!sc.hasNextInt()) {
		                        String next=sc.next();
		                        System.out.println(next + " No es un caracter valido");
		                        System.out.printf("Cuantas habitaciones resrvara? :");
		                        
							}
							reservar=sc.nextInt();
							break;
						}while(true);
						
						System.out.println("");
						if(reservar>Nhabitaciones) {
							System.out.println("No hay habitaciones disponibles");
						
						}else{
							System.out.println("seleccione una fecha de reserva");
							System.out.println("1.24 de diciembre 2022"
									+ "\n2. 28 de diciembre de 2022"
									+ "\n3. 31 de diciembre 2022"
									+ "\n4. 01 de enero de 2023"
									+ "\n5. 07 de enero de 2023");
							System.out.println("");
							System.out.println("Seleccione");
							opcion=sc.nextInt();
							System.out.println("");
							do {
								System.out.printf("Cuantas noches se hospedara?");
								
								while(!sc.hasNextInt()) {
			                        String next=sc.next();
			                        System.out.println(next + " No es un caracter valido");
			                        System.out.printf("Cuantas noches se hospedara?");
			                        
								}
								noches=sc.nextInt();
								break;
							}while(true);
							System.out.println();
							switch(opcion) {
							case 1: fechaDreserva = "24 de diciembre de 2022";
							break;
							case 2: fechaDreserva = " 28 de diciembre de 2022";
							break;
							case 3: fechaDreserva = "31 de diciembre de 2022";
							break;
							case 4: fechaDreserva = "01 de enero de 2023";
							break;
							
							case 5: fechaDreserva = "07 de enero de 2022";
							break ;
							
							default :System.out.println("No hay habitaciones disponibles!");
							break;
							}
							if(reservar>Nhabitaciones) {
								System.out.println("No hay disponibilidad de habitaciones");
								
							}
							else {
								System.out.println("");
								 
							    System.out.println("Nombre del cliente es : " + nombreC);
								System.out.println("Documento identidad :" + id);
								System.out.println("La Edad del cliente es :" + edad);
								System.out.println("El precio de las " +  hotel.obtenerReserva(reservar) + "  noches reservadas  es de $ " + hotel.obtenerPrecio (precio, reservar) 
								+ "\nPrecio de las  " + noches + " noches reservadas $ " + hotel.obtenerNoches(noches, precio));
							
								System.out.println("Fecha de reserva :" + fechaDreserva );
								System.out.println("Total del servicio $" + hotel.obtnerTotal(total, noches, precio));
								 System.out.println("Realizara otra reserva estimado cliente? S/N");
				 	    		 String estado =sc.next().toUpperCase();
				 	    		 if(!estado.contentEquals("S")) {
				 	    			 salir = true;
				 	    			 System.out.println("-----Reserva con exito----");
				 	    		 }
							}
							System.out.println("");
							break;
							
							
						}
				
						sc.close();
			}	
				
			
			}
	
}
	


	}


