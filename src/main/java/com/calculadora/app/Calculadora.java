package com.calculadora.app;

/**
 * Classe calculadora que realiza quatro operações aritméticas: soma, subtração, multiplicação e divisão.
 * @author Matheus Monteiro Bueno
 * @version 1.3
 * @since Release 1.0 da aplicação (Sep 22 2023).
 */
public class Calculadora {
    /**
     * Método de adição.
     * @param primeiroNumero Primeiro valor da soma.
     * @param segundoNumero Segundo valor da soma.
     * @return Retorna a soma dos dois argumentos.
     */
    public static double somar(double primeiroNumero, double segundoNumero) {
        return primeiroNumero + segundoNumero;
    }

    /**
     * Método de subtração.
     * @param primeiroNumero Minuendo, o valor que vai sofrer a subtração.
     * @param segundoNumero Subtraendo, o valor que vai subtrair.
     * @return Retorna a diferença entre os argumentos.
     */
    public static double subtrair(double primeiroNumero, double segundoNumero) {
        return primeiroNumero - segundoNumero;
    }

    /**
     * Método de multiplicação.
     * @param primeiroNumero Primeiro fator da multiplicação.
     * @param segundoNumero Segundo fator da multiplicação.
     * @return Retorna o resultado da multiplicação.
     */
    public static double multiplicar(double primeiroNumero, double segundoNumero) {
        return primeiroNumero * segundoNumero;
    }

     /**
     * Método que realiza a divisão.
     * @param dividendo Dividendo da operação de divisão.
     * @param divisor Divisor da operação de divisão.
     * @return Retorna o resultado da divisão.
     * @throws IllegalArgumentException Se o divisor informado for 0.
     */
    public static double dividir(double dividendo, double divisor) {
        // Caso seja feita a divisão por 0, uma exceção é lançada
        if (divisor == 0) {
            throw new IllegalArgumentException("Não é possível dividir por 0.");
        }
        
        return dividendo / divisor;
    }
}
