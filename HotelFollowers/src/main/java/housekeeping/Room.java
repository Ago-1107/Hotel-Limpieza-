/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package housekeeping;

import common.Lectura;
/**
 *
 * @author Andrea
 */
public class Room {
    private static final Lectura rd = new Lectura();
    public static int IDRoom;

    public Room() {
    }

    public Room(int IDRoom) {
        this.IDRoom = IDRoom;
    }
    
    public static int registroID(int IDRoom){
        IDRoom = rd.leerInt("Ingrese el número de la habitacion que limpiará: ");
        IDRoom = rd.ValidarInt(IDRoom);
        return IDRoom;
    }
            
}
