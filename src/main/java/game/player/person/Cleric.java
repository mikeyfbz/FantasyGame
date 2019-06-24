package game.player.person;

import game.equipment.Potions;
import game.equipment.Shield;
import game.player.Player;
import game.rooms.Room;

public class Cleric extends Person {

    private Shield shield;
    private Potions potions;
    private int napsack;

    public Cleric(String name, int hp, Shield shield, Potions potions) {
        super(name, hp);
        this.shield = shield;
        this.potions = potions;
        this.napsack = 0;
    }

    public Shield getShield() {
        return shield;
    }

    public Potions getPotions() {
        return potions;
    }

    public int getNapsack() {
        return napsack;
    }

    public void attack(Player player) {
    }

    public void collect(Room room) {
        napsack += room.getTreasure().getValue();
        room.treasureCollected();
    }

    public void takeDamage(int damage) {
        this.hp -= (damage - this.shield.getValue());
        if(this.hp < 0){
            this.hp = 0;
        }
    }

    public void heal(Player player){
        player.recover(potions.getValue());
    }

    public void recover(int value) {
        this.hp += value;
    }
}
