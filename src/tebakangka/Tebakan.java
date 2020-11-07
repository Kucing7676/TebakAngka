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
import java.util.Scanner;
public class Tebakan {
    Score s = new Score();
    void tebakan(){
        boolean x = false;
        int acak = (int)(Math.random() *100);
        do{
            System.out.println("---------------------------------------------------");
            System.out.print("Masukkan tebakan anda: ");
            Scanner jawab = new Scanner (System.in);
            int tebak = jawab.nextInt();
            System.out.println("---------------------------------------------------");
            if ( s.score == 2 ){
                System.out.println("Jumlah percobaan: " + (s.coba + 1));
                System.out.println("Maaf... Score anda 0, Jawabannya " + acak);
                System.out.println("<== GAME OVER ==>");
                break;
            }
            if ( tebak == acak ){
                s.bonus();
                System.out.println("CONGRATULATION!!! Tebakan yang anda masukkan BENAR!");
                break;
            }else if ( tebak < acak ){
                System.out.println("Hehehe... Bilangan tebakan terlalu KECIL");
                s.minus();
                s.cobalah();
            }else if ( tebak > acak ){
                System.out.println("Hehehe... Bilangan tebakan terlalu BESAR.");
                s.minus();
                s.cobalah();
            }
        }while (x == false);
    }
}
