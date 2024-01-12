package QLSV.AdvanceOOP;

public class Instructor extends Person{
    private String department;
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public Instructor(int id,String name,String department){
        super(id,name);
        this.department=department;
    }
    @Override
    public void displayInfo(){
        System.out.print("Teacher name is "+getName());
        System.out.print("Teacher age is "+getDepartment());
    }
}
