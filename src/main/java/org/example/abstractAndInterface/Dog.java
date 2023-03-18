package org.example.abstractAndInterface;

import org.example.abstractAndInterface.AnimalAbstract;

public class Dog extends AnimalAbstract {
    public void sound(){
        System.out.println("bark ");
    }

    @Override
    void walk() {

    }
}
