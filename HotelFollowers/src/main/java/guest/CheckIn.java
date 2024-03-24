/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guest;
import common.Lectura;
import static common.People.ID;
import static common.People.name;
import static housekeeping.Room.IDRoom;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrea
 */
public class CheckIn {
    private static int cant;
    private static final Lectura rd = new Lectura();
    static int floorA;
    static int floorB;
    static int roomA;
    static int roomB;
    static double payment;
    
    public static List<Integer> registerClients(){
        List<Integer> occupied = new ArrayList<>();
        ClientA p1 = new ClientA();
        ClientB p2 = new ClientB();
        floorA = 100;
        floorB = 100;
        roomA = 1;
        roomB = 26;
        cant = rd.leerInt("Ingrese la cantidad de huespedes a registrar: ");
        for (int i = 0; i < cant; i++){
            String type;
            do {
                type = rd.leerString("\n Ingrese el tipo de huesped."
                    + "\n a. para Huesped tipo A (VIP)"
                    + "\n b. para Huesped tipo B (Economico)"); 
                if (!type.equalsIgnoreCase("a") && !type.equalsIgnoreCase("b")) {
                    System.out.println("\n Tipo de cliente no valido");
                }
            }
            while (!type.equalsIgnoreCase("a") && !type.equalsIgnoreCase("b"));
            
            name = rd.leerString("\n Ingrese el nombre del huesped " + (i+1) +": ");
            ID = rd.leerInt("Ingrese la identificacion del huesped: ");          
            
            if (type.equalsIgnoreCase("a")){
                IDRoom = floor + roomA;
                roomA += 1;
                if (roomA > 25) {
                    floorA += 100;
                    roomA = 1; 
                } 
            }
            else if (type.equalsIgnoreCase("b")) {
                IDRoom = floor + roomB;
                roomB += 1;
                if (roomB > 50) {
                    floorB += 100;
                    roomB = 26;
                }
                
            }
            occupied.add(IDRoom);
            
            if (type.equalsIgnoreCase("a")) {
                payment = p1.paymentAmount();
            } else if (type.equalsIgnoreCase("b")) {
                payment = p2.paymentAmount();
            }

            System.out.println("El huesped " + name + " se hospedará en la habitación "
                    + IDRoom + " y pagará " + payment + " por noche.");
        }
        return occupied;
    }
}
