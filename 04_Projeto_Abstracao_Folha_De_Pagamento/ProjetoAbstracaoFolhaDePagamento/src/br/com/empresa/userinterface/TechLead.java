package br.com.empresa.userinterface;

public class TechLead extends Funcionario{

    private float bonusPerformance;
    private float PRL;
    private float valeRefeicao;

    public TechLead(int numeroRegistro,
                    String nomeFuncionario,
                    String posicaoFuncionario,
                    float salarioBase,
                    float bonusPerfomance,
                    float PRL,
                    float valeRefeicao) {
        super(numeroRegistro, nomeFuncionario, posicaoFuncionario, salarioBase);
        this.bonusPerformance = bonusPerfomance;
        this.PRL = PRL;
        this.valeRefeicao = valeRefeicao;

    }

    @Override
    public float calcularSalario() {
        return salarioBase + (salarioBase * bonusPerformance) + PRL + valeRefeicao;
    }

    public float getBonusPerformance() {
        return bonusPerformance;
    }

    public void setBonusPerformance(float bonusPerformance) {
        this.bonusPerformance = bonusPerformance;
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
