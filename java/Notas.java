//Ejercicio2 Hector Fierro

import java.util.Scanner;

public class Notas{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int longitud = 5;
		String[] nombres = new String[longitud];
		double nota1[] = new double[longitud];
		double nota2[] = new double[longitud];
		double nota3[] = new double[longitud];

		for (int cont = 0;cont < longitud;cont++ ){
			System.out.println("Ingresa nombre del alumno"+(cont+1)+": ");
			nombres[cont] = scan.next();
			System.out.println("Ingresa las notas de 0 a 7 si quieres decimales ingresa con coma ej 6,5");
			while (true){
				System.out.println("ingresa nota1: ");
				nota1[cont] = scan.nextDouble();
				if (nota1[cont] > 0 && nota1[cont] <= 7){
					break;
				}
				else{
					System.out.println("Ingresa una nota valida!");
				}
			}
			
			while (true){
				System.out.println("ingresa nota2: ");
				nota2[cont] = scan.nextDouble();
				if (nota2[cont] > 0 && nota2[cont] <= 7){
					break;
				}
				else{
					System.out.println("Ingresa una nota valida!");
				}
			}
			
			while (true){
				System.out.println("ingresa nota3: ");
				nota3[cont] = scan.nextDouble();
				if (nota3[cont] > 0 && nota3[cont] <= 7){
					break;
				}
				else{
					System.out.println("Ingresa una nota valida!");
				}
			}
			System.out.println("\n\n");
		}

		for (int contprint = 0;contprint < longitud ;contprint++) {
			System.out.println(nombres[contprint]+" - nota1:"+nota1[contprint]+" - nota2:"+nota2[contprint]+" - nota3:"+nota3[contprint]);
		}

	}
}