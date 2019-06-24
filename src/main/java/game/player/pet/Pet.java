package game.player.pet;

import game.behaviours.IAttack;
import game.player.enemy.Creature;

public abstract class Pet extends Creature implements IAttack {

    private int defend;

    public Pet(String name, int hp, int attack, int defend) {
        super(name, hp, attack);
        this.defend = defend;
    }

    public int getDefend() {
        return defend;
    }

    public int defendMaster(){
        return  getDefend();
    }
}
