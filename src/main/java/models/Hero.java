package models;

public class Hero {
    private String name;
    private int id;
    private int squadId;
    private String power;
    private String weakness;

    public Hero(String bName){
        name = bName;
    }

    public void setId(int num){
        this.id = num;
    }
    public void setPower(String pow){
        this.power = pow;
    }
    public void setWeakness(String weak){
        this.weakness = weak;
    }
    public void setSquadId(int num){
        this.squadId = num;
    }
    //Getters--------
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getSquadId() {
        return squadId;
    }
    public String getPower(){
        return power;
    }
    public String getWeakness(){
        return weakness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hero hero = (Hero) o;

        if (id != hero.id) return false;
        if (squadId != hero.squadId) return false;
        return name.equals(hero.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + id;
        result = 31 * result + squadId;
        return result;
    }
}
