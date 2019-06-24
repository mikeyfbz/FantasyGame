package game.rooms;

import game.equipment.Treasure;
import game.player.enemy.Creature;

import java.util.ArrayList;

public class Dungeon extends Room {
    public Dungeon(String name, Treasure treasure, ArrayList<Creature> creatures) {
        super(name, treasure, creatures);
    }
}
