package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicio;

public class Media {
    public void mediaSalario(double[] numeros) {
        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }
        double media = soma / numeros.length;
        System.out.println("A média é: " + media);
    }
}
