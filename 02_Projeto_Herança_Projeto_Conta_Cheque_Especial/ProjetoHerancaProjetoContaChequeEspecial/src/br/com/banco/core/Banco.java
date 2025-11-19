package br.com.banco.core;

import br.com.banco.userinterface.Conta;
import br.com.banco.userinterface.ContaEspecial;

public class Banco {
    public static void main(String[] args) {

        Conta c1 = new Conta(
                4321,
                987654321,
                "Ismael",
                1000.00);

        ContaEspecial ce1 = new ContaEspecial(
                1234,
                123456789,
                "Valesca",
                1000.00,
                1000.00);

        System.out.println(c1);
        c1.debitar(900.00);
        System.out.println(c1);

        System.out.println("--------------//--------------");

        System.out.println(ce1);
        ce1.debitar(1700.00);
        System.out.println(ce1);

    }
}
