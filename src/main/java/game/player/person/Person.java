package game.player.person;

import game.behaviours.ICollect;
import game.player.Player;

public abstract class Person extends Player implements ICollect {

    public Person(String name, int hp) {
        super(name, hp);
    }

    public void attack(Player player) {

    }

    public void defend(Player player) {

    }
}
