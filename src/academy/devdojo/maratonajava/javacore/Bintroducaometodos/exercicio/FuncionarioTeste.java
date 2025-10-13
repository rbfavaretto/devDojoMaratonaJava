package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicio;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Rafael";
        funcionario.idade = 23;
        funcionario.salario = new double[]{1500, 3456.78, 7890.90};

        Impressora impressora = new Impressora();
        impressora.imprime(funcionario);

        Media media  = new Media();
        media.mediaSalario(funcionario.salario);
    }
}