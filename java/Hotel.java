import java.util.Scanner;

public class Hotel{
	public static void main(String[] args){
		while (true){
			Scanner scan = new Scanner(System.in);

			int simple = 15;
			int doble = 10;
			int matrimonial = 5;
			int prec_simple = 10000;
			int prec_doble = 15000;
			int prec_matrimonial = 25000;
			int dscto_habituales = 5;
			int opc;


			System.out.println("1.-Listado de habitaciones.");
			System.out.println("2.-Precios.");
			System.out.println("3.-Descuento.");
			System.out.println("4.-Fotos.");
			System.out.println("5.-Reservar.");
			System.out.println("6.-Salir");
			System.out.print("Ingresa una opcion:");
			opc = scan.nextInt();

			switch (opc){
				case 1:
					Listado_Hab(simple,doble,matrimonial);
					break;
				case 2:
					Prec_Hab(prec_simple,prec_doble,prec_matrimonial);
					break;
				case 3:
					Desc_Hab(dscto_habituales);
					break;
				case 4:
					int num;
					System.out.println("1.-Ver foto de simple");
					System.out.println("2.-Ver foto de doble");
					System.out.println("3.-Ver foto de matrimonial");
					num = scan.nextInt();
					img(num);
					System.out.println("\n\n");
					break;
				case 5:
					String nombre;
					int hab;
					System.out.println("1.-Simple");
					System.out.println("2.-Doble");
					System.out.println("3.-Matrimonial");
					System.out.print("Ingresa una opcion: ");
					hab = scan.nextInt();
					System.out.print("Ingresa el nombre de quien la reserva: ");
					nombre = scan.next();

					if (hab == 1){
						System.out.println("Habitacion simple reservada para "+nombre);
						System.out.println("\n\n");
					}

					if (hab == 2){
						System.out.println("Habitacion doble reservada para "+nombre);
						System.out.println("\n\n");
					}

					if (hab == 3){
						System.out.println("Habitacion matrimonial reservada para "+nombre);
						System.out.println("\n\n");
					}

					break;




				case 6:
					System.exit(0);

		}
		

	}

}
		

	public static void Listado_Hab(int simple,int doble, int matrimonial){
		System.out.println("\n\n");

		System.out.println("Las habitaciones disponibles son: ");

		System.out.println("\n\n");

		System.out.println("Simple: "+simple);
		System.out.println("Doble: "+doble);
		System.out.println("Matrimonial: "+matrimonial);

		System.out.println("\n\n");
	}

	public static void Prec_Hab(int simple,int doble, int matrimonial){
		System.out.println("\n\n");

		System.out.println("Los precios de las habitaciones son: ");

		System.out.println("\n\n");

		System.out.println("Simple: $"+simple);
		System.out.println("Doble: $"+doble);
		System.out.println("Matrimonial: $"+matrimonial);

		System.out.println("\n\n");
	}

	public static void Desc_Hab(int dscto){
		System.out.println("\n\n");

		System.out.println("El descuento a los clientes habituales es de: "+dscto+"%");

		System.out.println("\n\n");
	}

	public static void img(int num){
		switch (num){
			case 1:
				System.out.println("http://hotelboquemar-huanchaco.com/photo/1263063774Habitacion%20simple2.JPG");
				System.out.println("\n\n");
				break;
			case 2:
				System.out.println("http://www.hotelcasaserena.com/sites/default/files/Dormitorio2.jpg");
				System.out.println("\n\n");
				break;

			case 3:
				System.out.println("https://www.amerian.com/image/habitacion/2012/04/0536011-habitacionmatrimonialstandard.jpg");
				System.out.println("\n\n");
				break;

			default:
				System.out.println("OPCION NO VALIDA");
				System.out.println("\n\n");

			System.out.println("\n\n");
		}
	}




}