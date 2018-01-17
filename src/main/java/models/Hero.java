package models;

public class Hero {
    private String name;
    private int id;
    private String power;
    private String weakness;

    Hero(String bName){
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

    //Getters--------
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public String getPower(){
        return power;
    }
    public String getWeakness(){
        return weakness;
    }
}
