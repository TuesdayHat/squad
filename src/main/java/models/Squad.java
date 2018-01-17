package models;

/**
 * Created by Guest on 1/17/18.
 */
public class Squad {

    private String name;
    private int maxSize;

    Squad(String bName){
        name = bName;
    }


    public void setMaxSize(int max){
        this.maxSize = max;
    }

    //GETTERS
    public String getName(){
        return name;
    }
    public int getMaxSize(){
        return maxSize;
    }

}
