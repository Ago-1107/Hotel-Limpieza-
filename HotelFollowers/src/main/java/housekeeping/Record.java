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
import guest.CheckIn;
import java.util.ArrayList;
import java.util.List;
import common.Lectura;
import static guest.CheckIn.registerPlayers;

/**
 *
 * @author Andrea
 */
public class Record {
        private static final Lectura rd = new Lectura();
        static List<Integer> list = new ArrayList<Integer>(registerPlayers());
    
        public static List<Integer> cleanRoom(){
        List<Integer> limpiezas = new ArrayList<Integer>();
        System.out.println("\n \n Bienvenido al servicio de limpieza.");
        ID = rd.leerInt("Ingrese su identificacion: ");
        name = rd.leerString("Ingrese su nombre: ");
        area = rd.leerString("Ingrese su ubicacion (a. para ala este,"
                + "habitaciones 1 a 25, y b. para ala oeste habitaciones 26 a 50): ");
        cleaning = true;
        
        do {
            int fl = rd.leerInt("Ingrese el piso en que se encuentra: ");
            int floor = rd.validarPiso(fl);
            int IDroom = rd.leerInt("Ingrese el número de habitación a la que realizó la limpieza: ");
            int validacion = rd.validarhabitacion(area, floor, IDroom);
            IDRoom = validacion;
            
            if (list.contains(IDRoom)){
              limpiezas.add(IDRoom);
            } else {
                System.out.println("La habitación no se encuentra ocupada, por lo tanto no hay que limpiarla.");
            }
        
            String respuesta;
            do {
                respuesta = rd.leerString("¿Desea limpiar otra habitación?"
                        + "\n 1. sí"
                        + "\n 2. no");
            }
            while (!respuesta.equalsIgnoreCase("1") && !respuesta.equalsIgnoreCase("2"));

            if (respuesta.equalsIgnoreCase("2")) {
                cleaning = false;
            }
        }
        while (cleaning);
        System.out.println("\n La mucama " + name + " con identificador " + ID + " ha limpiado las habitaciones: ");
        for (int i = 0; i < limpiezas.size(); i++){
            System.out.println(limpiezas.get(i));
        }
        return limpiezas;
    }

    public boolean verifyClean(){
        return cleaning;
    }
}
