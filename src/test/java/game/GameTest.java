package game;

import game.equipment.Armour;
import game.equipment.Treasure;
import game.equipment.Weapons;
import game.player.enemy.Creature;
import game.player.enemy.Dragon;
import game.player.enemy.Goblin;
import game.player.person.Barbarian;
import game.rooms.Dungeon;
import game.rooms.Room;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class GameTest {

    Game game;
    Room dungeon1;
    Room dungeon2;
    Room dungeon3;
    Dragon dragon1;
    Dragon dragon2;
    Dragon dragon3;
    Goblin goblin1;
    Goblin goblin2;
    Goblin goblin3;

    Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian("Muscles", 300, Armour.PLATEARMOUR, Weapons.AXE);
        goblin1 = new Goblin("Mini", 30, 20);
        dragon1 = new Dragon("Sparks", 60, 50);
        ArrayList<Creature> creatures1 = new ArrayList<Creature>();
        creatures1.add(goblin1);
        creatures1.add(dragon1);
        goblin2 = new Goblin("Mini", 30, 20);
        dragon2 = new Dragon("Sparks", 60, 50);
        ArrayList<Creature> creatures2 = new ArrayList<Creature>();
        creatures2.add(goblin2);
        creatures2.add(dragon2);
        goblin3 = new Goblin("Mini", 30, 20);
        dragon3 = new Dragon("Sparks", 60, 50);
        ArrayList<Creature> creatures3 = new ArrayList<Creature>();
        creatures3.add(goblin3);
        creatures3.add(dragon3);
        dungeon1 = new Dungeon("The Pit", Treasure.DIAMONDS, creatures1);
        dungeon2 = new Dungeon("Breaker", Treasure.GOLD, creatures2);
        dungeon3 = new Dungeon("Mangler", Treasure.DIAMONDS, creatures3);
        ArrayList<Room> rooms = new ArrayList<Room>();
        rooms.add(dungeon1);
        rooms.add(dungeon2);
        rooms.add(dungeon3);
        game = new Game(rooms);
    }

    @Test
    public void gameStartsWithRooms(){
        assertEquals(3, game.getRooms().size());
    }

    @Test
    public void whenRoomCompleteItIsRemovedFromGame(){
        barbarian.attack(dragon1);
        barbarian.attack(goblin1);
        barbarian.collect(dungeon1);
        game.removeCompletedRooms();
        assertEquals(2, game.getRooms().size());
    }

}
