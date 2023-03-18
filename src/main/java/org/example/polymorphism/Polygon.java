package org.example.polymorphism;

public class Polygon {
    private int koseSayisi;

    public Polygon(int koseSayisi) {
        this.koseSayisi = koseSayisi;
    }

    public int getKoseSayisi() {
        return koseSayisi;
    }

    public void setKoseSayisi(int koseSayisi) {
        this.koseSayisi = koseSayisi;
    }

    public void render(){
        System.out.println("isleniyor ");
    }
}
