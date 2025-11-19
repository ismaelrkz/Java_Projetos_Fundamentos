package br.com.erp.core;

import br.com.erp.model.InterfaceTributos;
import br.com.erp.model.Origem;
import br.com.erp.model.Produto;

public class ProdutoInternacional extends Produto implements InterfaceTributos {

    private final double iiImportacao;
    private final double icmsImportacao;
    private final double ipiInternacional;
    private final String paisOrigem;

    public ProdutoInternacional(String nomeProduto,
                                double valorProdutoBase,
                                Origem origemProduto,
                                double iiImportacao,
                                double icmsImportacao,
                                double ipiInternacional,
                                String paisOrigem) {
        super(nomeProduto, valorProdutoBase, origemProduto);
        this.iiImportacao = iiImportacao;
        this.icmsImportacao = icmsImportacao;
        this.ipiInternacional = ipiInternacional;
        this.paisOrigem = paisOrigem;
    }

    private void impostosInternacionais(){

        double valorII = this.valorProdutoBase * this.iiImportacao;
        double valorIcmsImport = this.valorProdutoBase * this.icmsImportacao;
        double valorIpi = this.valorProdutoBase * this.ipiInternacional;
        double totalComImpostos = this.valorProdutoBase + valorII + valorIcmsImport + valorIpi;

        System.out.printf(
                "|-| II Importação(%.2f%%): R$ %.2f | ICMS Importação(%.2f%%): R$ %.2f | IPI(%.2f%%): R$ %.2f | Total: R$ %.2f%n",
                this.iiImportacao * 100, valorII, this.icmsImportacao * 100, valorIcmsImport, this.ipiInternacional * 100, valorIpi, totalComImpostos);
    }

    @Override
    public void calcularImpostos() {
        impostosInternacionais();
    }

    @Override
    public String toString() {
        return "|-| " +
                "Nome Produto: " + this.nomeProduto + " | " +
                "Valor Base: " + this.valorProdutoBase + " | " +
                "Origem: " + this.origemProduto + " | "+
                "País de fabricação: " + this.paisOrigem;
    }
}
