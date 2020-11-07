/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka;

/**
 *
 * @author Lenovo
 */
public class TebakAngka {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Hai... Nama saya MR. Lappie,");
        System.out.println("saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100.");
        System.out.println("Silahkan tebak ya!!!");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println(" ");
        Tebakan t = new Tebakan();
        t.tebakan();
    }
}
