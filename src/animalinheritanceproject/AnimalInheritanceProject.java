/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalinheritanceproject;
//Note
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author bvance
 */
public class AnimalInheritanceProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        Object current;
        Ostrich myOstrich = new Ostrich();
        Penguin myPenguin = new Penguin();
        Eagle myEagle = new Eagle();
        Dolphin myDolphin = new Dolphin();
        Lion myLion = new Lion();
        Bat myBat = new Bat();
        Shark myShark = new Shark();
        Bass myBass = new Bass();
        FlyingFish myFlyingFish = new FlyingFish();
        List<Animal> Animals = new ArrayList();
        List<Bird> Birds = new ArrayList();
        List<Mammal> Mammals = new ArrayList();
        List<Fish> Fishes = new ArrayList();
        List<IFly> Flyers = new ArrayList();
        List<IWalk> Walkers = new ArrayList();
        List<ISwim> Swimmers = new ArrayList();
        List<IMakeSound> SoundMakers = new ArrayList();
        Animals.add(myOstrich);
        Animals.add(myPenguin);
        Animals.add(myEagle);
        Animals.add(myDolphin);
        Animals.add(myLion);
        Animals.add(myBat);
        Animals.add(myShark);
        Animals.add(myBass);
        Animals.add(myFlyingFish);
        
        Birds.add(myOstrich);
        Birds.add(myPenguin);
        Birds.add(myEagle);
        
        Mammals.add(myDolphin);
        Mammals.add(myLion);
        Mammals.add(myBat);
        
        Fishes.add(myShark);
        Fishes.add(myBass);
        Fishes.add(myFlyingFish);
        
        Flyers.add(myEagle);
        Flyers.add(myBat);
        Flyers.add(myFlyingFish);
        
        Walkers.add(myOstrich);
        Walkers.add(myPenguin);
        Walkers.add(myLion);

        Swimmers.add(myPenguin);
        Swimmers.add(myDolphin);
        Swimmers.add(myShark);
        Swimmers.add(myBass);
        Swimmers.add(myFlyingFish);
        
        SoundMakers.add(myOstrich);
        SoundMakers.add(myPenguin);
        SoundMakers.add(myEagle);
        SoundMakers.add(myDolphin);
        SoundMakers.add(myLion);
        SoundMakers.add(myBat);
        
        for(Animal animal : Animals)
        {            
            System.out.println(animal.name());
            
        }
        for(Bird bird : Birds)
        {
            System.out.println(bird.name());
            System.out.println(bird.setWingspan());
            
        }
        for(Mammal mammal : Mammals)
        {
            System.out.println(mammal.name());
            System.out.println(mammal.setBodyTemp());
        }
        for(Fish fish : Fishes)
        {
            System.out.println(fish.name());
            if(fish.isSaltWater())
            {
                System.out.println("Salt water");
            }
        }
        for(IFly flyer : Flyers)
        {
            flyer.Fly();
        }
        for(IWalk walker : Walkers)
        {
            walker.Walk();
        }
        for(ISwim swimmer : Swimmers)
        {
            swimmer.Swim();
        }
        for(IMakeSound soundmaker : SoundMakers)
        {
            soundmaker.MakeSound();
        }
        //Comment attempting to fix github
    }
}
