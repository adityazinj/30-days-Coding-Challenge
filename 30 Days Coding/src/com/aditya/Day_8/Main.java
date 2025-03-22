package com.aditya.Day_8;

//Create a Library Management System using classes and constructor overloading.

import java.util.ArrayList;
import java.util.Objects;

class Book{
    private String title;
    private String author;
    private int ISBN;


    public Book(String author, int ISBN, String title) {
        this.author = author;
        this.ISBN = ISBN;
        this.title = title;
    }
}
class Library{
    ArrayList<String> books = new ArrayList<>();

    void addBook(String book_name){
        books.add(book_name);
        System.out.println("New Book Added !!!");

    }

    void displayBooks(){
        if (books.isEmpty()) {
            System.out.println("No Books In The Library!!!");

        }
        else{
            System.out.println("Library Book :-");
            for (String book : books) {
                System.out.println(book);
            }
        }
    }
    void searchBookByTitle(String Title){
        for (String i : books){
            if (Objects.equals(books.get(Integer.parseInt(i)), Title)){
                System.out.println("Found");
                return;
            }
        }
        System.out.println("Not Found");

    }
}
public class Main {
    public static void main(String[] args) {
        Library obj = new Library();
        obj.addBook("Ramayan");
        obj.displayBooks();
        obj.searchBookByTitle("Ramayan");
    }
}
