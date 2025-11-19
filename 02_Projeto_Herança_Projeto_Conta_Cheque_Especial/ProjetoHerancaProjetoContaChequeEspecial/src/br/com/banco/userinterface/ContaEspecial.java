package br.com.banco.userinterface;

public class ContaEspecial extends Conta{

    protected double limite;

    public ContaEspecial(int numeroConta, int cpfTitular, String nomeTitular, double saldo, double limite) {
        super(numeroConta, cpfTitular, nomeTitular, saldo);
        this.limite = limite;
    }

    public String toString(){
        return "Conta: " + super.numeroConta + " - " +
                "CPF: " + super.cpfTitular + " - " +
                "Nome: " + super.nomeTitular + " - " +
                "Saldo: " + super.saldo + " - " +
                "Limite: " + this.limite;
    };

    @Override
    public void debitar(double valor){
        if(valor <= saldo + limite){
            this.saldo -= valor;
            if(saldo <= 0){
                this.limite += saldo;
            }
            System.out.println("Valor debitado com sucesso!");
        }else{
            System.out.println("Valor insuficiente!");
        }
    };

    public double getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
}
