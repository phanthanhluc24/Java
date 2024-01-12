package QLSV.AdvanceOOP;

import java.util.ArrayList;

public class Student extends Person{
    private int age;
    private ArrayList<Course> course = new ArrayList<>();
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public ArrayList<Course> getCourse() {
        return course;
    }
    public void setCourse(ArrayList<Course> course) {
        this.course = course;
    }
    public Student(int id,String name,int age){
        super(id,name);
        this.age=age;
    }
    @Override
    public void displayInfo(){
        System.out.print("Student name is "+getName());
        System.out.print("Student age is "+getAge());
    }
}
