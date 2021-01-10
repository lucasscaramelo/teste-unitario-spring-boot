package br.com.spring;

public class Pedido {

    private String item;
    private int quantidade;

    public Pedido(String item, int quantidade) {
        this.item = item;
        this.quantidade = quantidade;
    }

    public String getItem() {
        return item;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
