package game.player.enemy;

import game.player.Player;

public class Ogre extends Creature {

    public Ogre(String name, int hp, int attack) {
        super(name, hp, attack);
    }

    public void attack(Player player) {

    }

    public void defend(Player player) {

    }

    public void takeDamage(int damage) {
        this.hp -= damage;
        if(this.hp < 0){
            this.hp = 0;
        }
    }

    public void recover(int value) {
        this.hp += value;
    }
}
