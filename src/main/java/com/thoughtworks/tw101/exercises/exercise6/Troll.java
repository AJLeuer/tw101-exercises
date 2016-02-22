package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Adam on 2/22/16.
 */
public class Troll extends GenericMonster {

    public Troll() {
        //Trolls are named “Troll”, have 40 hit points...
        super("Troll", 40) ;
    }

    @Override
    public void takeDamage(int amount) {
        //...and only take half damage
        super.takeDamage(amount / 2);
    }
}
