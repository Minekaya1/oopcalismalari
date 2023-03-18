package org.example.inheritance;

public class main {
    public static void main(String[] args) {
        ElectronicDevice electronicDevice  = new ElectronicDevice(470,"elektronik cihazlar ");
        HeadPhones headPhones = new HeadPhones(750,"kulaklik");

        electronicDevice.garantiSuresiBittiMi(2018,2021);
        headPhones.sarjliSarssiz("sarjli");
        headPhones.garantiSuresiBittiMi(2021,2022);

    }
}
