/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sikidomok;

/**
 *
 * @author Mr.KaraszekZoltán
 */
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class Tesztesetek {
    private static Sikidomok s;
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
    
    @BeforeAll
    static void setUpAll() throws SQLException {
        s=new Sikidomok();
    }
    @Test
    void tesztMegnevezesek() throws SQLException {
        int db=0;
        for(String t:s.megnevezesek()){
            db++;
        }
        assertEquals(db,5);
    }
    @Test
    void tesztMennyi() throws SQLException
    {
        assertEquals(s.mennyi("Háromszög"),3);
    }
}