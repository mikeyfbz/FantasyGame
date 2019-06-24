package game.player.person;

import game.equipment.Armour;
import game.equipment.Weapons;
import game.player.Player;
import game.rooms.Room;

public class Barbarian extends Warrior {


    public Barbarian(String name, int hp, Armour armour, Weapons weapons) {
        super(name, hp, armour, weapons);
    }

    public void attack(Player player) {
        player.takeDamage(this.weapons.getValue());

    }

    public void collect(Room room) {
        napsack += room.getTreasure().getValue();
        room.treasureCollected();
    }

    public void takeDamage(int damage) {
        this.hp -= (damage / this.armour.getValue());
        if(this.hp < 0){
            this.hp = 0;
        }
    }

    public void recover(int value) {
        this.hp += value;
    }
}
