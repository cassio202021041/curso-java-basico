package CursoBasicoOO;

public class Carro {

    String marca;
    String modelo;
    double capCombustivel;
    double consumoCombustivel;
    int numPassageiro;

    void exibirAutonomia(){

        System.out.println(" A autonomia do carro é: " + capCombustivel * consumoCombustivel +" Km ");

       }

}
