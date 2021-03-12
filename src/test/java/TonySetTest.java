import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
 class TonySetTest {
    @Test
    void createEmptySet() {
        TonySet ts = new TonySet();
        assertTrue(ts.isEmpty());
        assertEquals(0,ts.size());
    }

    @Test
    void addItems() {
        TonySet ts = new TonySet();
        ts.add("item1");
        ts.add("item2");
        assertFalse(ts.isEmpty());
        assertArrayEquals(new Object[] {"item1","item2",null,null,null}, ts.objArr);
        assertEquals(2,ts.size());
        ts.add("item3");
        ts.add("item4");
        ts.add("item4");//Duplications
        assertArrayEquals(new Object[] {"item1","item2","item3","item4",null},ts.objArr);
        assertEquals(4,ts.size());
        ts.add("item5");//Added Uniques
        assertArrayEquals(new Object[] {"item1","item2","item3","item4","item5"}, ts.objArr);
        assertEquals(5,ts.size());
        ts.remove("item2");//Removed item2
        assertArrayEquals(new Object[] {"item1",null,"item3","item4","item5"},ts.objArr);
        assertEquals(4,ts.size());
    }

    @Test
    void removeNulls(){
        TonySet ts = new TonySet();
        ts.add("item1");
        ts.add("item2");
        assertArrayEquals(new Object[] {"item1","item2"},ts.RemoveNulls(ts.objArr));
    }
}
