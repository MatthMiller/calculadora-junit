package com.calculadora.app;

// Classe calculadora
public class Calculadora {
    // Método somar, aceita dois argumentos como double e retorna sua soma
    public static double somar(double primeiroNumero, double segundoNumero) {
        return primeiroNumero + segundoNumero;
    }

    // Método subtrair, aceita dois argumentos como double e retorna sua subtração
    public static double subtrair(double primeiroNumero, double segundoNumero) {
        return primeiroNumero - segundoNumero;
    }

    // Método multiplicar, aceita dois argumentos como double e retorna sua multiplicação
    public static double multiplicar(double primeiroNumero, double segundoNumero) {
        return primeiroNumero * segundoNumero;
    }

    // Método dividir, aceita dois argumentos como double e retorna sua divisão
    public static double dividir(double dividendo, double divisor) {
        // Caso seja feita a divisão por 0, uma exceção é lançada
        if (divisor == 0) {
            throw new IllegalArgumentException("Não é possível dividir por 0.");
        }
        
        return dividendo / divisor;
    }
}
