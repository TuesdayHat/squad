package dao;

import models.Squad;
import models.Hero;

import java.util.List;

public interface SquadDao {

    //create
    void add (Squad squad);

//    //read
    List<Squad> getAll();
//    List<Hero> getAllHeroesBySquad(int squadId);

    Squad findById(int id);

//    //update
    void update(int id, String name);
//
//    //delete
//    void deleteById(int id);
    void clearAllSquads();
}
