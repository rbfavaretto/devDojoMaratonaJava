package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercise;

public class Impressora {
    public void imprime(Funcionario funcionario) {
        System.out.println(funcionario.nome);
        System.out.println(funcionario.idade);
        for (double salarioUnitario : funcionario.salario) {
            System.out.println(salarioUnitario + " ");
        }
    }
}
