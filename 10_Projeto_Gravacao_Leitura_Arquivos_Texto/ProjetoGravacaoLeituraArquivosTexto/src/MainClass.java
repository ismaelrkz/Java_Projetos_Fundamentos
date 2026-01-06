import java.io.*;
import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {

        String arquivoCadastro = "cadastroClientes.txt"; // caminho para o arquivo.

        ArrayList<Cliente> listaClientes = new ArrayList<>();

        listaClientes.add(new Cliente(1, "Ana", "São Paulo", "011912345678"));
        listaClientes.add(new Cliente(2, "Bruno", "Rio de Janeiro", "021923456789"));
        listaClientes.add(new Cliente(3, "Carla", "Belo Horizonte", "031934567890"));
        listaClientes.add(new Cliente(4, "Daniel", "Curitiba", "041945678901"));
        listaClientes.add(new Cliente(5, "Eduarda", "Florianópolis", "048956789012"));
        listaClientes.add(new Cliente(6, "Felipe", "Porto Velho", "069967890123"));
        listaClientes.add(new Cliente(7, "Gabriela", "Salvador", "071978901234"));
        listaClientes.add(new Cliente(8, "Henrique", "Fortaleza", "085989012345"));
        listaClientes.add(new Cliente(9, "Isabela", "Recife", "081990123456"));
        listaClientes.add(new Cliente(10, "Lucas", "Manaus", "092901234567"));

        // -------------------- Gravação dados arquivo -------------------- //

        try {

            File f = new File(arquivoCadastro); // encapsula o caminho do arquivo.
            FileWriter fw = new FileWriter(f, true); // habilita o modo escrita e cria o arquivo.
            PrintWriter pw = new PrintWriter(fw); // grava os dados no arquivo (através dos seus métodos).

            listaClientes.forEach(cliente -> pw.println(cliente.toFileString()));

            pw.close();
            fw.close();

        } catch (IOException e) {
            System.out.println("Erro ao gravar os registros - " + e.getMessage());
        }

        // -------------------- Leitura dados arquivo -------------------- //

        try{

            File f = new File(arquivoCadastro); // encapsula o caminho do arquivo.
            FileReader fr = new FileReader(f); // ler os caracteres do arquivo.
            BufferedReader br = new BufferedReader(fr); // adicionar camada de leitura ao FileReader o aprimorando-o

            String line;

            while((line = br.readLine()) != null){
                System.out.println(line);
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("Erro ao ler os registros - " + e.getMessage());
        }

    }
}
