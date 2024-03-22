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
public class ClientA extends People implements Client {
    String gender;
    String disability;
    String workStatus;

    public ClientA() {
    }

    public ClientA(String gender, String disability, String workStatus, String name, int ID, int age) {
        super(name, ID, age);
        this.gender = gender;
        this.disability = disability;
        this.workStatus = workStatus;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDisability() {
        return disability;
    }
    public void setDisability(String disability) {
        this.disability = disability;
    }

    public String getWorkStatus() {
        return workStatus;
    }
    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClientA{");
        sb.append("gender=").append(gender);
        sb.append(", disability=").append(disability);
        sb.append(", workStatus=").append(workStatus);
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public double paymentAmount() {
        double price = 1500000;
        return price;
    }
    
    
}
