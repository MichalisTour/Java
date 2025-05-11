/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flight.management.system;

import java.util.ArrayList;

public class Airport {
     private String name;
    private String location;
    private int totalCapacity;
    private ArrayList<Flight> flightsList;


    public Airport(String name, String location, int totalCapacity) {
        this.name = name;
        this.location = location;
        this.totalCapacity = totalCapacity;
        this.flightsList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public ArrayList<Flight> getFlightsList() {
        return flightsList;
    }

    public void setFlightsList(ArrayList<Flight> flightsList) {
        this.flightsList = flightsList;
    }
    
    @Override
    public String toString(){
        return String.format("name: '%s'\tlocation: '%s'\ttotalCapacity: '%d'\t\n",name,location,totalCapacity);
    }
    
    public ArrayList<Flight> addFlights(Flight... flights){
        for(Flight flight: flights){
            String origin = location.trim();
            String[] parts = origin.split(",");
            String city = parts[0].trim();
            if(flight.getOrigin().equals(city)){
                flightsList.add(flight);
            }else{
                System.out.printf("To aerodromio %s den ankhei sto aerodromio %s.\n",flight.getOrigin(),parts[1].trim());
            }
        }
        return flightsList;
    }

    public ArrayList<Flight> findFlightByDestination(String destination){
        boolean found = false;
        int foundFlights = 0;
        
        for(Flight flight: flightsList){
            if(flight.getDestination().equalsIgnoreCase(destination)){
                found = true;
                foundFlights++;
                flightsList.toString();
            }
        }
        System.out.println(foundFlights);
        if(!found){
            System.out.printf("Den vrethike pthsh apo to aerodromio %s pros to aerodromio %s.\n",name,destination);
        }
        return flightsList;
    }
    
    public String findFlightByDate(String date){
        boolean found = false;
        int foundFlights = 0;
        
        for(Flight flight: flightsList){
            if(flight.getDeparture().equals(date)){
                found = true;
                foundFlights ++;
            }
        }
        if(!found){
            return String.format("Den vrethikan pthseis gia thn sugkekrimenh hmeromhnia.\n");
        }
        return String.format("%d pthseis vrethikan gia thn hmeromhnia %s",foundFlights,date);
    }
}
