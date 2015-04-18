/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.ArrayList;

/**
 *
 * @author root
 */
public class ATM {

    private ArrayList<Costumer> costumerList;

    public ATM() {
        costumerList = new ArrayList();
    }

    public void addCostumer(Costumer costumer) {
        costumerList.add(costumer);

    }

    public boolean isCostumer(int code) {
        boolean isCostumer = false;
        for (Costumer costumerList1 : costumerList) {
            if (costumerList1.getCode() == code) {
                isCostumer = true;
                break;
            }
        }
        return isCostumer;
    }

    public boolean cekAccount(Costumer costumer, int code) {
        boolean cek = false;
        Account[] account = costumer.getAccount();
        for (Account account1 : account) {
            if (account1.getAcc_code() == code) {
                cek = true;
                break;
            }
        }
        return cek;
    }

}
