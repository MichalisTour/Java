/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservation.management.system;

public class Room {
    private String roomNumber;
    private int capacity;
    private boolean isAvailable;

    public Room(String roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.isAvailable = true;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    @Override
    public String toString(){
        return "Room Number: " + roomNumber + "\nCapacity: " + capacity + "\nIsAvailable: " + isAvailable; 
    }
    
    public boolean reserve(){
        if(isAvailable){
            isAvailable=false;
        }else{
            System.out.printf("The room %s is not Available.\n",roomNumber);
        }
        return isAvailable;
    }
    
    public boolean release(){
        if(!isAvailable){
            isAvailable = true;
        }else{
            System.out.printf("The room %s is already Availabe.\n",roomNumber);
        }
        return isAvailable;
    }
}
