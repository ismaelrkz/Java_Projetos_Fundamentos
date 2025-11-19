public class Produto {

    private int id;
    private String nome;
    private double preco;
    private int quantidade;
    private TipoProduto tipo;

    public Produto(int id, String nome, double preco, int quantidade, TipoProduto tipo) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.tipo = tipo;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public TipoProduto getTipo() {
        return tipo;
    }

    public void setTipo(TipoProduto tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Produto [ " +
                "id = " + id + " | " +
                "nome = " + nome + " | " +
                "preço = " + preco + " | " +
                "quantidade unidade = " + quantidade + " | " +
                "tipo = " + tipo + " ]";
    }
}
