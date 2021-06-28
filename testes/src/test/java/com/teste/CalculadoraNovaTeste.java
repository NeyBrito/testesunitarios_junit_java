package com.teste;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraNovaTeste {

    @Test
    public void deveSomarDoisValores(){
        int valor1 = 1;
        int valor2 = 2;
        CalculadoraNova calc = new CalculadoraNova();
        int soma = calc.somar(valor1, valor2);

        assertEquals(3, soma);
    }

    @Test
    public void deveSomarTresValores(){
        int valor1 = 1;
        int valor2 = 2;
        int valor3 = 3;
        CalculadoraNova calc = new CalculadoraNova();
        int soma = calc.somar(valor1, valor2, valor3);

        assertEquals(6, soma);
    }
}
