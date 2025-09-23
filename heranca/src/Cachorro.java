public class Cachorro extends Animal {

    private String raca;

    public Cachorro(String nome, int idade, double peso, String raca) {
        super(nome, idade, peso); // chama o construtor da classe pai
        this.raca = raca;
    }

    public void latir() {
        System.out.println(nome + " está latindo: Au au!");
    }
}