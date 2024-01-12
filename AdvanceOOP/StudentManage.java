package QLSV.AdvanceOOP;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {

    public StudentManage(ArrayList<Student> students){
        students.add(new Student(1, "Phan Thanh Luc", 18));
        students.add(new Student(2, "Tran Quoc Huu", 18));
        students.add(new Student(3, "Vo Thanh Tam", 18));
        students.add(new Student(4, "Nguyen Van Bien", 18));
    }
    public void displayInfo(ArrayList<Student> students){
        System.out.println("----------------------------------------------------------");
        System.out.printf("| %-4s | %-15s | %-15s |\n","STT","Full Name","Age");
        System.out.println("----------------------------------------------------------");
        for (Student sv : students) {
            System.out.printf("| %-4s | %-15s | %-15s |\n",sv.getId(),sv.name,sv.getAge());
        }
        System.out.println("----------------------------------------------------------");
    }

    public void addNewStudent(ArrayList<Student> students,int quantity){
        Scanner input =new Scanner(System.in);
        for (int i = 0; i < quantity; i++) {
            System.out.print("Id of the student: ");
            int id=input.nextInt();
            input.nextLine();
            System.out.print("The name of the student: ");
            String name=input.nextLine();
            System.out.print("The age of the student: ");
            int age=input.nextInt();
            Student sv=new Student(id, name, age);
            students.add(sv);
        }
        input.close();
    }

    public void updateStudent(ArrayList<Student> students,int id){
        Scanner input = new Scanner(System.in);
        for (Student sv : students) {
            if (sv.getId()==id) {
                sv.setId(id);
                System.out.print("The name of student: ");
                String name=input.nextLine();
                sv.setName(name);
                System.out.print("The age of the student: ");
                int age=input.nextInt();
                sv.setAge(age);
                return;
            }
        }
    }
    public void deleteStudent(ArrayList<Student> students,int id){
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId()==id) {
                students.remove(i);
                return;
            }
        }
    }
    public int menu(){
        Scanner input =new Scanner(System.in);
        System.out.println("""
                =======================================================
                        Choose option to action
                    1. Add new student
                    2. Edit student
                    3. Delete student
                    4. Display all student
                    -- Enter your number ----------
                """);
        int option=input.nextInt();
        return option;
    }
}
