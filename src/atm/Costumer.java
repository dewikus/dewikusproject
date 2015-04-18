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
public class Costumer {

    private String name;
    private int code;
    private Account[] account;

    public Costumer(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void setAccount(Account[] account) {
        this.account = account;
    }

    public Account[] getAccount() {
        return account;
    }
}
