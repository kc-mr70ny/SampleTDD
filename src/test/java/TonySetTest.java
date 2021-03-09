import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class TonySetTest {
    @Test
    void createEmptySet() {
        TonySet ts = new TonySet();
        Set s;
        assertTrue(ts.isEmpty());
        assertEquals(0,ts.size());
    }

    @Test
    void addItems() {
        TonySet ts = new TonySet();
        ts.add("item1");
        ts.add("item2");
        assertFalse(ts.isEmpty());
        assertEquals(2,ts.size());
        assertArrayEquals(new Object[] {"item1","item2",null,null,null}, ts.oarr);
    }

    @Test
    void addUniqueItems() {
        TonySet ts = new TonySet();
        ts.add("item1");
        ts.add("item2");
        ts.add("item3");
        ts.add("item4");
        ts.add("item5");
        assertArrayEquals(new Object[] {"item1","item2","item3","item4","item5"}, ts.oarr);
    }

    @Test
    void addDuplicates() {
        TonySet ts = new TonySet();
        ts.add("item1");
        ts.add("item2");
        ts.add("item3");
        ts.add("item4");
        ts.add("item4");
        assertArrayEquals(new Object[] {"item1","item2","item3","item4",null},ts.oarr);
    }

    @Test
    void remove() {
        TonySet ts = new TonySet();
        ts.add("item1");
        ts.add("item2");
        ts.add("item3");
        ts.add("item4");
        ts.remove("item2");
        assertArrayEquals(new Object[] {"item1","item3","item4",null,null},ts.oarr);
    }
}
