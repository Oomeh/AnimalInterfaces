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
public abstract class Animal implements IFly, IWalk, ISwim, IMakeSound{

    public abstract String name();
    
}
