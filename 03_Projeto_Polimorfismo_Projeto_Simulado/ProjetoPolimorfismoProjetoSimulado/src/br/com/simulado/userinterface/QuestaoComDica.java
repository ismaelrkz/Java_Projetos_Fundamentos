package br.com.simulado.userinterface;

public class QuestaoComDica extends Questao{

    private final String dica;

    public QuestaoComDica(String enunciado, String resposta, String dica) {
        super(enunciado, resposta);
        this.dica = dica;
    }

    @Override
    public String aplicarQuestao(){
        return super.aplicarQuestao() + "\n" +
                "  Dica (" + this.dica + ")";
    }

}