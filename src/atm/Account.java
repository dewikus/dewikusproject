/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author root
 */
public class Account {

    private int acc_code;
    private double balance;

    public Account(int code, double balance) {
        this.acc_code = code;
        this.balance = balance;
    }

    public int getAcc_code() {
        return acc_code;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value) {
        balance = balance + value;
        System.out.println("Berhasil melakukan deposit.");
        if (balance >= 500000) {
            int pengali = (int) balance / 500000;
            double bunga = pengali * 0.5;
            balance = balance + (balance * bunga / 100);
            System.out.println("Anda mendapatkan bunga sebesar " + bunga + "%");
        }
        System.out.println("Total saldo: " + balance);
    }

    public void withdraw(double value) {
        if (value >= 2000000) {
            value = value + 12500;
        }
        try {
            balance = balance - value;
            if (balance < 0) {
                throw new SaldoTidakCukup();
            }
            System.out.println("Berhasil melakukan tarik tunai.");
        } catch (SaldoTidakCukup e) {
            System.out.println(e.getMessage());
            balance = balance + value;
        }
        System.out.println("Total saldo: " + balance);
    }
}
