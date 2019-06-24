package game.player.person;

import game.equipment.Spells;
import game.player.pet.Pet;

public abstract class Magic extends Person {

    protected int napsack;
    protected Pet pet;
    protected Spells spells;

    public Magic(String name, int hp, Pet pet, Spells spells) {
        super(name, hp);
        this.napsack = 0;
        this.pet = pet;
        this.spells = spells;
    }

    public int getNapsack() {
        return napsack;
    }

    public Pet getPet() {
        return pet;
    }

    public Spells getSpells() {
        return spells;
    }

}
