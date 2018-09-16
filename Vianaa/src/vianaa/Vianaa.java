/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vianaa;

/**
 *
 * @author LENOVO
 */
public class Vianaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Tugas LOOPING AND,OR
        int nilaiAndroid = 75;
        String wajah = "cantik";
        String asal = "Malang";
        char nilaiAndroidhuruf;
        
        System.out.println("Saya mau menikah?");
        
        if (nilaiAndroid>=85) {
            nilaiAndroidhuruf = 'A';
        }
        else if (nilaiAndroid>=75) {
            nilaiAndroidhuruf = 'B';
        }
        else if (nilaiAndroid>=65){
            nilaiAndroidhuruf = 'C';
        }
        else if (nilaiAndroid>=55) {
            nilaiAndroidhuruf = 'D';
        }
        else {
            nilaiAndroidhuruf = 'E';
        }
        if (nilaiAndroidhuruf=='A' && wajah == "cantik" && asal == "Malang"){
            System.out.println( "Mau banget");
        }
        else if ((nilaiAndroidhuruf == 'A' || nilaiAndroidhuruf == 'C') && wajah == "cantik" && asal == "Malang"){
            System.out.println("Boleh lah");
        }
        else if (asal == "Malang") {
            System.out.println("Saya pikir dulu");
        }
        else {
            System.out.println("Absolutely NO!");
        }
    }
    }
}
