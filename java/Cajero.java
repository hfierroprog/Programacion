//Ejercicio 1 Hector Fierro

import java.util.Scanner;

public class Cajero{
    static int saldo_user = 2000000;
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean bucle = true;
        System.out.println("Ingresa tu clave hiper mega ultra secreta:");
        int pin = scan.nextInt();
        int saldo_bill_veinte = 3000000;
        int saldo_bill_diez = 2000000;
        int saldo_bill_cinco = 1000000;

        int saldo_disp;

        saldo_disp = saldo_bill_veinte + saldo_bill_diez + saldo_bill_cinco;

        int bill_veinte = saldo_bill_veinte / 20000;
        int bill_diez = saldo_bill_diez / 10000;
        int bill_cinco = saldo_bill_cinco / 5000;


        while (bucle){            
            System.out.println("1.-Consulta de saldo.");
            System.out.println("2.-Deposito");
            System.out.println("3.-Retiro");
            System.out.println("4.-Recarga movil");
            System.out.println("5.-Salir");
            System.out.println("Ingresa una opcion: ");
                
            int opcion = scan.nextInt();
                
            switch(opcion){
                case 1:
                    System.out.println("\n\n");
                    Saldo(pin, scan);
                    System.out.println("\n\n");
                    break;
                        
                case 2:
                    System.out.println("\n\n");
                    Deposito(pin, scan, saldo_bill_veinte, saldo_bill_diez, saldo_bill_cinco);
                    System.out.println("\n\n");
                    break;
                        
                case 3:
                    System.out.println("\n\n");
                    Retiro(pin, scan, saldo_bill_veinte, saldo_bill_diez, saldo_bill_cinco);
                    System.out.println("\n\n");
                    break;
                        
                case 4:
                    System.out.println("\n\n");
                    Recarga(pin, scan);
                    System.out.println("\n\n");
                    break;

                case 5:
                    System.out.println("\n\n");
                    System.out.println("Gracias por usar mi cajero automatico!, Saludos.");
                    bucle = false;
                    System.out.println("\n\n");
                    break;
                        
                default:
                    System.out.println("Operacion no valida, vuelva a intentarlo..");
                    
                }
        }
		
                
                
                
	}
        
        public static void Saldo(int pin,Scanner scan){
            System.out.print("Ingresa tu pin: ");
            int upin = scan.nextInt();
            
            if (pin == upin){
                System.out.println("Su saldo es de $"+saldo_user);
            }
            
            else {
                System.out.println("Tarjeta retenida sinverguenza!");
                System.out.println("Sistema de alarma encendido!");
                System.exit(0);
            }
            
        }
        
        public static void Deposito( int pin, Scanner scan, int saldo_bill_veinte, int saldo_bill_diez, int saldo_bill_cinco){
            System.out.print("Ingresa tu pin: ");
            int upin = scan.nextInt();
            int saldo_dep;
            
            if(pin == upin){
                System.out.println("1.-En sobre");
                System.out.println("2.-En billetes");
                System.out.print("Ingresa una opcion: ");
                int opc = scan.nextInt();
            
                switch(opc){
                    case 1:
                        System.out.print("Ingresa saldo depositado, debe ser multiplo de 5000: ");
                        saldo_dep = scan.nextInt();
                        if (saldo_dep % 5000 == 0){
                            saldo_bill_cinco += saldo_dep;
                            saldo_user += saldo_dep;
                            System.out.println("Transaccion realizada correctamente!, tu nuevo saldo es: $"+saldo_user);
                        }
                        
                        else{
                            System.out.println("ERROR!, debes depositar dinero en multiplo de 5000");
                        }
                        break;
                    
                    case 2:
                        System.out.print("Ingresa saldo depositado, debe ser multiplo de 5000: ");
                        saldo_dep = scan.nextInt();
                        
                        if (saldo_dep % 5000 == 0){
                            System.out.print("Billetes de $20.000 ingresados: ");
                            int billveinte = scan.nextInt();
                            System.out.println("Billetes de $10.000 ingresados: ");
                            int billdiez = scan.nextInt();
                            System.out.println("Billetes de $5.000 ingresados: ");
                            int billcinco = scan.nextInt();
                            
                            int monto_bill = (billveinte * 20000) + (billdiez * 10000) + (billcinco * 5000);
                            
                            if (monto_bill == saldo_dep){
                                saldo_bill_veinte += billveinte * 20000;
                                saldo_bill_diez += billdiez * 10000;
                                saldo_bill_cinco += billcinco * 5000;
                                saldo_user += saldo_dep;
                                System.out.println("Transaccion realizada correctamente!, su nuevo saldo es: $"+saldo_user);
                            }
                            
                            else{
                                System.out.println("ERROR!, la cantidad de billetes no corresponde con el monto depositado.");
                            }
                        }
                        
                        else{
                            System.out.println("Monto no valido!, reintente...");
                        }
                        
            }
            }
            
            else{
                System.out.println("Tarjeta retenida sinverguenza!");
                System.out.println("Sistema de alarma encendido!");
                System.exit(0);
            }
            
        }
        
        
        public static void Retiro( int pin, Scanner scan, int saldo_bill_veinte, int saldo_bill_diez, int saldo_bill_cinco){
            System.out.print("Ingresa tu pin: ");
            int upin = scan.nextInt();
            int bill_veinte = 0;
            int bill_diez = 0;
            int bill_cinco = 0;
            
            if (pin == upin){
                System.out.println("Ingresa el monto a retirar, debe ser multiplo de $5.000: ");
                int mon_ret = scan.nextInt();
                int mon_ret_aux = mon_ret;
                
                if (mon_ret % 5000 == 0 && mon_ret < saldo_user){
                    if (mon_ret_aux % 20000 == 0){
                        bill_veinte = mon_ret_aux / 20000;
                        mon_ret_aux -= bill_veinte * 20000;
                    }
                    
                    else if(mon_ret_aux % 10000 == 0){
                        bill_diez = mon_ret_aux / 10000;
                        mon_ret_aux -= bill_diez * 10000;
                    }
                    
                    else if(mon_ret_aux % 5000 == 0){
                        bill_cinco = mon_ret_aux / 5000;
                        mon_ret_aux -= bill_cinco * 5000;
                    }
                    
                    saldo_user -= mon_ret;
                    
                    saldo_bill_veinte -= bill_veinte * 20000;
                    saldo_bill_diez -= bill_diez * 10000;
                    saldo_bill_cinco -= bill_cinco * 5000;
                    
                    System.out.println("Transaccion completada!, recibes "+bill_veinte+" billetes de 20 mil "+bill_diez+" billetes de 10 mil "+bill_cinco+" billetes de 5 mil");
                    System.out.println("Tu nuevo saldo es: "+saldo_user);
                }
                
                else{
                    System.out.println("ERROR!, El monto ingresado no es multiplo de $5.000 o no tienes saldo suficiente");
                }
            }
            
            else{
                System.out.println("Tarjeta retenida sinverguenza!");
                System.out.println("Sistema de alarma encendido!");
                System.exit(0);
            }
        }
        
        public static void Recarga( int pin, Scanner scan){
            System.out.println("Ingresa tu pin: ");
            int upin = scan.nextInt();
            
            if(pin == upin){
                System.out.println("1.-Claro");
                System.out.println("2.-Entel");
                System.out.println("3.-Wom");
                
                int opc = scan.nextInt();

                System.out.println("Ingresa el monto a recargar: ");
                int monto_rec = scan.nextInt();

                if (monto_rec < saldo_user){
                    saldo_user -= monto_rec;
                    System.out.println("Transaccion completada!, su nuevo saldo es: $"+saldo_user);
                }
            }
            
            else{
                System.out.println("Tarjeta retenida sinverguenza!");
                System.out.println("Sistema de alarma encendido!");
                System.exit(0);
            }
        }
        
}