public class Process {
    private int pagesize,year;
    private String name,actor;

    Process(String name, String actor, int pagesize, int year){
        this.name=name;
        this.actor=actor;
        this.pagesize=pagesize;
        this.year=year;
    }
    public int getPagesize(){
        return this.pagesize;
    }
    public int getYear(){
        return this.year;
    }
    public String getName(){
        return this.name;
    }
    public String getActor(){
        return this.actor;
    }
    public void setPagesize(int newPageSize){
        this.pagesize=newPageSize;
    }
    public void setYear(int newYear){
        this.year=newYear;
    }
    public void setActor(String newActor) {
        this.actor = newActor;
    }
    public void setName(String newName){
        this.name=newName;
    }

}
