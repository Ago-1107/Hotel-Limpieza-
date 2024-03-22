/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Lectura {
    Scanner sc = new Scanner(System.in);
    
    public int leerInt(String mensaje){
        System.out.println(mensaje+" ");
        int dato = sc.nextInt();
        return dato;
    }
    public String leerString(String mensaje){
        System.out.println(mensaje+" ");
        String dato = sc.next();
        return dato;
    }
    public double leerDouble(String mensaje){
        System.out.println("Ingrese el número: ");
        double dato = sc.nextDouble();
        return dato;
    }
    public double leerFloat(String mensaje){
        System.out.println("Ingrese un número: ");
        float dato = sc.nextFloat();
        return dato;
    }
   
    public int ValidarInt(int dato) {
        do {
            if(dato <= 0 ){
                System.out.println("Valor no valido");
                System.out.println("Ingrese de nuevo un valor");
                dato = sc.nextInt();
            }
        } while (dato <= 0);
        return dato;
    }
    
    public int validarPiso(int floor){
       int cond = 0;
        do {
            if (floor > 0 && floor < 6) {
                cond = 1;
            }  else {
                System.out.println("El piso ingresado no existe, ingréselo nuevamente: ");
                floor = sc.nextInt();
            }
            
        } while (cond == 0);  
        return floor; 
    }
    
    public int validarhabitacion(String area, int floor, int IDroom){
        int cond = 0;
        int val = floor*100;
        do {
            if (area.equals("a") && (IDroom > val) && (IDroom < (val + 26))) {
                cond = 1;
            } else if (area.equals("b") && (IDroom > val + 25) && (IDroom < val + 51) && (val < 600)){
                cond = 1;
            } else {
                System.out.println("La habitación ingresada no concuerda con su ubicación, por favor ingresela nuevamente: ");
                IDroom = sc.nextInt();
            }
            
        } while (cond == 0);  
        return IDroom;
    }
}
