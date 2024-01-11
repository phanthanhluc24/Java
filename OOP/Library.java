package QLSV.OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    Scanner input=new Scanner(System.in);
    public Library(){
        books.add(new Book("Do you love me","Phan Thanh Luc","15-01-2024"));
        books.add(new Book("Are you ok", "Phan Duc Tho", "11-01-2024"));
    }

    public void addBook(){
        System.out.print("How many book do you want to add new: ");
        int quantity=input.nextInt();
        input.nextLine();
        for (int i = 0; i < quantity; i++) {
            System.out.print("Title of the book: ");
            String title=input.nextLine();
            System.out.print("Author of the book: ");
            String author=input.nextLine();
            System.out.print("Time of day public: ");
            String isbn=input.nextLine();
            books.add(new Book(title, author, isbn));
        }
    }

    public void displayBooks(){
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("| %-15s | %-15s | %-15s |\n", "Title","Author","isbn");
        System.out.println("-----------------------------------------------------------------");
        for (Book book : books) {
            System.out.printf("| %-15s | %-15s | %-15s |\n",book.title,book.author,book.isbn);
        }
        System.out.println("-------------------------------------------------------------------");
    }
}
