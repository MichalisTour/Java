/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flight.management.system;

/**
 *
 * @author barca
 */
public class FlightManagementSystem {

    public static void main(String[] args) {
        Airport airport1 = new Airport("Eleftherios Venizelos", "Athens, Greece", 20);
        Airport airport2 = new Airport("Heathrow", "London, UK", 50);
        Airport airport3 = new Airport("Charles de Gaulle", "Paris, France", 45);
        Airport airport4 = new Airport("Schiphol", "Amsterdam, Netherlands", 35);
        Airport airport5 = new Airport("Frankfurt", "Frankfurt, Germany", 40);
        Airport airport6 = new Airport("JFK", "New York, USA", 60);
        Airport airport7 = new Airport("Narita", "Tokyo, Japan", 55);
        Airport airport8 = new Airport("Changi", "Singapore", 30);
        Airport airport9 = new Airport("Dubai International", "Dubai, UAE", 65);
        Airport airport10 = new Airport("Sydney Kingsford Smith", "Sydney, Australia", 25);
        
        Flight flight1 = new Flight("A123", "2025-01-20 10:00", "2025-01-20 13:00", "Athens", "London", 180, 50, "Boeing 737", 3, 120);
        Flight flight2 = new Flight("B456", "2025-01-21 15:30", "2025-01-21 18:30", "Athens", "Paris", 200, 75, "Airbus A320", 3, 150);
        Flight flight3 = new Flight("C789", "2025-01-22 09:00", "2025-01-22 12:00", "Athens", "Rome", 150, 30, "Boeing 737", 3, 100);
        Flight flight4 = new Flight("D101", "2025-01-23 17:00", "2025-01-23 23:00", "Athens", "New York", 300, 200, "Boeing 777", 6, 600);
        Flight flight5 = new Flight("E112", "2025-01-24 08:00", "2025-01-24 10:00", "Athens", "Istanbul", 100, 25, "Embraer 190", 2, 80);
        Flight flight6 = new Flight("F131", "2025-01-25 14:00", "2025-01-25 20:00", "Athens", "Dubai", 250, 120, "Boeing 787", 6, 450);
        Flight flight7 = new Flight("G141", "2025-01-26 12:00", "2025-01-26 15:00", "Athens", "Berlin", 180, 50, "Airbus A321", 3, 140);
        Flight flight8 = new Flight("H151", "2025-01-27 16:00", "2025-01-27 19:00", "Athens", "Madrid", 220, 70, "Boeing 757", 3, 160);
        Flight flight9 = new Flight("I161", "2025-01-28 10:00", "2025-01-28 14:00", "Athens", "Amsterdam", 200, 80, "Boeing 737", 4, 200);
        Flight flight10 = new Flight("J171", "2025-01-29 18:00", "2025-01-29 21:00", "Athens", "Frankfurt", 180, 60, "Airbus A320", 3, 130);
        
        
        Passenger passenger1 = new Passenger(1, "John Papadopoulos", "john@example.com", "6901234567", "AA12345678");
        Passenger passenger2 = new Passenger(2, "Maria Ioannou", "maria@example.com", "6902234567", "AB23456789");
        Passenger passenger3 = new Passenger(3, "Kostas Dimitriou", "kostas@example.com", "6903234567", "AC34567890");
        Passenger passenger4 = new Passenger(4, "Eleni Papadopoulou", "eleni@example.com", "6904234567", "AD45678901");
        Passenger passenger5 = new Passenger(5, "Nikos Karagiannis", "nikos@example.com", "6905234567", "AE56789012");
        Passenger passenger6 = new Passenger(6, "Anna Vasiliou", "anna@example.com", "6906234567", "AF67890123");
        Passenger passenger7 = new Passenger(7, "Dimitris Leonidas", "dimitris@example.com", "6907234567", "AG78901234");
        Passenger passenger8 = new Passenger(8, "Sophia Konstantinou", "sophia@example.com", "6908234567", "AH89012345");
        Passenger passenger9 = new Passenger(9, "Christos Antoniou", "christos@example.com", "6909234567", "AI90123456");
        Passenger passenger10 = new Passenger(10, "Ioanna Michailidou", "ioanna@example.com", "6910234567", "AJ01234567");


        Booking booking1 = new Booking(1, 2, 240, "2025-01-15", "Confirmed", passenger1, flight1);
        Booking booking2 = new Booking(2, 1, 150, "2025-01-20", "Confirmed", passenger1, flight2);
        Booking booking3 = new Booking(3, 3, 300, "2025-01-17", "Confirmed", passenger2, flight3);
        Booking booking4 = new Booking(4, 1, 600, "2025-01-18", "Confirmed", passenger2, flight4);
        Booking booking5 = new Booking(5, 2, 160, "2025-01-19", "Confirmed", passenger3, flight5);
        Booking booking6 = new Booking(6, 1, 450, "2025-01-25", "Confirmed", passenger3, flight6);
        Booking booking7 = new Booking(7, 2, 280, "2025-01-21", "Confirmed", passenger4, flight7);
        Booking booking8 = new Booking(8, 1, 160, "2025-01-22", "Confirmed", passenger5, flight8);
        Booking booking9 = new Booking(9, 3, 600, "2025-01-23", "Confirmed", passenger5, flight9);
        Booking booking10 = new Booking(10, 2, 260, "2025-01-24", "Confirmed", passenger5, flight10);
        Booking booking11 = new Booking(11, 4, 1800, "2025-01-26", "Confirmed", passenger6, flight6);
        Booking booking12 = new Booking(12, 1, 120, "2025-01-20", "Confirmed", passenger6, flight1);
        Booking booking13 = new Booking(13, 2, 280, "2025-01-27", "Confirmed", passenger7, flight7);
        Booking booking14 = new Booking(14, 1, 140, "2025-01-28", "Confirmed", passenger8, flight8);
        Booking booking15 = new Booking(15, 3, 600, "2025-01-29", "Confirmed", passenger9, flight9);
        Booking booking16 = new Booking(16, 1, 130, "2025-01-30", "Confirmed", passenger10, flight10);
        Booking booking17 = new Booking(17, 2, 240, "2025-01-15", "Confirmed", passenger10, flight2);
        Booking booking18 = new Booking(18, 1, 120, "2025-01-20", "Confirmed", passenger10, flight1);

        airport1.addFlights(flight1,flight2);
        System.out.println(airport1.findFlightByDestination("london"));
    }
    
}
