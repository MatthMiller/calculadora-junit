package com.calculadora.app;

import org.junit.Assert;
import org.junit.Test;

// Classe de testes com JUnit
public class AppTest {    
    @Test
    public void subtrair_5por3_resulta2() {
        // Esperado
        final double expected = 2;
    
        // Ato
        final double actual = Calculadora.subtrair(5, 3);
    
        // Asserção
        Assert.assertEquals(expected, actual, 0.0002);
    }

    @Test
    public void somar_2por250_resulta252() {
        // Esperado
        final double expected = 252;
    
        // Ato
        final double actual = Calculadora.somar(2, 250);
    
        // Asserção
        Assert.assertEquals(expected, actual, 0.0002);
    }

    @Test
    public void multiplicar_2por15_resulta30() {
        // Esperado
        final double expected = 30;
    
        // Ato
        final double actual = Calculadora.multiplicar(2, 15);
    
        // Asserção
        Assert.assertEquals(expected, actual, 0.0002);
    }   

    @Test
    public void dividir_120por12_resulta10() {
        // Esperado
        final double expected = 10;
    
        // Ato
        final double actual = Calculadora.dividir(120, 12);
    
        // Asserção
        Assert.assertEquals(expected, actual, 0.0002);
    }   

    // Teste já com o resultado esperado no decorator
    @Test(expected = IllegalArgumentException.class)
    public void dividir_92por0_resultaExcecao() {
        // Ato
        Calculadora.dividir(92, 0); 
    }   
}
