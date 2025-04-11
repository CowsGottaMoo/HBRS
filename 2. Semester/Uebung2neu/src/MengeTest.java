import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MengeTest {

    // Testet, ob insert() Duplikate ignoriert
    @Test
    void testInsertMitDuplikat() {
        Menge<Integer> menge = new MengeLimited<>();
        menge.insert(1);
        menge.insert(1); // Duplikat
        assertEquals(1, menge.size()); // Größe bleibt unverändert
        assertTrue(menge.contains(1));
    }

    // Testet, ob delete() bei nicht vorhandenem Element keine Wirkung hat
    @Test
    void testDeleteNichtEnthaltenesElement() {
        Menge<String> menge = new MengeLimited<>();
        menge.insert("A");
        menge.delete("B"); // Nicht vorhanden
        assertEquals(1, menge.size());
        assertFalse(menge.contains("B"));
    }

    // Testet die merge-Methode aus Mengelui (Vereinigung und Leerung von b)
    @Test
    void testMerge() {
        Menge<Integer> a = new MengeLimited<>();
        Menge<Integer> b = new MengeLimited<>();
        a.insert(1);
        b.insert(2);

        MengeUtil.merge(a, b); // Verschmelzen

        assertTrue(a.contains(1) && a.contains(2)); // a ist Vereinigung
        assertTrue(b.isEmpty()); // b ist leer
        assertEquals(2, a.size());
    }

    // Testet, ob contains() korrekt arbeitet
    @Test
    void testContains() {
        Menge<String> menge = new MengeLimited<>();
        menge.insert("Test");
        assertTrue(menge.contains("Test"));
        assertFalse(menge.contains("NichtVorhanden"));
    }

    // Testet isEmpty() und size()
    @Test
    void testIsEmptyUndSize() {
        Menge<Double> menge = new MengeLimited<>();
        assertTrue(menge.isEmpty());
        menge.insert(3.14);
        assertFalse(menge.isEmpty());
        assertEquals(1, menge.size());
    }

    // Optional: Testet get() (liefert irgendein Element ohne Entfernung)
    @Test
    void testGet() {
        Menge<Integer> menge = new MengeLimited<>();
        menge.insert(42);
        int element = menge.get();
        assertEquals(42, element);
        assertEquals(1, menge.size()); // Größe bleibt gleich
    }
}