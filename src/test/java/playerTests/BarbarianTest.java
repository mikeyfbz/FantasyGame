package playerTests;

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

public class BarbarianTest {

    Barbarian barbarian;
    Dragon dragon;
    Goblin goblin;
    ArrayList<Creature> creatures;
    Dungeon dungeon;

    @Before
    public void before(){
        barbarian = new Barbarian("Muscles", 300, Armour.PLATEARMOUR, Weapons.AXE);
        dragon = new Dragon("Sparkles", 80, 50);
        goblin = new Goblin("Noby", 30, 20);
        creatures = new ArrayList<Creature>();
        creatures.add(dragon);
        creatures.add(goblin);
        dungeon = new Dungeon("The Pit", Treasure.DIAMONDS, creatures);
    }

    @Test
    public void hasAName(){
        assertEquals("Muscles", barbarian.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(300, barbarian.getHp());
    }

    @Test
    public void hasArmour(){
        assertEquals(Armour.PLATEARMOUR, barbarian.getArmour());
    }

    @Test
    public void hasAWeapon(){
        assertEquals(Weapons.AXE, barbarian.getWeapons());
    }

    @Test
    public void barbarianCanTakeDamage(){
        dragon.attack(barbarian);
        assertEquals(290, barbarian.getHp());
    }

    @Test
    public void barbarianCanCollectTreasure(){
        barbarian.collect(dungeon);
        assertEquals(500, barbarian.getNapsack());
    }

    @Test
    public void barbarianCanKillCreature(){
        barbarian.attack(dungeon.getCreature(dragon));
        barbarian.attack(dungeon.getCreature(goblin));
        assertEquals(0, dragon.getHp());
    }

    @Test
    public void barbarianCanCompleteRoom(){
        barbarian.attack(dungeon.getCreature(dragon));
        barbarian.attack(dungeon.getCreature(goblin));
        barbarian.collect(dungeon);
        assertEquals(true, dungeon.isRoomComplete());
    }
}
