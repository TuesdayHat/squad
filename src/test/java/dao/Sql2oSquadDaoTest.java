package dao;

import models.Squad;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import static org.junit.Assert.*;

public class Sql2oSquadDaoTest {
    private Sql2oSquadDao squadDao;
    private Connection conn;

    @Before
    public void setUp() throws Exception {
        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");
        squadDao = new Sql2oSquadDao(sql2o);

        conn = sql2o.open();
    }
    @After
    public void tearDown() throws Exception {
        conn.close();
    }

    @Test
    public void add() throws Exception {
        Squad squad = new Squad("PunchCorp");
        int originalSquadId = squad.getId();
        squadDao.add(squad);
        assertNotEquals(originalSquadId, squad.getId());

    }
    @Test
    public void existingSquadCanBeFoundById() throws Exception {
        Squad squad = new Squad("PunchCorp");
        squadDao.add(squad);
        Squad foundSquad = squadDao.findById(squad.getId());
        assertEquals(squad, foundSquad);
    }
    @Test
    public void addedCategoriesAreReturnedFromGetAll() throws Exception {
        Squad squad = new Squad("PunchCorp");
        squadDao.add(squad);
        assertEquals(1, squadDao.getAll().size());
    }

    @Test
    public void noSquadsReturnsEmptyList() throws Exception {
        assertEquals(0, squadDao.getAll().size());
    }

    @Test
    public void updateChangesSquadContent() throws Exception {
        String initialName = "PunchCorp";
        Squad squad = new Squad(initialName);
        squadDao.add(squad);

        squadDao.update(squad.getId(), "KickingInc");
        Squad updatedSquad = squadDao.findById(squad.getId());
        assertNotEquals(initialName, updatedSquad.getName());
    }

    @Test
    public void clearAllSquadsClearsAll() throws Exception {
        Squad squadOne = new Squad("PunchCorp");
        Squad squadTwo = new Squad("KickingInc");
        squadDao.add(squadOne);
        squadDao.add(squadTwo);

        assertEquals(2, squadDao.getAll().size());
        squadDao.clearAllSquads();

        assertEquals(0, squadDao.getAll().size());
    }

}