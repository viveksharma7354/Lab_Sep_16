package main;

import java.util.Scanner;

public class HackerrankPractiseClass extends Book {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n != 0) {
            Book[] books;
            books = new Book[n];
            for (int i = 0; i < n; i++) {
                books[i] = new Book();
                s.next();
                books[i].name = s.nextLine();
                books[i].aname = s.nextLine();
                books[i].isbn = s.nextLine();
            }
            for (int i = 0; i < n; i++) {
                System.out.println("-----------------------------");
                System.out.println("Book Name:\t" + books[i].name);
                System.out.println("Author Name:\t" + books[i].aname);
                System.out.println("ISBN :\t" + books[i].isbn);
                System.out.println("-----------------------------");
            }
        } else if (n == 0)
            System.out.println("N/A");
    }
}

class Book {
    String name;
    String aname;
    String isbn;
}