package org.example.abstractAndInterface;

import org.example.abstractAndInterface.AnimalAbstract;
import org.example.abstractAndInterface.AnimalInterface;
import org.example.abstractAndInterface.CatBehav;

public class ControlAnimal implements AnimalInterface, CatBehav  {


    @Override
    public void walkFast(AnimalAbstract animalAbstract) {
        System.out.println("they can walk fast");
    }

    @Override
    public boolean isHealthy(AnimalAbstract animalAbstract) {
        if (animalAbstract.breath()){
            return false;
        }
        else {
            return true;
        }

    }

    @Override
    public void isRun(AnimalAbstract animalAbstract) {

    }
}
