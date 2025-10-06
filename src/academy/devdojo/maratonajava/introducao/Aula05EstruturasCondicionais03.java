package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 1490.90;
        String resultado = salario > 2000 ? "Comprar PS5" : "Não comprar";
        System.out.println(resultado);

        int idade = 61;

        if (idade < 18) {
            String faixaEtaria = "criança";
        } else if (idade >= 18 && idade < 60) {
            String faixaEtaria = "adulto";
        } else {
            String faixaEtaria = "idoso";
        }

        String resultadoIdade = idade < 18 ? "criança" : idade >= 18 && idade < 60 ? "adulto" : "idoso";
        System.out.println(resultadoIdade);
    }
}
