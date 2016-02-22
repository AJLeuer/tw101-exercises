package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Adam on 2/22/16.
 */
public abstract class GenericMonster implements Monster {

    protected String name ;
    protected int hitPoints ;

    public GenericMonster(String name, int hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
    }

    @Override
    public void takeDamage(int amount) {
        hitPoints -= amount ;
    }

    @Override
    public void reportStatus() {
        System.out.println("Monster name: " + name) ;
        System.out.println("Hit Points: " + hitPoints) ;
        System.out.println() ;
    }

}
