import classeabstrata.*;
import interfaces.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- 1. Testando a Classe Abstrata ---");
        ControleRemotoAbstrato meuControleTV = new ControleParaTV("Samsung Smart");
        meuControleTV.ligar();
        meuControleTV.checarBateria(); // metodo da classe pai
        meuControleTV.desligar();

        System.out.println("\n--- 2. Testando a Interface ---");
        ControleRemoto meuOutroControle = new Televisao("LG OLED");
        meuOutroControle.ligar();
        meuOutroControle.desligar();
    }
}