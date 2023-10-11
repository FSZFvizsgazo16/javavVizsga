/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sikidomok;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Mr.KaraszekZoltán
 */
public class Sikidomok {

    // adatbázis kapcsolat létesítése
    static Connection k;

    static {
        try {
            k = DriverManager.getConnection("jdbc:sqlite:sikidomok.db");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Sikidomok() throws SQLException {
    }

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here


        Tesztesetek t=new Tesztesetek();
        t.setUpAll();
        t.tesztMegnevezesek();
        
        
    }
    static String[] megnevezesek() throws SQLException {
        String sqlCommand = "SELECT megnevezes FROM megnevezesek";
        PreparedStatement preparedStatement = k.prepareStatement(sqlCommand);
        ResultSet resultSet =  preparedStatement.executeQuery();

        String[] result = new String[5];
        int i = 0;

        while (resultSet.next())
        {
            result[i] = resultSet.getString("megnevezes");
            i++;
        }

        return result;
    }
    static int mennyi(String megnevezes) throws SQLException {
        String sqlCommand = "SELECT csid FROM kapcsolatok WHERE mid = (SELECT mid FROM megnevezesek WHERE megnevezes = ?)";
        PreparedStatement preparedStatement = k.prepareStatement(sqlCommand);
        preparedStatement.setString(1, megnevezes);
        ResultSet resultSet = preparedStatement.executeQuery();
        int csucsSzam = 0;

        while (resultSet.next())
        {
            csucsSzam = resultSet.getInt("csid");
        }
        return csucsSzam;
    }
}
