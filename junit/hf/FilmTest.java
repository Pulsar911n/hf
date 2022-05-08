package hf;

import org.junit.jupiter.api.Test;
import org.junit.platform.engine.TestDescriptor;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FilmTest {
    private Film a = new Film("Keki", 2010,200,"gyerek");
    @Test
    void getCim() {
        String xd = a.getCim();
        assertFalse(xd.isEmpty());
    }

    @Test
    void getKiadasEve() {
        boolean de = a.getKiadasEve() == a.getHosszPercben();
        assertFalse(de);

    }

    @Test
    void getHosszPercben() {
        boolean ed = a.getHosszPercben() <300;
        assertTrue(ed);

    }

    @Test
    void getKategoria() {
        ArrayList<String> asd = new ArrayList<>();
        asd.add("gyerek");
        asd.add("dokumentum");
        asd.add("csaladi");
        boolean mi = asd.contains(a.getKategoria());
        assertTrue(mi);
    }
}