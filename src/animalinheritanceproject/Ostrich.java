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
public class Ostrich extends Bird{
    String name;
    double Wingspan;
    @Override
    public double setWingspan() {
        Wingspan = 6.6;
        return Wingspan;
    }
    
    @Override
    public String name() {
        name = "Ostrich";
        return name;
    }

    @Override
    public void Fly() {
        System.out.println(name + " is not flying");
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
