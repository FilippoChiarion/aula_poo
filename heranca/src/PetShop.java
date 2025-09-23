public class PetShop {
    public static void main(String[] args) {

        System.out.println("--- Criando um Cachorro ---");
        Cachorro dog = new Cachorro("Coragem", 5, 15.5, "Medroso");

        dog.latir(); // metodo proprio da classe
        dog.comer(); // metodo herdado


        System.out.println("\n--- Criando um Gato ---");
        Gato cat = new Gato("Garfield", 3, 4.2, "Laranja");

        cat.miar(); // metodo proprio da classe
        cat.dormir(); // metodo herdado

        // Podemos acessar os atributos herdados também
        System.out.println("\nO nome do cachorro é: " + dog.nome);
        System.out.println("O nome do gato é: " + cat.nome);
    }
}