package game.player.person;

import game.equipment.Armour;
import game.equipment.Weapons;

public abstract class Warrior extends Person {

    protected int napsack;
    protected Armour armour;
    protected Weapons weapons;

    public Warrior(String name, int hp, Armour armour, Weapons weapons) {
        super(name, hp);
        this.napsack = 0;
        this.armour = armour;
        this.weapons = weapons;
    }

    public int getNapsack() {
        return napsack;
    }

    public Armour getArmour() {
        return armour;
    }

    public Weapons getWeapons() {
        return weapons;
    }
}
