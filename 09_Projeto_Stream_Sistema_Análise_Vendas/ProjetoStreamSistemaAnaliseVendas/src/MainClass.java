import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        ArrayList<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(new Produto(1, "Banana", 4.99, 30, TipoProduto.FRUTA));
        listaProdutos.add(new Produto(2, "Maçã", 5.50, 20, TipoProduto.VERDURA));
        listaProdutos.add(new Produto(3, "Laranja", 4.20, 18, TipoProduto.LEGUME));
        listaProdutos.add(new Produto(4, "Pera", 6.30, 12, TipoProduto.FRUTA));
        listaProdutos.add(new Produto(5, "Uva", 8.99, 10, TipoProduto.VERDURA));

        listaProdutos.add(new Produto(6, "Abacaxi", 7.49, 8, TipoProduto.LEGUME));
        listaProdutos.add(new Produto(7, "Melancia", 12.90, 5, TipoProduto.FRUTA));
        listaProdutos.add(new Produto(8, "Mamão", 6.10, 9, TipoProduto.LEGUME));
        listaProdutos.add(new Produto(9, "Manga", 5.80, 14, TipoProduto.VERDURA));
        listaProdutos.add(new Produto(10, "Limão", 3.20, 25, TipoProduto.FRUTA));

        listaProdutos.add(new Produto(11, "Batata", 4.10, 30, TipoProduto.VERDURA));
        listaProdutos.add(new Produto(12, "Cebola", 3.90, 22, TipoProduto.FRUTA));
        listaProdutos.add(new Produto(13, "Tomate", 6.99, 18, TipoProduto.LEGUME));
        listaProdutos.add(new Produto(14, "Cenoura", 4.50, 16, TipoProduto.FRUTA));
        listaProdutos.add(new Produto(15, "Abobrinha", 4.70, 11, TipoProduto.VERDURA));

        listaProdutos.add(new Produto(16, "Brócolis", 7.80, 7, TipoProduto.LEGUME));
        listaProdutos.add(new Produto(17, "Couve-Flor", 8.30, 6, TipoProduto.FRUTA));
        listaProdutos.add(new Produto(18, "Alface", 2.99, 12, TipoProduto.LEGUME));
        listaProdutos.add(new Produto(19, "Repolho", 5.20, 10, TipoProduto.FRUTA));
        listaProdutos.add(new Produto(20, "Couve", 3.90, 14, TipoProduto.VERDURA));

        System.out.println("Digite o número relacionado para filtragem: [ VERDURA(1) FRUTA(2) LEGUME(3) ]");

        int tipo = keyboard.nextInt();
        switch (tipo){
            case 1:
                selecaoTipo(listaProdutos, 1);
                break;
            case 2:
                selecaoTipo(listaProdutos, 2);
                break;
            case 3:
                selecaoTipo(listaProdutos, 3);
                break;
            default:
                System.out.println("Digite um valor válido, reinicie o programa!");
        };

        keyboard.close();

    }

    public static void selecaoTipo(List<Produto> lista, int valor){

        TipoProduto tipo;
        if(valor == 1){
            tipo = TipoProduto.VERDURA;
        } else if(valor == 2){
            tipo = TipoProduto.FRUTA;
        } else if (valor == 3){
            tipo = TipoProduto.LEGUME;
        } else {
            tipo = null;
        }

        lista.stream()
                .filter(p -> p.getTipo() == tipo)
                .forEach(p -> System.out.println(p));
        System.out.println();

        int quantidadeEstoque;
        quantidadeEstoque = lista.stream()
                .filter(p -> p.getTipo() == tipo) // Filtra os produtos
                .map(p -> p.getQuantidade()) // Mapeia para um Stream de Inteiros (Quantidades)
                .reduce(0, (q1, q2) -> q1 + q2); // Reduz (Soma) os Inteiros
        System.out.println("# Total estoque: " + quantidadeEstoque );

        double valorEstoque;
        valorEstoque = lista.stream()
                .filter(p -> p.getTipo() == tipo) // Filtra
                .map(p -> p.getQuantidade() * p.getPreco()) // Mapeia para o Valor Individual (Double)
                .reduce(0.0, (p1, p2) -> p1 + p2); // Reduz (Soma) os Valores
        System.out.println(String.format("# Valor estoque: R$ %.2f", valorEstoque));

    }

}
