package models;

public class Squad {

    private String name;
    private int maxSize;
    private String cause;
    private int id;

    Squad(String bName){
        name = bName;
    }


    public void setMaxSize(int max){
        this.maxSize = max;
    }
    public void setCause(String fight){
        this.cause = fight;
    }
    public void setId(int num) {
        this.id = num;
    }

    //GETTERS
    public String getName(){
        return name;
    }
    public int getMaxSize(){
        return maxSize;
    }
    public String getCause(){
        return cause;
    }
    public int getId(){
        return id;
    }

}
