package br.com.simulado.userinterface;

public class Questao {

    private final String enunciado;
    protected final String resposta;

    public Questao(String enunciado, String resposta) {
        this.enunciado = enunciado;
        this.resposta = resposta;
    }

    public String aplicarQuestao(){
        return "Questão: " + this.enunciado;
    }

    public Boolean corrigirQuestao(String resposta){
        if(this.resposta.equals(resposta)){
            return true;
        };
        return false;
    }

}
