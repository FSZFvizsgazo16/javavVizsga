/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negyszogek;

/**
 *
 * @author Mr.KaraszekZoltán
 */
//A Négyzet olyan Négyszög, aminek mind a 4 oldala egyforma hosszúságú
public class Negyzet extends Teglalap{
    public Negyzet(int[] o) {
        super(o);
    }

    public int Kerulet(){

        return oldalak[0] * 4;
    }
    public int Terulet()
    {
        return oldalak[0] * oldalak[0];
    }    
}
