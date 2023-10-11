/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lottoszamokgyakorisaga;

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
    private static LottoszamokGyakorisaga l;
    
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
        l=new LottoszamokGyakorisaga();
        l.statisztika(l.szamhuzasok(5));
    }
    @Test
    void tesztStatisztika() {
        assertTrue(l.gyakorisagok.size()>=90);
        for(int i=1;i<=90;i++){
            assertTrue(l.gyakorisagok.get(i)>=0);
        }
    }
}

