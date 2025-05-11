/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservation.management.system;
import java.util.ArrayList;

public class Hotel {
     private ArrayList<Room> roomsList;
    private ArrayList<Customer> customersList;
    private ArrayList<Reservation> reservationsList;

    public Hotel() {
        this.roomsList = new ArrayList<>();
        this.customersList = new ArrayList<>();
        this.reservationsList = new ArrayList<>();
    }

    public ArrayList<Room> getRooms() {
        return roomsList;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.roomsList = rooms;
    }

    public ArrayList<Customer> getCustomers() {
        return customersList;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customersList = customers;
    }

    public ArrayList<Reservation> getReservations() {
        return reservationsList;
    }

    public void setReservations(ArrayList<Reservation> reservations) {
        this.reservationsList = reservations;
    }
    
    public void addRoom(Room room){
        roomsList.add(room);
    }
    
    public void addCustomer(Customer customer){
        customersList.add(customer);
    }
    
    public void createReservation(Customer customer, Room room, String checkIn, String checkOut){
        if(room.getIsAvailable()){
            room.reserve();
            Reservation newReservation = new Reservation(customer.getId(), room, customer, checkIn, checkOut);
            customer.addReservation(newReservation);
            System.out.printf("Reservation made by %s with ID: %d for the room %s. Check in: %s and Check out: %s.\n",customer.getName(),customer.getId(),room.getRoomNumber(),checkIn,checkOut);
            
        }else{
            System.out.println("The room is not available.");
        }
    }
    
    public void releaseReservation(Customer customer, Room room, String checkIn, String checkOut){
        if(!room.getIsAvailable()){
            room.release();
            Reservation newReservation = new Reservation(customer.getId(), room, customer, checkIn, checkOut);
            customer.removeReservation(newReservation);
            System.out.printf("The room %s is empty.\n",room.getRoomNumber());
        }else{
            System.out.println("The room is already empty.");
        }
    }
    
    public void printAvailableRooms(){
        boolean found = false;
        
        for(Room room: roomsList){
            if(room.getIsAvailable()){
                System.out.println(room);
                found = true;
            }
        }
        if(!found){
            System.out.println("There is no room available.");
        }
    }
}
