package br.com.simulado.core;

import br.com.simulado.userinterface.Questao;
import br.com.simulado.userinterface.QuestaoComDica;
import br.com.simulado.userinterface.QuestaoMultEscolha;

import java.util.Scanner;

public class Simulado {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int pontuacaoUsuario = 0;
        String respostaUsuario;

        Questao[] questoes = new Questao[3];

        questoes[0] = new Questao(
                "Qual a cor do sol?",
                "Laranja");
        questoes[1] = new QuestaoComDica(
                "Qual a cor do céu em dias ensolarados?",
                "Azul",
                "Oceano");
        questoes[2] = new QuestaoMultEscolha(
                "Qual é o nome do planeta em que vivemos?",
                "Terra",
                "Marte",
                "Júpiter",
                "Terra",
                "Saturno");

        for(Questao q: questoes){
            System.out.println(q.aplicarQuestao());
            respostaUsuario = keyboard.nextLine();
            if(q.corrigirQuestao(respostaUsuario)){
                pontuacaoUsuario++;
                System.out.println("Resposta correta!");
            }else{
                System.out.println("Resposta incorreta!");
            }
        }

        System.out.println("Respostas corretas: " + pontuacaoUsuario + " de " + questoes.length);

        keyboard.close();

    }
}
