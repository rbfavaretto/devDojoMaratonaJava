package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.subtraiDoisNumeros();
        calculadora.somaDoisNumeros();
        calculadora.multiplicaDoisNumeros(5, 12);
        double resultado = calculadora.divideDoisNumeros(24, 12);
        System.out.println(resultado);
        calculadora.imprimeDivisaoDoisNumeros(24, 2);
    }
}
