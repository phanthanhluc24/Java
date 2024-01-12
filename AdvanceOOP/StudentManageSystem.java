package QLSV.AdvanceOOP;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManageSystem {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        StudentManage manage = new StudentManage(students);
        Scanner input = new Scanner(System.in);
        while (true) {
            int option = manage.menu();
            switch (option) {
                case 1:
                    System.out.print("How many student do you want to add: ");
                    int quantity = input.nextInt();
                    input.nextLine();
                    manage.addNewStudent(students, quantity);
                    manage.displayInfo(students);
                    break;
                case 2:
                    System.out.print("Enter id student: ");
                    int id = input.nextInt();
                    manage.updateStudent(students, id);
                    manage.displayInfo(students);
                    break;
                case 3:
                    System.out.print("Enter id student: ");
                    id = input.nextInt();
                    manage.deleteStudent(students, id);
                    manage.displayInfo(students);
                    return;
                case 4:
                    manage.displayInfo(students);
                    break;
                default:
                    input.close();
                    break;
            }
        }
    }
}
