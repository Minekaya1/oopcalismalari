package org.example.encapsulation;

import java.util.Objects;

public class EmployeeInOffice {
    private String name;
    private int id;
    private int telephoneNumber;
    private String adress;

    public EmployeeInOffice(String name,int telephoneNumber, String adress) {
        this.name = name;
        this.telephoneNumber = telephoneNumber;
        this.adress = adress;
    }


    public void showInfo(){
        System.out.println("isim"+this.name);
        System.out.println("telefon numarası"+this.telephoneNumber);
        System.out.println("adresi" +this.adress);
    }
    public void checkAdress(){
        if (Objects.equals(adress, "ankara")){
            this.adress="ankara";

        }else {
            this.adress="change adress";
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
//id get set etmediğim için mainde çağıramıyorum.
