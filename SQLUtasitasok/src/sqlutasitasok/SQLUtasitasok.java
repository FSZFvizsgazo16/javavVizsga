/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sqlutasitasok;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Mr.KaraszekZoltán
 */
public class SQLUtasitasok {

    /**
     * @param args the command line arguments
     */
    static Tesztesetek t=new Tesztesetek();
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        kiiras("");
        beolvasas();
        t.setUpStreams();
        t.setUpAll();
        //beolvasas();
        t.restoreStreams();
    }
    static void beolvasas() throws IOException {
        String utasitas="";
        
        kiiras(utasitas);
        t.tesztUtasitas();
    }
    static void kiiras(String utasitas) throws IOException {

        File file = new File("src/sqlutasitasok/sikidomok.sql");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;

        while ((line = bufferedReader.readLine()) != null)
        {
            // az sql utasítás végén lépjen ki
            if (bufferedReader.readLine().endsWith(";"))
            {
                utasitas += "\n";
            }

            utasitas += line.trim();
        }

        System.out.print(utasitas);
    }
}
