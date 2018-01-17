package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/17/18.
 */
public class SquadTest {
    Squad testSquad = new Squad("The Squad");

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
        testSquad.setMaxSize(5);
        assert(testSquad.getMaxSize() >= 5);
    }

//    @Test
//    public void getCause_getCause(){
//
//    }
//
//    @Test
//    public void getId_getSquadId(){
//
//    }
//
//    @Test
//    public void getMembers_getListOfMembers(){
//
//    }

}