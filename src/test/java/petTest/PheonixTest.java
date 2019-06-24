package petTest;

import org.junit.Before;
import org.junit.Test;
import game.player.enemy.Dragon;
import game.player.pet.Pheonix;

import static junit.framework.TestCase.assertEquals;

public class PheonixTest {


    Pheonix pheonix;
    Dragon dragon;

    @Before
    public void before(){
        pheonix = new Pheonix("Ash", 50, 40, 30);
        dragon = new Dragon("Sparkles", 100, 50);
    }

    @Test
    public void hasAName(){
        assertEquals("Ash", pheonix.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(50, pheonix.getHp());
    }

    @Test
    public void hasAnAttack(){
        assertEquals(40, pheonix.getAttack());
    }

    @Test
    public void hasADefend(){
        assertEquals(30, pheonix.getDefend());
    }

    @Test
    public void canTakeDamage(){
        dragon.attack(pheonix);
        assertEquals(0, pheonix.getHp());
    }

    @Test
    public void canDoDamage(){
        pheonix.attack(dragon);
        assertEquals(60, dragon.getHp());
    }

}
