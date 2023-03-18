package org.example.abstractAndInterface;

import org.example.abstractAndInterface.ControlAnimal;
import org.example.abstractAndInterface.Dog;

public class Mainn {
    public static void main(String[] args) {
        Dog dog= new Dog();
        dog.sound();
        dog.walk();
        dog.eat();

        ControlAnimal controlAnimal= new ControlAnimal();
        if (controlAnimal.isHealthy(dog)) {
            System.out.println("sağlıklı ");
        }



    }
}
