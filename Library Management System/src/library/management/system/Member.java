/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system;

import java.util.ArrayList;

public class Member {
    private int id;
    private String name;
    private java.util.Date borrowedDate;
    private int penalties;
    private ArrayList<Book> borrowedBook;
    
    public Member(int id, String name){
        this.id = id;
        this.name = name;
        this.borrowedDate = new java.util.Date();
        this.penalties = 0;
        this.borrowedBook = new ArrayList<>();
    }

    public java.util.Date getDate() {
        return borrowedDate;
    }

    public void setDate(java.util.Date date) {
        this.borrowedDate = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPenalties() {
        return penalties;
    }

    public void setPenalties(int penalties) {
        this.penalties = penalties;
    }
    
    public ArrayList<Book> getBorrowedBook() {
        return borrowedBook;
    }
    
    public void borrowBook(Book book){
        if(book.isAvailable()){
            borrowedBook.add(book);    
            book.markAsBorrowed();
            book.setIsAvailable(false);
            borrowedDate = new java.util.Date();
           // System.out.printf("%s borrowed the book: %s.\n",name,book.getTitle());
        }/*else{
            //System.out.printf("The book: %s is not available.\n", book.getTitle());
        }*/
    }
    public void returnBook(Book book){
        if(!book.isAvailable()){
            borrowedBook.remove(book);
            book.markAsReturned();
            borrowedDate = new java.util.Date();
           // System.out.printf("%s return the book: %s.\n",name,book.getTitle());
        }
    }

    
    @Override
    public String toString(){
        return String.format("Member[ID: %s, Name: %s, BorrowedBooks: %d]\n",id,name,borrowedBook.size());
    }
}
 

