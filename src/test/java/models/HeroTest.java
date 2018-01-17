package models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/17/18.
 */
public class HeroTest {
    Hero testHero = new Hero("Punch Man");

    @Before
    public void setUp(){
        testHero.setId(1);
        testHero.setPower("Punching");
        testHero.setWeakness("Glass Jaw");
    }

    @Test
    public void heroInstantiates(){
        assertTrue(testHero != null);
    }

    @Test
    public void getName(){
        assertEquals("Punch Man", testHero.getName());
    }
    @Test
    public void getPower(){
        assertEquals("Punching", testHero.getPower());
    }
    @Test
    public void getWeakness(){
        assertEquals("Glass Jaw", testHero.getWeakness());
    }
    @Test
    public void getId(){
        assertEquals(1, testHero.getId());
    }

}