package model;

public class Cliente {
    public String name;
    public int qtdPecas;
    public float valorPecas;

    public Cliente(String name, int qtdPecas, float valorPecas) {
        this.name = name;
        this.qtdPecas = qtdPecas;
        this.valorPecas = valorPecas;
    }

    public Cliente() {
        super();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", qtdPecas=" + qtdPecas +
                ", valorPecas=" + String.format("%.2f", valorPecas) +
                '}';
    }
}
