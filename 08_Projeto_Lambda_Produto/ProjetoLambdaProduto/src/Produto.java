public class Produto {

    private int id;
    private String nome;
    private double preco;
    private int estoque;
    private String categoria;
    private boolean status;

    public Produto(int id, String nome, double preco, int estoque, String categoria, boolean status) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.categoria = categoria;
        this.status = status;
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

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Produto = " +
                "id: " + id + " | "+
                "nome: " + nome + " | "+
                "Preco: " + preco + " | "+
                "Estoque: " + estoque + " | "+
                "Categoria: " + categoria + " | "+
                "Status: " + status;
    }
}
