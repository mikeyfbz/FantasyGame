package creatureTests;

import game.equipment.Armour;
import game.equipment.Weapons;
import org.junit.Before;
import org.junit.Test;
import game.player.enemy.Dragon;
import game.player.person.Barbarian;

import static junit.framework.TestCase.assertEquals;

public class DragonTest {

    Dragon dragon;
    Barbarian barbarian;

    @Before
    public void before(){
        dragon = new Dragon("Puffy", 100, 80);
        barbarian = new Barbarian("Muscles", 300, Armour.PLATEARMOUR, Weapons.AXE);

    }


    @Test
    public void canHaveAName(){
        assertEquals("Puffy", dragon.getName());
    }

    @Test
    public void canHaveHP(){
        assertEquals(100, dragon.getHp());
    }

    @Test
    public void canHaveAttack(){
        assertEquals(80, dragon.getAttack());
    }

    @Test
    public void canTakeDamage(){
        barbarian.attack(dragon);
        assertEquals(10, dragon.getHp());
    }

    @Test
    public void canDoDamage(){
        dragon.attack(barbarian);
        assertEquals(284, barbarian.getHp());
    }

}
