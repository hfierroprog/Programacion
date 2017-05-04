import java.util.Scanner;


public class Ejercicio4 {

    
    public static void main(String[] args) {
      
   Scanner reader = new Scanner(System.in);
   int numero1 = 0;
   int numero2 = 0;
   int resultado = 0;
   System.out.println("introduzca el primer numero: ");
   numero1 = reader.nextInt();
   System.out.println("introduce el segundo numero: ");
   numero2 = reader.nextInt();
   resultado= numero1 + numero2;
   System.out.println("la suma es "+ numero1+"+"+numero2 +"="+resultado);
        
    }
    
}
