package br.com.erp.model;

public abstract class Produto {

    protected String nomeProduto;
    protected double valorProdutoBase;
    protected Origem origemProduto;

    public Produto(String nomeProduto, double valorProdutoBase, Origem origemProduto) {
        this.nomeProduto = nomeProduto;
        this.valorProdutoBase = valorProdutoBase;
        this.origemProduto = origemProduto;
    }

    public abstract String toString();

}
