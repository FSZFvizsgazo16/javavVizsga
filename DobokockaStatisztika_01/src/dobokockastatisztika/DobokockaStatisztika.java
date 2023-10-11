/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dobokockastatisztika;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 *
 * @author Mr.KaraszekZoltán
 */
public class DobokockaStatisztika {

    /**
     * @param args the command line arguments
     */
    String sorozat="123146166661611115555152444425";
    public static void main(String[] args) {
        // TODO code application logic here
        Tesztesetek t=new Tesztesetek();
        t.setUpAll();
        t.setUpStreams();
        t.tesztSzam();
        t.tesztHossz();
        t.restoreStreams();
    }
    int beolvas()
    {
        // beolvasás a konzolról
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon megy egy számot!");
        int szam = scanner.nextInt();*/
        int szam = 5;

        /*
        while (szam<=1 || szam>=6)
        {
            szam = scanner.nextInt();
        }*/

        return szam;
    }
    void leghosszabb(int szam)
    {
        int counter = 0;

        // hány darab van adott számból egymás mellett
        List<Integer> szamokDBLista = new ArrayList<>();
        // sorozat="123146166661611115555152444425";

        for (int i = 1; i < sorozat.length(); i++)
        {
            int szamNew = parseInt(String.valueOf(sorozat.charAt(i)));

            if (szamNew == szam)
            {
                counter ++;
            }
            else
            {
                szamokDBLista.add(counter);
            }

        }

        int maximum = 0;

        for (Integer darab : szamokDBLista)
        {
            if (darab > maximum)
            {
                maximum = darab;
            }
        }

        String outputString = "";

        for (int i = 1; i<=maximum; i++)
        {
            outputString += String.valueOf(szam);
        }

        System.out.printf("%s: %d",outputString,maximum);
    }
}
