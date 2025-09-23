public class Animal {

    // Usamos 'protected' para que as classes filhas possam acessá-los diretamente.
    protected String nome;
    protected int idade;
    protected double peso;

    // Construtor da classe pai
    public Animal(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }
}