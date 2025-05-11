/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library.management.system;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Book book1 = new Book("B001", "1984", "George Orwell");
        Book book2 = new Book("B002", "To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("B003", "The Great Gatsby", "F. Scott Fitzgerald");
        Book book4 = new Book("B004", "Brave New World", "Aldous Huxley");
        Book book5 = new Book("B005", "The Catcher in the Rye", "J.D. Salinger");
        Book book6 = new Book("B006", "Moby Dick", "Herman Melville");
        Book book7 = new Book("B007", "The Hobbit", "J.R.R. Tolkien");
        Library nea = new Library();    
        
        Member member1 = new Member(1, "John Doe");
        Member member2 = new Member(2, "Jane Smith");
        Member member3 = new Member(3, "Alice Johnson");
        
        nea.addMember(member1,member2,member3);
        nea.addBook(book1,book2,book3,book4,book5,book6,book7);
        nea.borrowBook("b001", 1);
        nea.borrowBook("b002", 2);
        nea.returnBook("b001", 1);
        
    }
    
}
