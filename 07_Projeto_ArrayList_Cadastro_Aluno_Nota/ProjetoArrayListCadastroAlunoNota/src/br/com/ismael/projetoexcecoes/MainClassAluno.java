package br.com.ismael.projetoexcecoes;

import br.com.ismael.projetoexcecoes.exception.CustomException;
import br.com.ismael.projetoexcecoes.model.Aluno;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClassAluno {
    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {

            ArrayList<Aluno> listaAluno = new ArrayList<>();

            int qtd;

            System.out.println("|-| --------------- Quantos alunos deseja cadastrar? --------------- |-|");

            while (true){

                try{
                    qtd = teclado.nextInt();
                    if(qtd <= 0){
                        throw new CustomException("Somente valores acima de 0 são aceitos, digite novamente!");
                    }
                    teclado.nextLine();
                    break;
                } catch (CustomException e) {
                    System.out.println("Erro: " + e.getMessage());
                    teclado.nextLine();
                } catch (InputMismatchException e){
                    System.out.println("Erro: Tipo de valor incompatível!");
                    teclado.nextLine();
                }
            }

            for(int i = 0; i < qtd; i++){

                Aluno a = new Aluno();

                    while (true) {
                        try {
                            System.out.print("Preencha o nome do aluno: ");
                            a.setNomeAluno(teclado.nextLine());
                            break;
                        } catch (CustomException e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                    }
                    while (true) {
                        try {
                            System.out.print("Preencha disciplina matriculado: ");
                            a.setDisciplinaMatriculadoAluno(teclado.nextLine());
                            break;
                        } catch (CustomException e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                    }
                    while (true) {
                        try {
                            System.out.print("Preencha nota 1: ");
                            a.setNotaUm(teclado.nextDouble());
                            break;
                        } catch (CustomException e) {
                            System.out.println("Erro: " + e.getMessage());
                        } catch (InputMismatchException e) {
                            System.out.println("Erro: Tipo de valor incompatível!");
                            teclado.nextLine();
                        }
                    }
                    while (true) {
                        try {
                            System.out.print("Preencha nota 2: ");
                            a.setNotaDois(teclado.nextDouble());
                            break;
                        } catch (CustomException e) {
                            System.out.println("Erro: " + e.getMessage());
                        } catch (InputMismatchException e) {
                            System.out.println("Erro: Tipo de valor incompatível!");
                            teclado.nextLine();
                        }
                    }
                    while (true) {
                        try {
                            System.out.print("Preencha nota 3: ");
                            a.setNotaTres(teclado.nextDouble());
                            break;
                        } catch (CustomException e) {
                            System.out.println("Erro: " + e.getMessage());
                        } catch (InputMismatchException e) {
                            System.out.println("Erro: Tipo de valor incompatível!");
                            teclado.nextLine();
                        }
                    }
                    listaAluno.add(a);
                    teclado.nextLine();
            }
            for(Aluno l: listaAluno){
                System.out.println(l);
            }
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}