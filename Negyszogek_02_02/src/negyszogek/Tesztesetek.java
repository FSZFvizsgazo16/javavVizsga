/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negyszogek;

/**
 *
 * @author Mr.KaraszekZoltán
 */
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class Tesztesetek {
    private static Negyszogek n;
    
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
    static void setUpAll() {
        n=new Negyszogek();
    }
    @Test
    void tesztTeglalapTerulet() {
        int t=n.t.Terulet();
        assertEquals(t,6);        
    }
    @Test
    void tesztNegyzetTerulet(){
        int t=n.n.Terulet();
        assertEquals(t,9);
    }
}
