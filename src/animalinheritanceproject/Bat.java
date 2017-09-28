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
public class Bat extends Mammal{
    String name;
    double bodyTemp;
    @Override
    public double setBodyTemp() {
        bodyTemp = 100.4;
        return bodyTemp;
    }

    @Override
    public String name() {
        name = "Bat";
        return name;
    }

    @Override
    public void Fly() {
        System.out.println(name + "is flying");
    }

    @Override
    public void Walk() {
        System.out.println(name + " is not walking");
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
