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
    static int floor;
    static int room;
    static double payment;
    
    public static List<Integer> registerPlayers(){
        List<Integer> occupied = new ArrayList<>();
        Player p1 = new Player();
        floor = 100;
        room = 1;
        cant = rd.leerInt("Ingrese la cantidad de jugadores a registrar: ");
        for (int i = 0; i < cant; i++){
            name = rd.leerString("Ingrese el nombre del jugador: ");
            ID = rd.leerInt("Ingrese su identificacion: ");
            if (room > 25){
                floor += 100;
                room = 1;
            }
            IDRoom = floor + room;
            room += 1;
            occupied.add(IDRoom);
            payment = p1.paymentAmount();
            System.out.println("El jugador " +name+ " se hospedará en la habitación " +IDRoom+ " y pagará " +payment+ " por noche.");            
        }
        
        return occupied;
    }
}
