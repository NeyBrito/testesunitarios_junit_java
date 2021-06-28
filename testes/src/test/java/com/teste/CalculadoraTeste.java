package com.teste;


import com.teste.Calculadora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.mock;

/**
 *
 * @author jony_
 */

public class CalculadoraTeste {

    public CalculadoraTeste() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        Calculadora calc = new Calculadora();
        assertEquals(4, calc.somar(2, 2));
    }

//    @Test
//    public void testeSomarComMock(){
//        Calculadora calculadora = mock(Calculadora.class);
//        when(calculadora.somar("1+2")).thenReturn(10);
//
//        int resultado = calculadora.somar("1+2");//
//    }



}