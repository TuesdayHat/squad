package dao;

import models.Squad;
import models.Hero;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;


public class Sql2oSquadDao implements SquadDao{

    private final Sql2o sql2o;

    public Sql2oSquadDao(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void add(Squad squad){
        String sql = "INSERT INTO squads (name) VALUES (:name)";
        try(Connection con = sql2o.open()){
            int id = (int) con.createQuery(sql)
                    .bind(squad)
                    .executeUpdate()
                    .getKey();
            squad.setId(id);
        } catch (Sql2oException ex){
            System.out.println(ex); //error message
        }
    }
}
