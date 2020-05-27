package task4;

import static org.junit.Assert.*;

public class NambersArchiveTest {

    @org.junit.Test
    public void archive() {
        assertEquals("5,3,1-4,8,9,23-26",NambersArchive.archive("5,3,1,2,3,4,8,9,23,24,25,26"));
        assertEquals("1,4-7,-15--12,9",NambersArchive.archive("1,4,5,6,7,-15,-14,-13,-12,9"));
    }
}