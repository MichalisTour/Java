/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservation.management.system;
import java.util.ArrayList;

public class Customer {
    private int id;
    private String name;
    private ArrayList<Reservation> reservationList;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.reservationList = new ArrayList<>();
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

    public ArrayList<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(ArrayList<Reservation> reservationList) {
        this.reservationList = reservationList;
    }
    
    public void addReservation(Reservation reservation){
        reservationList.add(reservation);
    }
    
    public void removeReservation(Reservation reservation){
        reservationList.remove(reservation);
    }
    
}
