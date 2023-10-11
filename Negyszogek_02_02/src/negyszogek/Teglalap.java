/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negyszogek;

/**
 *
 * @author Mr.KaraszekZoltán
 */
//A Téglalap olyan Négyszög, amelynek 2-2 szemközti oldala egyenlő hosszúságú
public class Teglalap extends Negyszog{
    public Teglalap(int[] o) {
        super(o);
    }

    public int Kerulet()
    {
        return oldalak[0] * 2 + oldalak[1] * 2;

    }
    public int Terulet()
    {
        int a = oldalak[0];
        int b = oldalak[1];
        return a * b;
    }
}
