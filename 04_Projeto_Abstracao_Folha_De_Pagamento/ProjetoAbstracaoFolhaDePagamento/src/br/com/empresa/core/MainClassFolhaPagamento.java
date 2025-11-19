package br.com.empresa.core;

import br.com.empresa.userinterface.ChiefTechnologyOfficer;
import br.com.empresa.userinterface.Developer;
import br.com.empresa.userinterface.Funcionario;
import br.com.empresa.userinterface.TechLead;

public class MainClassFolhaPagamento {
    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[3];
        funcionarios[0] = new ChiefTechnologyOfficer(
                1231,
                "Simão Barjonas",
                "CTO",
                28960.43f,
                5000,
                3000);
        funcionarios[1] = new TechLead(
                1232,
                "Tiago Zebedeu",
                "TechLead",
                18350.34f,
                0.10f,
                330,
                1200);
        funcionarios[2] = new Developer(1233,
                "João Zebedeu",
                "Desenvolvedor",
                12575.55f,
                0.05f,
                500,
                330,
                1200);

        for(Funcionario f : funcionarios){
            System.out.println(String.format("|-| " +
                            "REG: %10d" + " | "+
                            "Nome: %-20s" + " | "+
                            "Cargo: %-15s" + "|-|",
                    f.getNumeroRegistro(),
                    f.getNomeFuncionario(),
                    f.getPosicaoFuncionario()));
            System.out.println(String.format("|-| Salário liquído: R$%10.2f " +
                            "                                       |-|",
                    f.calcularSalario()));
            System.out.println("|-| ----------------------------" +
                    "-----------------------------------------|-|");
        }

    }

}
