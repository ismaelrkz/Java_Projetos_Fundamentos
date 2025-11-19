package br.com.banco.userinterface;

public class Conta {

    protected int numeroConta;
    protected int cpfTitular;
    protected String nomeTitular;
    protected double saldo;

    public Conta(int numeroConta, int cpfTitular, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.cpfTitular = cpfTitular;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public String toString(){
        return "Conta: " + this.numeroConta + " - " +
                "CPF: " + this.cpfTitular + " - " +
                "Nome: " + this.nomeTitular + " - " +
                "Saldo: " + this.saldo;
    };

    public void debitar(double valor){
        if(valor <= saldo){
            this.saldo -= valor;
            System.out.println("Valor debitado com sucesso!");
        }else{
            System.out.println("Valor insuficiente!");
        }

    };

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getCpfTitular() {
        return cpfTitular;
    }

    public void setCpfTitular(int cpfTitular) {
        this.cpfTitular = cpfTitular;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
