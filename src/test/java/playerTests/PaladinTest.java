package playerTests;

import game.equipment.Spells;
import org.junit.Before;
import org.junit.Test;
import game.player.enemy.Dragon;
import game.player.person.Paladin;
import game.player.pet.Pheonix;

import static junit.framework.TestCase.assertEquals;

public class PaladinTest {

    Paladin paladin;
    Pheonix pheonix;
    Dragon dragon;

    @Before
    public void before(){
        pheonix = new Pheonix("Sparks", 80, 50, 80);
        paladin = new Paladin("Rory", 100, pheonix, Spells.LIGHTENINGSTRIKE);
        dragon = new Dragon("Sparkles", 100, 100);
    }

    @Test
    public void hasAName(){
        assertEquals("Rory", paladin.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(100, paladin.getHp());
    }

    @Test
    public void petHasAnAttackValue(){
        assertEquals(50, paladin.getPet().getAttack());
    }

    @Test
    public void hasAnAttackSpell(){
        assertEquals(Spells.LIGHTENINGSTRIKE, paladin.getSpells());
    }

    @Test
    public void paladinCanBeDefendedByPet(){
        dragon.attack(paladin);
        assertEquals(80, paladin.getHp());
    }

    @Test
    public void paladinCanTakeDamage(){
        pheonix = new Pheonix("Ash", 0, 50, 50);
        paladin = new Paladin("Rory", 100, pheonix, Spells.LIGHTENINGSTRIKE);
        dragon.attack(paladin);
        assertEquals(0, paladin.getHp());
    }

    @Test
    public void canDoDamage(){
        paladin.attack(dragon);
        assertEquals(50, dragon.getHp());
    }

}
