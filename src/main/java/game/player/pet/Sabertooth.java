package game.player.pet;

import game.player.Player;

public class Sabertooth extends Pet {

    public Sabertooth(String name, int hp, int attack, int defend) {
        super(name, hp, attack, defend);
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
