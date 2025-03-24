package com.aditya.Day_08;

//Create a Library Management System using classes and constructor overloading.

import java.util.ArrayList;
import java.util.Scanner;

import static com.aditya.Day_08.Library.searchBookByTitle;

class Book{
    String title;
    String author;
    int ISBN;


    public Book(String author, int ISBN, String title) {
        this.author = author;
        this.ISBN = ISBN;
        this.title = title;
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public Book(String title, int ISBN) {
        this.title = title;
        this.ISBN = ISBN;
    }
}
class Library{
    static ArrayList<Book> books = new ArrayList<>();

    void addBook(Book newBook){
        books.add(newBook);

    }
    static void displayBooks(){
        if (books.isEmpty()) {
            System.out.println("Library Is Empty !!!");
            return;
        }
        else{
            int i = 1;
            System.out.println("Displaying Books In Library:-");
            for (Book book : books) {
                System.out.println(i+") "+book.title+" "+book.author+" "+book.ISBN);
                i++;
            }
        }
    }
    static Book searchBookByTitle(String bookName) {
        if (books.isEmpty()) {
            System.out.println("Library is Empty!");
            return null;
        }

        for (Book book : books) {
            if (book.title.equalsIgnoreCase(bookName)) {
                System.out.println("Book Found: " + book.title);
                return book;
            }
        }
        System.out.println("Book is Unavailable.");
        return null;
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        Library library = new Library();

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter Book Title :-");
            String title = sc.nextLine();
            System.out.println("Enter Book Author :-");
            String author = sc.nextLine();
            System.out.println("Enter Book ISBN :-");
            int ISBN = sc.nextInt();
            sc.nextLine();

            library.addBook(new Book(author,ISBN,title));
        }
        System.out.println("Enter Book Title For Searching:-");
        String booSearch = sc.nextLine();

        Library.displayBooks();
        searchBookByTitle(booSearch);

    }
}
