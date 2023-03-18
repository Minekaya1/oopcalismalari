package org.example.inheritance;

public class ElectronicDevice {
    private int fiyatBilgisi;
    private String name;
    public void garantiSuresiBittiMi(int alinmaYili, int bugun){
        if (bugun-alinmaYili<2){
            System.out.println("garanti devam ediyor ");
        }else {
            System.out.println("garanti süresi sona ermiştir ");
        }

    }

    public ElectronicDevice(int fiyatBilgisi, String name) {
        this.fiyatBilgisi = fiyatBilgisi;
        this.name = name;
    }
}
