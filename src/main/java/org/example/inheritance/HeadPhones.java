package org.example.inheritance;

class HeadPhones extends ElectronicDevice {
    private int kabloUzunlugu;

    public HeadPhones(int fiyatBilgisi, String name) {
        super(fiyatBilgisi, name);
        this.kabloUzunlugu = kabloUzunlugu;
    }

    @Override
    public void garantiSuresiBittiMi(int alinmaYili, int bugun) {
        super.garantiSuresiBittiMi(alinmaYili, bugun);
    }

    public boolean sarjliSarssiz(String answer) {
        if (answer.equals("sarjli")) {
            return true;
        } else {
           return false;
        }
    }

}

