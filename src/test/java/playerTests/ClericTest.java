package playerTests;

import game.equipment.*;
import org.junit.Before;
import org.junit.Test;
import game.player.enemy.Creature;
import game.player.enemy.Dragon;
import game.player.enemy.Goblin;
import game.player.person.Barbarian;
import game.player.person.Cleric;
import game.rooms.Dungeon;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class ClericTest {

    Cleric cleric;
    Dragon dragon;
    Dungeon dungeon;
    Goblin goblin;
    Barbarian barbarian;
    ArrayList<Creature> creatures;

    @Before
    public void before(){
        cleric = new Cleric("Harold", 150, Shield.MEATSHEILD, Potions.ELIXIR);
        dragon = new Dragon("Sparkles", 100, 50);
        goblin = new Goblin("Noby", 30, 20);
        creatures = new ArrayList<Creature>();
        creatures.add(dragon);
        creatures.add(goblin);
        dungeon = new Dungeon("The Pit", Treasure.DIAMONDS, creatures);
        barbarian = new Barbarian("Muscles", 20, Armour.PLATEARMOUR, Weapons.AXE);
    }

    @Test
    public void hasAName(){
        assertEquals("Harold", cleric.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(150, cleric.getHp());
    }

    @Test
    public void hasAShield(){
        assertEquals(Shield.MEATSHEILD, cleric.getShield());
    }

    @Test
    public void hasAPotion(){
        assertEquals(Potions.ELIXIR, cleric.getPotions());
    }

    @Test
    public void napsackStartsEmpty(){
        assertEquals(0, cleric.getNapsack());
    }

    @Test
    public void canCollectTreasure(){
        cleric.collect(dungeon);
        assertEquals(500, cleric.getNapsack());
    }

    @Test
    public void canHealOthers(){
        cleric.heal(barbarian);
        assertEquals(120, barbarian.getHp());
    }

    @Test
    public void canTakeDamage(){
        dragon.attack(cleric);
        assertEquals(120, cleric.getHp());
    }

}
