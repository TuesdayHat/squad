package models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/17/18.
 */
public class SquadTest {
    Squad testSquad = new Squad("The Squad");

    @Before
    public void setUp() {
        testSquad.setMaxSize(5);
        testSquad.setCause("Fight!");
        testSquad.setId(1);
    }

    @Test
    public void squadInstantiates() {
        assertTrue(testSquad != null);
    }

    @Test
    public void getName_getsNameOfSquad() {
        assert(testSquad.getName().equals("The Squad"));
    }

    @Test
    public void getMaxSize_getsMaxSizeOfSquad() {
        assert(testSquad.getMaxSize() >= 5);
    }

    @Test
    public void getCause_getCause(){
        assertEquals("Fight!", testSquad.getCause());
    }

    @Test
    public void getId_getSquadId(){
        assertEquals(1, testSquad.getId());
    }


}