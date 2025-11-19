import java.util.ArrayList;
import java.util.function.Predicate;

public class MainClass {
    public static void main(String[] args) {

        ArrayList<Produto> listaProduto = new ArrayList<>();

        listaProduto.add(new Produto(
                1, "Processador AMD Ryzen 5 5600X",
                1249.90,
                15,
                "Hardware",
                true));
        listaProduto.add(new Produto(
                2,
                "Placa-Mãe ASUS Prime B550M-A",
                899.00,
                10,
                "Hardware",
                true));
        listaProduto.add(new Produto(
                3,
                "Memória RAM Corsair Vengeance 16GB DDR4",
                379.90,
                25,
                "Hardware",
                true));
        listaProduto.add(new Produto(
                4,
                "SSD NVMe Kingston 1TB",
                449.90,
                20,
                "Armazenamento",
                false));
        listaProduto.add(new Produto(
                5,
                "Placa de Vídeo NVIDIA RTX 3060 12GB",
                2199.00,
                8,
                "Hardware",
                true));
        listaProduto.add(new Produto(
                6,
                "Fonte Corsair 650W 80 Plus Bronze",
                459.90,
                18,
                "Hardware",
                true));
        listaProduto.add(new Produto(
                7,
                "Gabinete Cooler Master com vidro temperado",
                499.90,
                12,
                "Gabinete",
                false));
        listaProduto.add(new Produto(
                8,
                "Cooler para CPU DeepCool Gammaxx 400",
                179.90,
                22,
                "Refrigeração",
                true));
        listaProduto.add(new Produto(
                9,
                "Monitor LG Ultragear 27'' 144Hz",
                1599.00,
                7,
                "Periféricos",
                true));
        listaProduto.add(new Produto(
                10,
                "Teclado Mecânico Redragon Kumara RGB",
                289.90,
                30,
                "Periféricos",
                false));

        System.out.println("\n-------------------------------------------------- Lista de Produtos (Completa) --------------------------------------------------\n");

        listaProduto.forEach(p -> System.out.println(p));

        System.out.println("\n-------------------------------------------------- Lista de Produtos (Ativos) --------------------------------------------------\n");

        exibirPorCriterio(listaProduto, p -> p.isStatus());

        System.out.println("\n-------------------------------------------------- Lista de Produtos (Desativados) --------------------------------------------------\n");

        exibirPorCriterio(listaProduto, p -> !p.isStatus());

        System.out.println("\n-------------------------------------------------- Lista de Produtos (Hardware) --------------------------------------------------\n");

        exibirPorCriterio(listaProduto, p -> p.getCategoria().matches("Hardware"));

        System.out.println("\n-------------------------------------------------- Lista de Produtos (Periféricos) --------------------------------------------------\n");

        exibirPorCriterio(listaProduto, p -> p.getCategoria().matches("Periféricos"));

        System.out.println("\n-------------------------------------------------- Lista de Produtos (R$ > 500.00) --------------------------------------------------\n");

        exibirPorCriterio(listaProduto, p -> {return p.getPreco() >= 500;});

    }

    public static void exibirPorCriterio(ArrayList<Produto> lista, Predicate<Produto> predicate){
        lista.forEach(l -> {
            if(predicate.test(l)){
                System.out.println(l);
            }
        });
    }

}
