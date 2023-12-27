package QLSV;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private static int nextId;
    private int id;
    private String fullName;
    private String studentClass;
    private int age;
    private String province;

    public Student(String fullName, String studentClass, int age, String province) {
        this.id = nextId++;
        this.fullName = fullName;
        this.studentClass = studentClass;
        this.age = age;
        this.province = province;
    }

    public void inputStudent(ArrayList<Student> listStudents) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        fullName = input.nextLine();
        System.out.print("Enter your class: ");
        studentClass = input.nextLine();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        input.nextLine();
        System.out.print("Enter your province: ");
        province = input.nextLine();
        Student sv = new Student(fullName, studentClass, age, province);
        listStudents.add(sv);
    }

    public void outputStudent(ArrayList<Student> listStudents) {

        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("| %-4s | %-15s | %-15s | %-4s | %-15s |\n", "STT", "Name", "Class", "Age", "Province");
        System.out.println("-----------------------------------------------------------------------------");
        for (Student sv : listStudents) {
            System.out.printf("| %-4s | %-15s | %-15s | %-4s | %-15s |\n", sv.id, sv.fullName, sv.studentClass, sv.age,
                    sv.province);
        }
        System.out.println("-----------------------------------------------------------------------------");
    }

    public void updateStudent(ArrayList<Student> listStudents, int searchById) {
        Scanner input = new Scanner(System.in);
        for (Student sv : listStudents) {
            if (sv.id == searchById) {
                System.out.print("Enter your name: ");
                fullName = input.nextLine();
                sv.setFullName(fullName);
                System.out.print("Enter your class: ");
                studentClass = input.nextLine();
                sv.setStudentClass(studentClass);
                System.out.print("Enter your age: ");
                age = input.nextInt();
                input.nextLine();
                sv.setAge(age);
                System.out.print("Enter your province: ");
                province = input.nextLine();
                sv.setProvince(province);
                return;
            } else {
                System.out.println("Student not found");
            }
        }
    }

    public void updateStudent(ArrayList<Student> listStudents, String fullName) {
        Scanner input = new Scanner(System.in);
        for (Student sv : listStudents) {
            if (sv.fullName.equalsIgnoreCase(fullName)) {
                System.out.print("Enter your name: ");
                fullName = input.nextLine();
                sv.setFullName(fullName);
                System.out.print("Enter your class: ");
                studentClass = input.nextLine();
                sv.setStudentClass(studentClass);
                System.out.print("Enter your age: ");
                age = input.nextInt();
                input.nextLine();
                sv.setAge(age);
                System.out.print("Enter your province: ");
                province = input.nextLine();
                sv.setProvince(province);
                return;
            } else {
                System.out.println("Student not found");
            }
        }
    }

    public void deleteStudent(ArrayList<Student> listStudents, int searchById) {

        for (var i = 0; i < listStudents.size(); i++) {
            if (listStudents.get(i).id == searchById) {
                listStudents.remove(i);
                return;
            } else {
                System.out.println("Id student not found");
            }
        }
        // System.out.println("-----------------------------------------------------------------------------");

    }

    public void searchByName(ArrayList<Student> listStudents, String fullName) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("| %-4s | %-15s | %-15s | %-4s | %-15s |\n", "STT", "Name", "Class", "Age", "Province");
        System.out.println("-----------------------------------------------------------------------------");
        for (Student sv : listStudents) {
            if (sv.fullName == fullName) {
                System.out.printf("| %-4s | %-15s | %-15s | %-4s | %-15s |\n", sv.id, sv.fullName, sv.studentClass,
                        sv.age, sv.province);
            }
        }
        System.out.println("-----------------------------------------------------------------------------");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

}
