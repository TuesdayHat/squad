package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/17/18.
 */
public class SquadTest {
    Squad testSquad = new Squad();

    @Test
    public void squadInstantiates() {
        assertTrue(testSquad != null);
    }

}