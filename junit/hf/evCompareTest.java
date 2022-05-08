package hf;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class evCompareTest {
    private evCompare a = new evCompare();
    private Film f1 = new Film("cim1",2012,100,"gyerek");
    private Film f2 = new Film("cim2",2020,130,"csaladi");
    @Test
    void compare() {
        int x = a.compare(f1,f2);
        assertEquals(-1,x);

    }
}