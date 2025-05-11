/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> booksList;
    private ArrayList<Member> membersList;
    
    public Library(){
        this.membersList = new ArrayList<>();
        this.booksList = new ArrayList<>();
    }
    
    public void addBook(Book... book){
        System.out.println("Books added to the list.\n");
        for(Book books: book){
            booksList.add(books);
        }
    }
    
    public void addMember(Member... member){
        System.out.println("Members added to the list.\n");
        for(Member members: member){
            membersList.add(members);
        }
    }
    
    public void printLibraryStatus(){
        for(Book book: booksList){
                if(book.isAvailable()){
                    System.out.printf("Book: %s (ID: %s) is available.\n", book.getTitle(), book.getId());
                }else{
                    Member borrower = null;
                    for(Member member: membersList){
                        if(member.getBorrowedBook().contains(book)){
                            borrower = member;
                            break;
                        }
                    }if(borrower != null){
                                        System.out.printf("Book: %s (ID: %s) is borrowed by Member: %s (ID: %s).\n",
                        book.getTitle(), book.getId(), borrower.getName(), borrower.getId());
                    }
                }
            }
    }
    
    public void borrowBook(String bookId, int memberId){
        Book selectedBook = null;
        Member selectedMember = null;
        
        for(Book book: booksList){
            if(book.getId().equalsIgnoreCase(bookId)){
                if(book.isAvailable()){
                    selectedBook = book;
                    
                }else{
                    System.out.printf("The book %s is not available.\n",book.getTitle());
                    return;
                }
                break;
            }
        }
        
        if(selectedBook == null){
            System.out.println("The book does not exist.\n");
            return;
        }
        
        for(Member member: membersList){
            if(memberId == member.getId()){
                selectedMember = member;
                break;
            }
        }
        
        if(selectedMember == null){
            System.out.println("The member does not exist.\n");
            return;
        }
        
        selectedMember.borrowBook(selectedBook);
        System.out.printf("The book %s has been borrowed by %s at time : %s.\n",selectedBook.getTitle(),selectedMember.getName(),selectedMember.getDate());
    }
    
    public void returnBook(String bookId, int memberId){
        Book selectedBook = null;
        Member selectedMember = null;
        
        for(Book book: booksList){
            if(book.getId().equalsIgnoreCase(bookId)){
                if(!book.isAvailable()){
                    selectedBook = book;
                }else{
                    System.out.println("The book is already back to the library.");
                    return;
                }
                break;
            }
        }
        
        if(selectedBook == null){
            System.out.println("The book does not exist.\n");
            return;
        }
        
        for(Member member: membersList){
            if(member.getId() == memberId){
                selectedMember = member;
                break;
            }
        }
        
        if(selectedMember == null){
            System.out.println("The member does not exist.\n");
            return;
        }
        
        selectedMember.returnBook(selectedBook);
        selectedBook.markAsReturned();
        System.out.printf("The book %s has been returned by %s at time : %s.\n",selectedBook.getTitle(),selectedMember.getName(),selectedMember.getDate());
    }
    
    public void printBorrowedBooks() {
        boolean found = false;
        for (Member member : membersList) {
            for (Book book : member.getBorrowedBook()) {
                System.out.printf("Borrowed Book: %s by %s\n", book.getTitle(), member.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("All the books are in the library.\n");
        }
    }
    public void printAvailableBooks(){
        boolean found = false;
        System.out.println("List of all Available Books:\n");
        for(Book book : booksList){
           if(book.isAvailable()){
               System.out.printf("{Title: %s}{ID: %s}{Available: %s}\n",book.getTitle(),book.getId(),book.isAvailable());
               found = true;
           }
        }
        if(!found){
            System.out.println("All the books are borrowed.\n");
        }
    }
    
    public void printMemberDetails(int memberId){
        boolean found = false;
        for(Member member: membersList){
            if(memberId == member.getId()){
                System.out.println(member.toString());
                found = true;
            }
        }
        if(!found){
            System.out.println("Member does not exist.\n");
        }
    }
}
