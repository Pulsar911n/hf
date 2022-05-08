package hf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class dokumentumFilmTest {
    private dokumentumFilm kek = new dokumentumFilm("cime",2020,120,"dokumentum","leiras");
    @Test
    void getLeiras() {
        boolean ketto = kek.getLeiras().isEmpty();
        boolean egy = kek.getLeiras().length()>10;

        assertTrue(egy);
        assertFalse(ketto);
    }
}