package br.com.erp.core;

import br.com.erp.model.Origem;
import br.com.erp.model.Produto;
import br.com.erp.model.InterfaceTributos;

public class ProdutoNacional extends Produto implements InterfaceTributos {

    private final double icmsNacional;
    private final double ipiNacional;
    private final String regiaoFabricacao;

    public ProdutoNacional(String nomeProduto,
                           double valorProdutoBase,
                           Origem origemProduto,
                           double icmsNacional,
                           double ipiNacional,
                           String regiaoFabricacao) {
        super(nomeProduto, valorProdutoBase, origemProduto);
        this.icmsNacional = icmsNacional;
        this.ipiNacional = ipiNacional;
        this.regiaoFabricacao = regiaoFabricacao;
    }

    private void impostosNacionais(){

        double valorIcms = this.valorProdutoBase * this.icmsNacional;
        double valorIpi = this.valorProdutoBase * this.ipiNacional;
        double totalComImpostos = this.valorProdutoBase + valorIcms + valorIpi;

        System.out.printf(
                "|-| ICMS(%.2f%%): R$ %.2f | IPI(%.2f%%): R$ %.2f | Total: R$ %.2f%n",
                this.icmsNacional * 100, valorIcms, this.ipiNacional * 100, valorIpi, totalComImpostos);
    }

    public void metodoTeste(){
        System.out.println("teste");
    }

    @Override
    public void calcularImpostos() {
        impostosNacionais();
    }

    @Override
    public String toString() {
        return "|-| " +
                "Nome Produto: " + this.nomeProduto + " | " +
                "Valor Base: " + this.valorProdutoBase + " | " +
                "Origem: " + this.origemProduto + " | " +
                "Região fabricação: " + this.regiaoFabricacao;
    }
}
