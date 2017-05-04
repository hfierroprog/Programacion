//Hector Fierro

package prueba;

import java.util.Scanner;

public class PRUEBA {

    public static void main(String[] args) {
       int cantidad,precio;
       String color;
        
       Repuesto test = new Repuesto();
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Ingresa el valor Cantidad: ");
       cantidad = scan.nextInt();
       test.setCantidad(cantidad);
       
       System.out.println("Ingresa el valor Precio: ");
       precio = scan.nextInt();
       test.setPrecio(precio);
       
       System.out.println("Ingresa el color: ");
       color = scan.next();
       test.setColor(color); 
       
       int opc;
       
       System.out.println("1.-Mostrar propiedades no modificables.\n2.-Monstrar todo.\nIngresa una opcion valida:");
       opc = scan.nextInt();
       
       switch (opc){
           case 1:
               System.out.println(test.obtenerDatos());
               break;
           case 2:
               System.out.println(test.obtenerDatosdos());
               break;
               
           default:
               System.out.println("Opcion no vaida!!, reintente...");
       }
       
       
       
       System.out.println("Fin del programa! \n\n\n iniciando el ultimo ejercicio....\n\n");
       
       
       
       String repuestos[][] = new String[2][2];
       
       
       System.out.println("Ingresa nombre de repuesto 1: ");
       repuestos[0][0] = scan.next();
       System.out.println("Ingresa sucursal 1:");
       repuestos[0][1] = scan.next();
       System.out.println("Ingresa nombre de repuesto 2: ");
       repuestos[1][0] = scan.next();
       System.out.println("Ingresa sucursal 2:");
       repuestos[1][1] = scan.next();
       
       System.out.println("Respuesto 1: "+repuestos[0][0]);
       System.out.println("Sucursal 1: "+repuestos[0][1]);
       System.out.println("Respuesto 2: "+repuestos[1][0]);
       System.out.println("Sucursal 2: "+repuestos[1][1]);
       
    }
    
}
