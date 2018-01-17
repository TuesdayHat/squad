package models;

public class Squad {

    private String name;
    private int maxSize;
    private String cause;
    private int id;

    public Squad(String bName){
        name = bName;
//        setName(bName);
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
//    public void setName(String sName){
//        this.name = sName;
//    }

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

    //Overrides
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Squad squad = (Squad) o;

        if (id != squad.id) return false;
        return name.equals(squad.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + id;
        return result;
    }

}
