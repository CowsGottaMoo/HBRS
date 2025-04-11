import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestKlasse {

    @Test
    void testKonstruktor(){
        Paar<String, Integer> p1 = new Paar<>("Hallo", 5);
        assertEquals("Hallo", p1.erstes());
        assertEquals(5, p1.zweites());
    }

    @Test
    void testSetter(){
        Paar<String, Integer> paar = new Paar<>("A", 1);
        paar.setErstes("B");
        paar.setZweites(2);
        assertEquals("B", paar.erstes());
        assertEquals(2, paar.zweites());
    }

    @Test
    void testToString(){
        Paar<String, Integer> paar = new Paar<>("A", 1);
        assertEquals("(A, 1)", paar.toString());
    }

    @Test
    void testEqualsUngleich(){
        Paar<String, Integer> p1 = new Paar<>("A", 1);
        Paar<String, Integer> p2 = new Paar<>("B", 2);
        assertFalse(p1.equals(p2));
    }

    @Test
    void testEqualsGleich(){
        Paar<String, Integer> p1 = new Paar<>("A", 1);
        Paar<String, Integer> p2 = new Paar<>("A", 1);
        assertTrue(p1.equals(p2));
    }

    @Test
    void selbeReferenz(){
        Paar<String, Integer> x = new Paar<>("A", 1);
        assertTrue(x.equals(x));
    }

}
