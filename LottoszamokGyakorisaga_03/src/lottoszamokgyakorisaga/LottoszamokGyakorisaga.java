/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lottoszamokgyakorisaga;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mr.KaraszekZoltán
 */
public class LottoszamokGyakorisaga {

    /**
     * @param args the command line arguments
     */
    static int[][] sorsolasok;
    static Map<Integer,Integer> gyakorisagok = new HashMap<>();

    public static void main(String[] args) {
        Tesztesetek t=new Tesztesetek();
        t.setUpAll();
        t.setUpStreams();
        t.tesztStatisztika();
        t.restoreStreams();
    }
    int[][] szamhuzasok(int hanyszor){
        int[][] h=new int[hanyszor][5];
        for(int i=1;i<=hanyszor;i++){
            int j=0;
            while(j<5){
                int szam=(int)Math.floor(Math.random()*90+1);
                boolean v=false;
                for(int k=j-1;k>=0;k--){
                    if(szam==h[i-1][k]){
                        v=true;
                        break;
                    }
                }
                if(!v){
                    h[i-1][j++]=szam;
                }
            }
        }
        return h;
    }
    void statisztika(int[][] sorsolasok)
    {
        // Map key-ek 1-90-ig value pedig a darabszám

        for (int i = 1; i <= 90; i ++)
        {
            gyakorisagok.put(i, 0);
        }

        for (int [] huzas : sorsolasok)
        {
            for (int szam : huzas)
            {
                // Egy húzás öt darab számból állt, megnöveljük a darabszámát a megfelelő key-nél
                gyakorisagok.put(szam, gyakorisagok.getOrDefault(szam, 0) + 1);
            }
        }
    }
}
