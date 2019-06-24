package game.player.person;

import game.equipment.Spells;
import game.player.Player;
import game.player.pet.Pet;
import game.rooms.Room;

public class Paladin extends Magic {

    public Paladin(String name, int hp, Pet pet, Spells spells) {
        super(name, hp, pet, spells);
    }

    public void attack(Player player) {
        player.takeDamage(spells.getValue());
    }

    public void collect(Room room) {
        napsack += room.getTreasure().getValue();
        room.treasureCollected();
    }

    public void takeDamage(int damage) {
        if(pet.getHp() == 0){
            this.hp -= damage;
        } else {
            this.hp -= (damage - pet.getDefend());
            if(this.hp < 0) {
                this.hp = 0;
            }
        }
    }

    public void recover(int value) {
        this.hp += value;
    }
}
