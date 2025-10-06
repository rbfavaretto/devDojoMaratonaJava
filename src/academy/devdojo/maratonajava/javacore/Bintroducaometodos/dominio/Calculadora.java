package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(20 - 5);
    }

    public void multiplicaDoisNumeros(int num, int num2) {
        System.out.println(num * num2);
    }

    public double divideDoisNumeros(double num, double num2) {
        if (num == 0 || num2 == 0) {
            return 0;
        }
        return num / num2;
    }

    public void imprimeDivisaoDoisNumeros(double num, double num2) {
        if (num == 0 || num2 == 0) {
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num / num2);
    }

    public void alteraDoisNumeros (int num1, int num2) {

    }
}

