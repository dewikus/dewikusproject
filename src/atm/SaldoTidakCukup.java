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
public class SaldoTidakCukup extends Exception {

    public SaldoTidakCukup() {
        super("Maaf, saldo Anda tidak mencukupi.");
    }

    public SaldoTidakCukup(String s) {
        super(s);
    }
}
