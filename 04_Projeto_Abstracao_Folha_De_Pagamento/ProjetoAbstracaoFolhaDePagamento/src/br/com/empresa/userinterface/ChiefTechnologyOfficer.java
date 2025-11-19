package br.com.empresa.userinterface;

public class ChiefTechnologyOfficer extends Funcionario {

    private float bonusMensal;
    private float beneficioCarro;

    public ChiefTechnologyOfficer(int numeroRegistro,
                                  String nomeFuncionario,
                                  String posicaoFuncionario,
                                  float salarioBase,
                                  float bonusMensal,
                                  float beneficioCarro) {
        super(numeroRegistro, nomeFuncionario, posicaoFuncionario, salarioBase);
        this.bonusMensal = bonusMensal;
        this.beneficioCarro = beneficioCarro;
    }

    @Override
    public float calcularSalario() {
        return salarioBase + bonusMensal + beneficioCarro;
    }

    public float getBonusMensal() {
        return bonusMensal;
    }

    public void setBonusMensal(float bonusMensal) {
        this.bonusMensal = bonusMensal;
    }

    public float getBeneficioCarro() {
        return beneficioCarro;
    }

    public void setBeneficioCarro(float beneficioCarro) {
        this.beneficioCarro = beneficioCarro;
    }
}
