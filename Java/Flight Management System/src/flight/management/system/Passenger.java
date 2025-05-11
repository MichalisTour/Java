/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flight.management.system;
import java.util.*;

public class Passenger {
     private int ID;
    private String name;
    private String email;
    private String phoneNumber;
    private String passportNumber;
    private ArrayList<Booking> bookingsList;

    public Passenger(int ID, String name, String email, String phoneNumber, String passportNumber) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.passportNumber = passportNumber;
        this.bookingsList = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public ArrayList<Booking> getBookingSList() {
        return bookingsList;
    }

    public void setBookingSList(ArrayList<Booking> bookingSList) {
        this.bookingsList = bookingSList;
    }
    
    public String viewBookings(Booking booking){
            return String.format(booking.toString());

    }
    
    @Override
    public String toString(){
        return String.format("id: '%s'\tname: '%s'\temail: '%s'\tphoneNumber: '%s'\tpassportNumber: '%s'",ID,name,email,phoneNumber,passportNumber);
    }
}
