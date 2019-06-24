package game.player.enemy;

import game.player.Player;

public abstract class Creature extends Player {

    protected int attack;

    public Creature(String name, int hp, int attack) {
        super(name, hp);
        this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }
}
