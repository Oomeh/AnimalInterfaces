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
public class Penguin extends Bird{
    String name;
    double Wingspan;
    @Override
    public double setWingspan() {
        Wingspan = 2.5;
        return Wingspan;
    }

    @Override
    public String name() {
        name = "Penguin";
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
        System.out.println(name + " is swimming");
    }

    @Override
    public void MakeSound() {
        System.out.println(name + " is making sound");
    }
    
}
