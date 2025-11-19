public class Carteira {

    // ATRIBUTOS
    private String nome;
    private int cpf;
    private double saldo;

    // CONSTRUTOR
    public Carteira(String nome,
                    int cpf,
                    double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    // GETTERS & SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // MÉTODOS PARA MANIPULAR OS DADOS
    public String exibirDadosCarteira() {
        return "Titular da carteira: " + nome + "\n" +
                "CPF: " + cpf + "\n" +
                "Saldo: " + String.format("%.2f", saldo) + "\n";
    }

    public boolean depositarSaldo(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacarSaldo(double valor) {
        if (saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

}



