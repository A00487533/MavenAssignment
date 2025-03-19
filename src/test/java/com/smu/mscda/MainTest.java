package com.smu.mscda;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void testCapitalizeString() {
        assertEquals("Hello", App.capitalizeString("hello"));
    }

    @Test
    public void testGenerateMD5Hex() {
        assertEquals("5d41402abc4b2a76b9719d911017c592", App.generateMD5Hex("hello"));
    }
}