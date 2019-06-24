package game.rooms;

import game.equipment.Treasure;
import game.player.enemy.Creature;

import java.util.ArrayList;

public abstract class Room {

    private String name;
    private Treasure treasure;
    private ArrayList<Creature> creatures;
    private boolean roomComplete;

    public Room(String name, Treasure treasure, ArrayList<Creature> creatures){
        this.name = name;
        this.treasure = treasure;
        this.creatures = creatures;
        this.roomComplete = false;
    }


    public String getName() {
        return name;
    }

    public Treasure getTreasure() {
        return treasure;
    }

    public Creature getCreature(Creature creature) {
        Creature attacked = null;
        if(this.creatures.contains(creature)){
            attacked = creature;
        }
        return attacked;
    }

    public ArrayList<Creature> getAllCreatures(){
        return this.creatures;
    }

    public boolean isRoomComplete() {
        boolean complete = false;
        boolean creaturesDead = false;
        ArrayList<Creature> remove = new ArrayList<Creature>();
        for (Creature creature:this.creatures) {
            if(creature.getHp() == 0){
                remove.add(creature);
            }
        }
        for (Creature creature:remove) {
            creatures.remove(creature);
        }
        if(creatures.size() == 0){
            creaturesDead = true;
        }
        if(this.treasure == null && creaturesDead){
             complete = true;
        }
        return complete;
    }

    public void treasureCollected(){
        this.treasure = null;
    }
}
