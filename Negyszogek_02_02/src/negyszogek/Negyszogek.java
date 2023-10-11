/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package negyszogek;

/**
 *
 * @author Mr.KaraszekZoltán
 */
public class Negyszogek {

    /**
     * @param args the command line arguments
     */
    static int [] teglalapOldalak = {3, 2, 3, 2};
    static Teglalap t=new Teglalap(teglalapOldalak);
    static int [] negyzetOldalak = {3, 3, 3, 3};
    static Negyzet n=new Negyzet(negyzetOldalak);
    public static void main(String[] args) {
        // TODO code application logic here
        Tesztesetek t=new Tesztesetek();
        t.tesztTeglalapTerulet();
        t.tesztNegyzetTerulet();
    }
    
}
