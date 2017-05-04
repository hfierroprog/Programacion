/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packet;

/**
 *
 * @author Alumno
 */
public class Ejercicio_bi4 {
    public static void main(String[] args){
        int x[][] = new int [12][12];
        int incremento = 1;
        
        //Asignamos los valores al arreglo multidimensional
        
        for (int cont1 = 0;cont1 < x.length;cont1++){
            for (int cont2 = 0;cont2 < x.length;cont2++){
                x[cont1][cont2] = incremento;
                incremento +=1;
            }
        }
        
        for (int cont3 = 0;cont3 < x.length;cont3++){
            for (int cont4 = 0;cont4 < x.length;cont4++){
                System.out.println("El arreglo x["+cont3+"]["+cont4+"]"+" = "+x[cont3][cont4]);
            }
    }
}
}
