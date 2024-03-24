/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package housekeeping;

import static common.People.ID;
import static common.People.name;
import static housekeeping.Housekeeping.cleaning;
import static housekeeping.Housekeeping.area;
import static housekeeping.Room.IDRoom;
import java.util.ArrayList;
import java.util.List;
import common.Lectura;
import static guest.CheckIn.registerClients;

/**
 *
 * @author Andrea
 */
public class Record {
    private static final Lectura rd = new Lectura();
    static List<Integer> list = new ArrayList<Integer>(registerClients());
    
    public static List<Integer> cleanRoom(){
        List<Integer> limpiezas = new ArrayList<Integer>();
            
        System.out.println("\n _______________________________________________________________________________________________"
                + "\n Bienvenido al servicio de limpieza"
                + "\n A continuación podrá ingresar su ID de empleado"
                + " para acceder y registrar las habitaciones aseadas.");
            
        ID = rd.leerInt("\n Ingrese su identificacion: ");
        name = rd.leerString("Ingrese su nombre: ");
            
        area = rd.leerString("\n Ingrese su ubicacion"
                + "\n a. para ala este, habitaciones 1 a 25"
                + "\n b. para ala oeste habitaciones 26 a 50");         
        if (!area.equals("a") && !area.equals("b")) {
            System.out.println("\n La ubicación no es valida, vuelva a ingresarla.");
                
            area = rd.leerString("a. para ala este, habitaciones 1 a 25"
                + "\n b. para ala oeste habitaciones 26 a 50");
        }
        cleaning = true;
        
        do {
            int fl = rd.leerInt("Ingrese el piso en que se encuentra (1-5): ");
            int floor = rd.validarPiso(fl);
            int IDroom = rd.leerInt("Ingrese el número de habitación a la que realizará"
                    + " la limpieza con el siguiente formato: \n (#piso + #habitación) ejm --> " + floor + "10: ");
            int validacion = rd.validarhabitacion(area, floor, IDroom);
            IDRoom = validacion;
            
            if (list.contains(IDRoom)){
              limpiezas.add(IDRoom);
            } else {
                System.out.println("\n La habitación no cuenta con huespedes, por lo tanto no requiere limpieza.");
            }
        
            String respuesta;
            do {
                respuesta = rd.leerString("\n ¿Desea limpiar otra habitación?"
                        + "\n 1. para sí"
                        + "\n 2. para no");
            }
            while (!respuesta.equalsIgnoreCase("1") && !respuesta.equalsIgnoreCase("2"));

            if (respuesta.equalsIgnoreCase("2")) {
                cleaning = false;
            }
        }
        while (cleaning);
        System.out.println("\n La mucama " + name + " con identificación " + ID + " ha limpiado las habitaciones: ");
        for (int i = 0; i < limpiezas.size(); i++){
            System.out.println(limpiezas.get(i));
        }
        return limpiezas;
    }

    public boolean verifyClean(){
        return cleaning;
    }
}
