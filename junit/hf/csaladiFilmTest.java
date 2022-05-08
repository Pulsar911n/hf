package hf;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Spliterators;

import static org.junit.jupiter.api.Assertions.*;

class csaladiFilmTest {
    private csaladiFilm csal = new csaladiFilm("Cim",1010,100,"csaladi",12);
    @Test
    void getKorhatár() {
        boolean b = csal.getKorhatár()>18;
        assertFalse(b);

        ArrayList<Integer> i = new ArrayList<>();
        i.add(0);
        i.add(6);
        i.add(12);
        i.add(16);
        i.add(18);

        boolean c = i.contains(csal.getKorhatár());

        assertTrue(c);
    }
}