package com.smu.mscda;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void testCapitalizeString() {
        assertEquals("Hello", App.capitalizeString("hello"));
        assertEquals("World", App.capitalizeString("world"));
        assertEquals("", App.capitalizeString(""));
        assertNull(App.capitalizeString(null));
    }

    @Test
    public void testGenerateMD5Hex() {
        assertEquals("5d41402abc4b2a76b9719d911017c592", App.generateMD5Hex("hello"));
        assertEquals("098f6bcd4621d373cade4e832627b4f6", App.generateMD5Hex("test"));
        assertNull(App.generateMD5Hex(null));
    }
}