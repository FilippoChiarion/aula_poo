public class Gato extends Animal {

    private String corDoPelo;

    public Gato(String nome, int idade, double peso, String corDoPelo) {
        super(nome, idade, peso); // chama o construtor da classe pai
        this.corDoPelo = corDoPelo;
    }

    public void miar() {
        System.out.println(nome + " está miando: Miau!");
    }
}