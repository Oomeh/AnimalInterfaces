/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalinheritanceproject;

/**
 *
 * @author bvance
 */
public class Lion extends Mammal{
    String name;
    double bodyTemp;
    @Override
    public double setBodyTemp() {
        bodyTemp = 100.5;
        return bodyTemp;
    }

    @Override
    public String name() {
        name = "Lion";
        return name;
    }

    @Override
    public void Fly() {
        System.out.println(name + "is not flying");
    }

    @Override
    public void Walk() {
        System.out.println(name + " is walking");
    }

    @Override
    public void Swim() {
        System.out.println(name + " is not swimming");
    }

    @Override
    public void MakeSound() {
        System.out.println(name + " is making sound");
    }
    
}
