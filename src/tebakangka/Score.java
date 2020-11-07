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
public class Score {
    int score = 100, coba = 0;
    
    void minus(){
        score = score - 2;
        System.out.println("Score anda: " + score);
        }
    void bonus(){
        if(coba <= 5){
            score = score + 50;
        }
        System.out.println("Jumlah percobaan: " + (coba + 1));
        System.out.println("Score anda: " + score);
    }
    void cobalah(){
        coba++;
        System.out.println("Jumlah percobaan: " + coba);
    }
}
