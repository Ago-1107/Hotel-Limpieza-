/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guest;

import common.People;

/**
 *
 * @author Andrea
 */
public class Player extends People implements Client{
    int number;
    String position;

    public Player() {
    }
    
    public Player(int number, String position, String name, int age) {
        super(name, age, ID);
        this.number = number;
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public double paymentAmount() {
        double price = 3000000;
        return price;
    }
    
    
}
