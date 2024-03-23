/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package housekeeping;

import common.People;

/**
 *
 * @author Andrea
 */
public class Housekeeping extends People {
    static String area;
    static boolean cleaning;

    public Housekeeping(String area, String name, int ID, int age) {
        super(name, ID, age);
        this.area = area;
    }
     
}
