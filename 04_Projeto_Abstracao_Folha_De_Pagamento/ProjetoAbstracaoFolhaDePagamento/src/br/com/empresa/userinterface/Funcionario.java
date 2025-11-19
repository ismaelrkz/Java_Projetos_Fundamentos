package br.com.empresa.userinterface;

public abstract class Funcionario {

    protected int numeroRegistro;
    protected String nomeFuncionario;
    protected String posicaoFuncionario;
    protected float salarioBase;

    public Funcionario(int numeroRegistro, String nomeFuncionario, String posicaoFuncionario, float salarioBase) {
        this.numeroRegistro = numeroRegistro;
        this.nomeFuncionario = nomeFuncionario;
        this.posicaoFuncionario = posicaoFuncionario;
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalario();

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getPosicaoFuncionario() {
        return posicaoFuncionario;
    }

    public void setPosicaoFuncionario(String posicaoFuncionario) {
        this.posicaoFuncionario = posicaoFuncionario;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
}
