/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

/**
 *
 * @author Andrea
 */
public class People {
    public static String name;
    public static int ID;
    public static int age;
    
    public People() {       
    }

    public People(String name, int ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getID() {
        return ID;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" + "name=" + name + "ID=" + ID + ", age=" + age + '}';
    }
       
    
    
}
