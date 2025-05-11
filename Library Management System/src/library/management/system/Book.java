/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system;

public class Book {
    private String id;
    private String title;
    private String author;
    private boolean isAvailable;
    
    public Book(String id,String title,String author){
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id == null){
            System.out.println("NO!");
        }
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title == null || title.trim().isEmpty()){
            throw new IllegalArgumentException("Error");
        }else{
            this.title = title;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    public boolean markAsBorrowed(){
        if(!isAvailable){
            return false;
        }else{
            isAvailable = false;
            return true;
        }
    }
    
    public boolean markAsReturned(){
        if(!isAvailable){
            isAvailable = true;
            return true;
        }else{
            return false;
        }
    }
}
