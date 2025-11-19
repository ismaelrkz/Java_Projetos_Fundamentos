package br.com.simulado.userinterface;

public class QuestaoMultEscolha extends Questao{

    private final String altA;
    private final String altB;
    private final String altC;
    private final String altD;

    public QuestaoMultEscolha(String enunciado, String resposta, String altA, String altB, String altC, String altD) {
        super(enunciado, resposta);
        this.altA = altA;
        this.altB = altB;
        this.altC = altC;
        this.altD = altD;
    }

    @Override
    public String aplicarQuestao(){
        return super.aplicarQuestao() + "\n" +
                "A) " + this.altA + "\n" +
                "B) " + this.altB + "\n" +
                "C) " + this.altC + "\n" +
                "D) " + this.altD;
    }
}
