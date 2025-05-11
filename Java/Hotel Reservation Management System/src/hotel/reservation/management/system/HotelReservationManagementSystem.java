/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel.reservation.management.system;

public class HotelReservationManagementSystem {

    public static void main(String[] args) {
        Hotel oasis = new Hotel();
        Customer customer1 = new Customer(001,"Nick Karl");
        Customer customer2 = new Customer(002,"John James");
        Customer customer3 = new Customer(003,"Rick Ken");
        
        Room room1 = new Room("123",4);
        Room room2 = new Room("124",4);
        
        /*Reservation reservation1 = new Reservation(001,room1,customer1,"2025-1-5");
        customer1.addReservation(reservation1); */
        
        oasis.addRoom(room1);
        oasis.addRoom(room2);
        oasis.createReservation(customer1, room1, "2025-1-5", "2025-1-15");
        oasis.releaseReservation(customer1, room1, "12", "22");
        oasis.releaseReservation(customer2, room2, "22", "22");
        
        oasis.printAvailableRooms();
        System.out.println(customer1.getReservationList().size());
        System.out.println(customer3.getReservationList().size());
    }
    
}
