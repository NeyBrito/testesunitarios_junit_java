package com.teste;

import org.junit.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class AssertTeste {

    @Test
    public void testAssertArrayEquals(){
        byte[] esperado = "teste".getBytes(StandardCharsets.UTF_8);
        byte[] atual = "teste".getBytes(StandardCharsets.UTF_8);
        assertArrayEquals(esperado, atual);
    }

    @Test
    public void testeAssertEquals(){
        assertEquals("text", "text");
    }

    @Test
    public void testAssertFalse(){
        assertFalse(false);
    }

    @Test
    public void testAssertNotNull(){
        assertNotNull(new Object());
    }

    @Test
    public void testAsserNotSame(){
        assertNotSame(new Object(), new Object());
    }

    @Test
    public void testAssertNull(){
        assertNull(null);
    }

    @Test
    public void testAssertSame(){
        Integer aNumber = Integer.valueOf(768);
        assertSame(aNumber, aNumber);
    }






}
