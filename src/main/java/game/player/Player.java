package game.player;

import game.behaviours.IAttack;
import game.behaviours.IRecover;
import game.behaviours.ITakeDamage;

public abstract class Player implements IAttack, ITakeDamage, IRecover {

    private String name;
    protected int hp;

    public Player(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

}
