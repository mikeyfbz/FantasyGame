package game.player.enemy;

import game.player.Player;

public class Goblin extends Creature {
    public Goblin(String name, int hp, int attack) {
        super(name, hp, attack);
    }

    public void attack(Player player) {
        player.takeDamage(this.attack);
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
