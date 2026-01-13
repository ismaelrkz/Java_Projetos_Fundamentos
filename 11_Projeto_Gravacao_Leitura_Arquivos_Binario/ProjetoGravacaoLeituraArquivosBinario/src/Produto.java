import java.io.Serial;
import java.io.Serializable;

public class Produto implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L; // Identificador da classe para deserialization (bytes > objeto).

    private int id;
    private String nome;
    private int quantidade;

    public Produto(int id, String nome, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() { // padrão csv
        return id + ";" + nome + ";" + quantidade;
    }
}
