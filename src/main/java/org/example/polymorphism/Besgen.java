package org.example.polymorphism;

public class Besgen extends Polygon {
    public Besgen(int koseSayisi) {
        super(koseSayisi);
    }
    public void render(){
        System.out.println(getKoseSayisi()+" kose sayisi alindi ");
    }
}
