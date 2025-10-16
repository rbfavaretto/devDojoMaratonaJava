package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro toyota = new Carro();
        Carro chevrolet = new Carro();

        toyota.nome = "Yaris";
        toyota.modelo = "Hatch";
        toyota.ano = 2020;

        chevrolet.nome = "Onix";
        chevrolet.modelo = "Sedã";
        chevrolet.ano = 2022;

        toyota = chevrolet;

        System.out.println(toyota.nome + " " + toyota.modelo + " " + toyota.ano);
        System.out.println(chevrolet.nome +  " " + chevrolet.modelo + " " + chevrolet.ano);
    }
}
