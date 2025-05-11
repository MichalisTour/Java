/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flight.management.system;


public class Booking {
      private int bookingID;
    private int seatsBooked;
    private double totalPrice;
    private String bookingDate;
    private String status;
    private Passenger passenger;
    private Flight flight;

    public Booking(int bookingID, int seatsBooked, double totalPrice, String bookingDate, String status, Passenger passenger, Flight flight) {
        this.bookingID = bookingID;
        this.seatsBooked = seatsBooked;
        this.totalPrice = totalPrice;
        this.bookingDate = bookingDate;
        this.status = status;
        this.passenger = passenger;
        this.flight = flight;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public int getSeatsBooked() {
        return seatsBooked;
    }

    public void setSeatsBooked(int seatsBooked) {
        this.seatsBooked = seatsBooked;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    
    @Override
    public String toString(){
        return String.format("bookingID: %d\tseatsBooked: %d\ttotalPrice: %.2f\tbookingDate: %s\tstatus: %s\t");
    }
}
