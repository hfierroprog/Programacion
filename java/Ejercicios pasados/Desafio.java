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
public class Desafio {
    public static void main(String[] args){
        int x[] = new int[10];
        int y[] = new int [10];
        
        for (int cont = 0;cont<10;cont++){
            x[cont] = cont +1;
        }
        for (int cont1 = 0;cont1<10;cont1++){
            y[cont1] = cont1 +1;
        }
        
        System.out.println(x[2-1]*y[2-1]);
        System.out.println(x[3-1]*y[3-1]);
        System.out.println(x[3-1]*y[4-1]);
        System.out.println(x[4-1]*y[5-1]);
        System.out.println(x[5-1]*y[6-1]);
        System.out.println(x[7-1]*y[7-1]);
        System.out.println(x[9-1]*y[8-1]);
        System.out.println(x[10-1]*y[9-1]);
    }
}
