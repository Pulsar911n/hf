package hf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class gyerekFilmTest {
    private gyerekFilm x = new gyerekFilm("Cime",1030,50,"gyerek","animacios");
    @Test
    void getTipus() {
        boolean a = x.getTipus().isEmpty();
        assertFalse(a);
    }

    @Test
    void testToString() {
        String b = x.toString();
        boolean c = b.isEmpty();
        assertFalse(c);
    }
}