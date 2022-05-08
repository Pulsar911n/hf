package hf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class hosszCompareTest {
    private hosszCompare a = new hosszCompare();
    private Film f1 = new Film("cim1",2012,160,"gyerek");
    private Film f2 = new Film("cim2",2020,130,"csaladi");
    @Test
    void compare() {
        int y = a.compare(f1,f2);
        assertEquals(1,y);
    }
}