package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class  Anime {
    private String nome;
    private int[] episodios;

    // 1 - Alocado espaço em memória pro objeto;
    // 2 - Cada atributo da classe é criado e inicializado com valores default ou o que for passada;
    // 3 - Bloco de inicialização é executado;
    // 4 - Construtor é executado;

    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for(int i = 1; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime() {

        for (int episodio : episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}