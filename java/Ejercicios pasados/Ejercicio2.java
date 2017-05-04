/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packet;

import java.text.DecimalFormat;

/**
 *
 * @author Alumno
 */
public class Ejercicio2 {
    public static void main(String[] args){
        DecimalFormat formatter = new DecimalFormat("#.#");
        
        float par_real = (float) 0.1;
        float arreglo[] = new float[20];
        
        for (int cont = 0;cont < 20;cont++){
            arreglo[cont] = par_real;
            par_real += 0.2;
            System.out.println(formatter.format(arreglo[cont]));
        }
        
       
    }
}