package roomTest;

import game.equipment.Armour;
import game.equipment.Treasure;
import game.equipment.Weapons;
import org.junit.Before;
import org.junit.Test;
import game.player.enemy.Creature;
import game.player.enemy.Dragon;
import game.player.enemy.Goblin;
import game.player.person.Barbarian;
import game.rooms.Dungeon;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class DungeonTest {

    Dungeon dungeon;
    Dragon dragon;
    Goblin goblin;
    Barbarian barbarian;
    ArrayList<Creature> creatures;

    @Before
    public void before(){
        creatures = new ArrayList<Creature>();
        dragon = new Dragon("Sparkles", 80, 50);
        goblin = new Goblin("Noby", 30, 20);
        dungeon = new Dungeon("The Pit", Treasure.DIAMONDS, creatures);
        creatures.add(dragon);
        creatures.add(goblin);
        barbarian = new Barbarian("Muscles", 300, Armour.PLATEARMOUR, Weapons.AXE);
    }

    @Test
    public void hasAName(){
        assertEquals("The Pit", dungeon.getName());
    }

    @Test
    public void hasTreasure(){
        assertEquals(Treasure.DIAMONDS, dungeon.getTreasure());
    }

    @Test
    public void hasACreature(){
        assertEquals(creatures, dungeon.getAllCreatures());
    }

    @Test
    public void roomStartsUncomplete(){
        assertEquals(false, dungeon.isRoomComplete());
    }

    @Test
    public void roomCanBeCompleted(){
        barbarian.attack(dragon);
        barbarian.collect(dungeon);
        barbarian.attack(goblin);
        assertEquals(true, dungeon.isRoomComplete());
    }
}
