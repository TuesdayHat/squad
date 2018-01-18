package dao;

import models.Hero;

import java.util.List;

/**
 * Created by Guest on 1/18/18.
 */
public interface HeroDao {
    //create
    void add(Hero hero);

    //read
    List<Hero> getAll();

    Hero findById(int id);
    //update
    void update(int id, String content, int squadId);

    //delete
    void deleteById(int id);
    void clearAllHeroes();

}