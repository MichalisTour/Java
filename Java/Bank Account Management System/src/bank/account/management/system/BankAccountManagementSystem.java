/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank.account.management.system;

/**
 *
 * @author barca
 */
public class BankAccountManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ManagementSystem acc1 = new ManagementSystem("1356436753","Nick Ladinos",100);
        ManagementSystem acc2 = new ManagementSystem("4356436342","John Wright",200);
        
        acc1.displayInfo();
        acc2.displayInfo();

        acc1.transfer(50, acc1);
    }
    
}
