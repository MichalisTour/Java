/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flight.management.system;
import java.util.*;

public class Flight {
    private String flightNumber;
    private String departure;
    private String arrival;
    private String origin;
    private String destination;
    private int capacity;
    private int bookedSeats;
    private String aircraftType;
    private double duration;
    private double pricePerSeat;
    private ArrayList<Flight> flightsList;
    private ArrayList<Passenger> passengersList;

    public Flight(String flightNumber, String departure, String arrival, String origin, String destination, int capacity, int bookedSeats, String aircraftType, double duration, double pricePerSeat) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.arrival = arrival;
        this.origin = origin;
        this.destination = destination;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
        this.aircraftType = aircraftType;
        this.duration = duration;
        this.pricePerSeat = pricePerSeat;
        this.flightsList = new ArrayList<>();
        this.passengersList = new ArrayList<>();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getPricePerSeat() {
        return pricePerSeat;
    }

    public void setPricePerSeat(double pricePerSeat) {
        this.pricePerSeat = pricePerSeat;
    }

    public ArrayList<Flight> getFlightsList() {
        return flightsList;
    }

    public void setFlightsList(ArrayList<Flight> flightsList) {
        this.flightsList = flightsList;
    }

    public ArrayList<Passenger> getPassengersList() {
        return passengersList;
    }

    public void setPassengersList(ArrayList<Passenger> passengersList) {
        this.passengersList = passengersList;
    }
  
    @Override
    public String toString(){
        return String.format("FlightNumber: '%s'\tdeparture: '%s'\tarrival: '%s'\torigin: '%s'\tdestination: '%s'\tcapacity: '%d'\tbookedSeats: '%d'\taircraftType: '%s'\tduration: '%.2f'\tpricePerSeat: '%.2f'\n",flightNumber,departure,arrival,origin,destination,capacity,bookedSeats,aircraftType,duration,pricePerSeat);
    }
    
    public double calculateTotalRevenue(Flight flight){
        double total = flight.getBookedSeats();
        return  total *= flight.getPricePerSeat();
        
    }
   
    public String checkAvailability(int seatsRequested, Flight flight){
        boolean found = false;
        int remainingSeats = flight.getCapacity() - flight.getBookedSeats();
        
        if(remainingSeats >= seatsRequested){
                found = true;
    }
        if(!found){
            return String.format("Den yparxoun kenes theseis gia thn sygkekrimenh pthsh.\n");
        }
        return String.format("Yparxoyn %d kenes theseis gia thn pthsh %s",remainingSeats,flight.getFlightNumber());
    }
}
