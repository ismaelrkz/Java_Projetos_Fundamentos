package br.com.erp.app;

import br.com.erp.core.ProdutoInternacional;
import br.com.erp.core.ProdutoNacional;
import br.com.erp.model.InterfaceTributos;
import br.com.erp.model.Origem;

public class MainERP {
    public static void main(String[] args) {

        // Aqui tenho acesso à classe ProdutoNacional por ela implementa a intefaceTributos?
        // Não entendi muito bem essa dinâmica!!!
        InterfaceTributos[] produtoFaturar = new InterfaceTributos[4];

        // PRODUTO NACIONAL
        produtoFaturar[0] = new ProdutoNacional(
                "Playstation 5",
                2500,
                Origem.NACIONAL,
                0.18,
                0.06,
                "Manaus-AM");
        produtoFaturar[1] = new ProdutoNacional(
                "Notebook Gamer",
                3300,
                Origem.NACIONAL,
                0.18,
                0.06,
                "São Paulo-SP");

        // PRODUTO INTERNACIONAL
        produtoFaturar[2] = new ProdutoInternacional(
                "Teclado Mecânico",
                350.55, Origem.INTERNACIONAL,
                0.60,
                0.18,
                0.10,
                "China");
        produtoFaturar[3] = new ProdutoInternacional(
                "Mouse Gamer",
                190.94, Origem.INTERNACIONAL,
                0.60,
                0.18,
                0.10,
                "USA");

        for(InterfaceTributos p: produtoFaturar){
            System.out.println(p);
            p.calcularImpostos();

            System.out.println(
                    "|-| -------------------------------------------------------------------------------- |-|");
        }

    }
}
