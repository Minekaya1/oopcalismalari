package org.example.polymorphism;

public class Kare extends Polygon {


    public Kare(int koseSayisi) {
        super(koseSayisi);
    }

    public void render(){
        System.out.println(getKoseSayisi()+" köşe işlendi ");
    }
}
