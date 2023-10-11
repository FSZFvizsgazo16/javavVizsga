/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negyszogek;

/**
 *
 * @author Mr.KaraszekZoltán
 */
abstract public class Negyszog {
    protected int[] oldalak=new int[4];
    public Negyszog(int[] o){
        for(int i=0;i<this.oldalak.length;i++){
            this.oldalak[i]=o[i];
        }
    }
    public int Kerulet(){
        return this.oldalak[0]+this.oldalak[1]+this.oldalak[2]+this.oldalak[3];
    }
    abstract public int Terulet();
}
