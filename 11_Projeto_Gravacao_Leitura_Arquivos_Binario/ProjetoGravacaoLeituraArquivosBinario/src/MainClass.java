
import java.io.*;
import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {

        String arquivoProduto = "listaProduto.bin";

        ArrayList<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(new Produto(1, "Abacaxi", 13));
        listaProdutos.add(new Produto(2, "Banana", 5));
        listaProdutos.add(new Produto(3, "Maçã", 8));
        listaProdutos.add(new Produto(4, "Laranja", 6));
        listaProdutos.add(new Produto(5, "Melancia", 15));
        listaProdutos.add(new Produto(6, "Mamão", 9));
        listaProdutos.add(new Produto(7, "Pera", 10));
        listaProdutos.add(new Produto(8, "Uva", 12));
        listaProdutos.add(new Produto(9, "Manga", 7));
        listaProdutos.add(new Produto(10, "Limão", 4));


        // ---------------- Serializer (objetos > bytes) ---------------- //

        try{

            File f = new File(arquivoProduto); // caminho arquivo
            FileOutputStream fo = new FileOutputStream(f); // grava o fluxo de bytes no arquivo
            ObjectOutputStream out = new ObjectOutputStream(fo); // transforma objetos em bytes

            out.writeObject(listaProdutos); // ObjectOutputStream & ArrayList fazem o loop internamente
                                            // Gravando assim os objetos em bytes no arquivo
                                            // necessário implementar Serializable nas classes dos objetos

            out.close(); // fechamentos manuais de recursos
            fo.close();

        } catch (Exception ex) {
            ex.printStackTrace(); // imprime o erro no console
        }

        // ---------------- Deserialization (bytes > objetos)---------------- //

        try{

            File f = new File(arquivoProduto); // Caminho para o arquivo
            FileInputStream fi = new FileInputStream(f); // Fluxo para leitura dos bytes do arquivo
            ObjectInputStream in = new ObjectInputStream(fi); // Classe responsável pelo Deserialization

            // readObject realiza a desserialização (bytes → objeto)
            // O casting informa ao compilador o tipo esperado, sendo validado em tempo de execução
            ArrayList<Produto> listaLida = (ArrayList<Produto>) in.readObject();

            listaLida.forEach(lista -> System.out.println(lista)); // loop teste impressão

            in.close(); // fechamentos manuais de recursos
            fi.close();

        } catch (EOFException ex) { // Marcador de Fim de Leitura - extrapolação da quantia de dados
            System.out.println("Fim do arquivo!"); // Só será lançado caso readObject sejá usado num ‘loop’
        } catch (IOException ex) { // Problemas na leitura do arquivo
            System.out.println("Erro ao ler registros -> " + ex.getMessage());
        } catch (Exception ex) { // Outros erros
            System.out.println("Erro ao converter os bytes lidos -> " + ex.getMessage());
        }

    }
}
