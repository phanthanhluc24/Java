package QLSV;

import java.util.Scanner;

public class Menu {

    public int menuAction() {
        Scanner input = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------");
        System.out.println("------------- Welcome to manage Student of PNV -----------------");
        System.out.println("1: Add new student");
        System.out.println("2: Show all students");
        System.out.println("3: Edit student");
        System.out.println("4: Delete student");
        System.out.println("5: Search student by name");
        System.out.println("6: Break program");
        System.out.println("----------------------------------------------------------------");
        System.out.print("Enter your number: ");
        int option = input.nextInt();
        return option;
    }
}
