package classeabstrata;

public abstract class ControleRemotoAbstrato {
    protected String modelo;

    public ControleRemotoAbstrato(String modelo) {
        this.modelo = modelo;
    }

    public void checarBateria() {
        System.out.println("Bateria do modelo " + modelo + " está ok!");
    }

    public abstract void ligar();
    public abstract void desligar();
}