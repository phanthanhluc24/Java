package QLSV.AdvanceOOP;

public abstract class Person {
    private int id;
    public String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Person(int id,String name){
        this.id=id;
        this.name=name;
    }
    public abstract void displayInfo();
}
