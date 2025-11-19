package br.com.ismael.projetoexcecoes;

import br.com.ismael.projetoexcecoes.exception.CustomException;
import br.com.ismael.projetoexcecoes.model.Aluno;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClassAluno {
    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {
            Aluno a1 = new Aluno();
            System.out.println("|-| -------------------- CADASTRO ALUNO & NOTAS -------------------- |-|");

            //nome aluno
            while (true) {
                try {
                    System.out.print("Digite nome aluno: ");
                    a1.setNomeAluno(teclado.nextLine());
                    break;
                } catch (CustomException e) {
                    System.out.println("ERRO: " + e.getMessage());
                }
            }

            //disciplina matriculado
            while (true) {
                try {
                    System.out.print("Digite matéria matriculado: ");
                    a1.setDisciplinaMatriculadoAluno(teclado.nextLine());
                    break;
                } catch (CustomException e) {
                    System.out.println("ERRO: " + e.getMessage());
                }
            }

            //nota um
            while (true) {
                try {
                    System.out.print("Digite nota 1: ");
                    a1.setNotaUm(teclado.nextDouble());
                    break;
                } catch (CustomException e) {
                    System.out.println("ERRO: " + e.getMessage());
                } catch (InputMismatchException e) {
                    System.out.println("ERRO DE DIGITAÇÃO: Somente valores numéricos são válidos!");
                    teclado.nextLine();
                }
            }

            //nota dois
            while (true) {
                try {
                    System.out.print("Digite nota 2: ");
                    a1.setNotaDois(teclado.nextDouble());
                    break;
                } catch (CustomException e) {
                    System.out.println("ERRO: " + e.getMessage());
                } catch (InputMismatchException e) {
                    System.out.println("ERRO DE DIGITAÇÃO: Somente valores numéricos são válidos!");
                    teclado.nextLine();
                }
            }

            //nota tres
            while (true) {
                try {
                    System.out.print("Digite nota 3: ");
                    a1.setNotaTres(teclado.nextDouble());
                    break;
                } catch (CustomException e) {
                    System.out.println("ERRO: " + e.getMessage());
                } catch (InputMismatchException e) {
                    System.out.println("ERRO DE DIGITAÇÃO: Somente valores numéricos são válidos!");
                    teclado.nextLine();
                }
            }

            //exibir dados
            System.out.print(a1);
            a1.exibirNotaFinal();

        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }

    }
}
