package QLSV;

import java.util.ArrayList;
import java.util.Scanner;

public class MainQLSV {
    public static void main(String[] args) {
        ArrayList<Student> listStudents = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Student sv = new Student("", "", 0, "");
        Menu mn = new Menu();

        while (true) {
            int option = mn.menuAction();
            switch (option) {
                case 1:
                    System.out.println("Do you want to add how many students?");
                    int number = input.nextInt();
                    input.nextLine();
                    while (number < 1) {
                        System.out.println("Do you want to add how many students?");
                        number = input.nextInt();
                    }
                    if (number == 1) {
                        sv.inputStudent(listStudents);

                    } else {
                        for (var i = 0; i < number; i++) {
                            sv.inputStudent(listStudents);
                        }
                    }
                    sv.outputStudent(listStudents);
                    break;
                case 2:
                    sv.outputStudent(listStudents);
                    break;
                case 3:
                    System.out.println("Do you want to search by name or by Id?");
                    System.out.println("1: Edit by Id");
                    System.out.println("2: Edit by name");
                    System.out.println("Enter your option ");
                    number = input.nextInt();
                    input.nextLine();
                    if (number == 1) {
                        System.out.println("Enter the Id student: ");
                        int id = input.nextInt();
                        sv.updateStudent(listStudents, id);
                    } else if (number == 2) {
                        System.out.println("Enter the Id student: ");
                        String name = input.nextLine();
                        sv.updateStudent(listStudents, name);
                    }
                    sv.outputStudent(listStudents);
                    break;
                case 4:
                    System.out.println("Enter Id want to delete: ");
                    number = input.nextInt();
                    sv.deleteStudent(listStudents, number);
                    sv.outputStudent(listStudents);
                    break;
                case 5:
                    System.out.println("Enter the student name: ");
                    String fullName = input.nextLine();
                    sv.searchByName(listStudents, fullName);
                    sv.outputStudent(listStudents);
                    break;
                case 6:
                    System.exit(0);
                    ;
                default:
                    break;
            }
        }
    }
}
