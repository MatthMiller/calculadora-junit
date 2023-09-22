package com.calculadora.app;

// Classe para teste inicial da calculadora
public class App {
    public static void main(String[] args) {
        // Teste adição
        System.out.println("Adição 22 + 7 = " + Calculadora.somar(22, 7));

        // Teste subtração
        System.out.println("Subtração 5 - 50 = " + Calculadora.subtrair(5, 50));

        // Teste divisão
        System.out.println("Divisão 5 / 10 = " + Calculadora.dividir(5, 10));
        // Lança exceção devido ao argumento inválido (0)
        // System.out.println("Divisão 5 / 0 = " + Calculadora.dividir(5, 0));

        // Teste multiplicação
        System.out.println("Multiplicação 4 * 7 = " + Calculadora.multiplicar(4, 7));
    }
}
