/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.account.management.system;

/**
 *
 * @author barca
 */
public class ManagementSystem {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    
    public ManagementSystem(String accNum, String accHold, double balance){
        this.accountNumber = accNum;
        this.accountHolder = accHold;
        this.balance = balance;
    }
    public void deposit(double amount){
       this.balance += amount;
    }
    public void withdraw(double amount){
        if(amount < this.balance){
            this.balance -= amount;
        }else{
            System.out.println("Den yparxei diathesimo ypoloipo!");
        }
    }
    public void transfer(double amount, ManagementSystem recipient){
    if (recipient == null) {
        System.out.println("O paralhpths den einai egkyros.");
        return;
    }
    if (recipient.accountNumber.equals(this.accountNumber)) {
        System.out.println("Den einai dunath h metafora ston idio logariasmo.");
    }else if (this.balance >= amount) {
        this.withdraw(amount);
        recipient.deposit(amount);
        System.out.println("H metafora egine me epituxia.");
    } else {
        System.out.println("Den yparxei ypoloipo gia thn metafora.");
    }
}
    public void displayInfo(){
        System.out.println("O trapezikos logariasmos " +accountNumber+ " tou katoxou " +accountHolder+ " exei ypoloipo: " +balance);
    }
}
