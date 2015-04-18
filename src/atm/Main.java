/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        Costumer costumer1 = new Costumer("Aan", 1);
        Costumer costumer2 = new Costumer("Amin", 2);
        Costumer costumer3 = new Costumer("Adzan", 3);
        Costumer costumerProcess;
        Account[] accountlist1 = new Account[1];
        accountlist1[0] = new Account(1, 250000);
        costumer1.setAccount(accountlist1);

        Account[] accountlist2 = new Account[1];
        accountlist2[0] = new Account(2, 500000);
        costumer2.setAccount(accountlist2);

        Account[] accountlist3 = new Account[1];
        accountlist3[0] = new Account(3, 5250000);
        costumer3.setAccount(accountlist3);

        ATM atm1 = new ATM();
        atm1.addCostumer(costumer1);
        atm1.addCostumer(costumer2);
        atm1.addCostumer(costumer3);

    }

}
