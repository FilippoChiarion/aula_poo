package classeabstrata;

public class ControleParaTV extends ControleRemotoAbstrato {
    public ControleParaTV(String modelo) {
        super(modelo);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando a TV com o controle " + this.modelo);
    }

    @Override
    public void desligar() {
        System.out.println("Desligando a TV...");
    }
}