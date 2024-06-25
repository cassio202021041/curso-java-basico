package CursoBasicoOO;

public class TesteCarro {

    public static void main(String[] args) {     
       
        
            Carro van = new Carro();
            van.marca = "Fiat";
            van.modelo = "Ducato";
            van.capCombustivel = 100;
            van.consumoCombustivel = 0.2;
            van.numPassageiro = 10;

            Carro fusca = new Carro();
            fusca.marca = "VW Fusca";
            fusca.modelo = "98";
            fusca.capCombustivel = 40;
            fusca.consumoCombustivel = 4.0;
            fusca.numPassageiro = 4 ;

        
           System.out.println("Marca: " + van.marca + " Modelo: " + van.modelo);
           System.out.println("Marca: " + fusca.marca + " Modelo: " + fusca.modelo);

           van.exibirAutonomia();

          
    }
}

