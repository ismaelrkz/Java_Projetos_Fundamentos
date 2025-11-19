package br.com.empresa.userinterface;

public class Developer extends Funcionario {

    private float bonusPerformance;
    private float auxilioHomeOffice;
    private float PRL;
    private float valeRefeicao;

    public Developer(int numeroRegistro,
                     String nomeFuncionario,
                     String posicaoFuncionario,
                     float salarioBase,
                     float bonusPerfomance,
                     float auxilioHomeOffice,
                     float PRL,
                     float valeRefeicao) {
        super(numeroRegistro, nomeFuncionario, posicaoFuncionario, salarioBase);
        this.bonusPerformance = bonusPerfomance;
        this.auxilioHomeOffice = auxilioHomeOffice;
        this.PRL = PRL;
        this.valeRefeicao = valeRefeicao;
    }

    @Override
    public float calcularSalario() {
        return salarioBase + (salarioBase * bonusPerformance) + auxilioHomeOffice + PRL + valeRefeicao;
    }

    public float getBonusPerformance() {
        return bonusPerformance;
    }

    public void setBonusPerformance(float bonusPerformance) {
        this.bonusPerformance = bonusPerformance;
    }

    public float getAuxilioHomeOffice() {
        return auxilioHomeOffice;
    }

    public void setAuxilioHomeOffice(float auxilioHomeOffice) {
        this.auxilioHomeOffice = auxilioHomeOffice;
    }

    public float getPRL() {
        return PRL;
    }

    public void setPRL(float PRL) {
        this.PRL = PRL;
    }

    public float getValeRefeicao() {
        return valeRefeicao;
    }

    public void setValeRefeicao(float valeRefeicao) {
        this.valeRefeicao = valeRefeicao;
    }
}
