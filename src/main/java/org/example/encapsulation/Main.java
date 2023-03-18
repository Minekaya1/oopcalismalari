package org.example.encapsulation;

public class Main {
    public static void main(String[] args) {


        EmployeeInOffice employeeInOffice = new EmployeeInOffice("mine", 1235, "ankara");


        employeeInOffice.showInfo();
        employeeInOffice.setAdress("istanbul");
        employeeInOffice.setName("ali");
        employeeInOffice.setTelephoneNumber(12336);
        employeeInOffice.checkAdress();


        String name = employeeInOffice.getName();
        System.out.println("adı: " + name);
        System.out.println("adresi: " + employeeInOffice.getAdress());
        System.out.println("telefon numarası: " + employeeInOffice.getTelephoneNumber());

    }

//encapsulation



}