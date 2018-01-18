package dao;

import models.Hero;

/**
 * Created by Guest on 1/18/18.
 */
public interface HeroDao {
    //create
    void add(Hero hero);

    //read

    Hero findById(int id);
}