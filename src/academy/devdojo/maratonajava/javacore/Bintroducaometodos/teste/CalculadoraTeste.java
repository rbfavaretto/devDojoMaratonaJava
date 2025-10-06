package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste {
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
