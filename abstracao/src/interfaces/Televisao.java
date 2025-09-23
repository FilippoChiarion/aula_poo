package interfaces;

public class Televisao implements ControleRemoto {
    private boolean ligada;
    private String modelo;

    public Televisao(String modelo) {
        this.modelo = modelo;
        this.ligada = false;
    }

    @Override
    public void ligar() {
        this.ligada = true;
        System.out.println("TV " + modelo + " ligada.");
    }

    @Override
    public void desligar() {
        this.ligada = false;
        System.out.println("TV " + modelo + " desligada.");
    }
}