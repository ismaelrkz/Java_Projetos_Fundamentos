package br.com.ismael.projetoexcecoes.model;

import br.com.ismael.projetoexcecoes.exception.CustomException;

public class Aluno {

    private String nomeAluno;
    private String disciplinaMatriculadoAluno;
    private double notaUm;
    private double notaDois;
    private double notaTres;

    private double calcularNotaFinal(){
        int p1 = 2, p2 = 3, p3 = 5;
        return ((this.notaUm * p1) + (this.notaDois * p2) + (this.notaTres * p3)) / (p1+p2+p3);
    }

    private void validarNota(double valor) throws CustomException {
        if(valor < 0 || valor > 10){
            throw new CustomException("Valores negativos ou acima de 10 são inválidos!");
        }
    }

    private void validarTexto(String valor) throws CustomException{
        if(!valor.matches("[a-zA-ZÀ-ÿ\\s]+")){
            throw new CustomException("Valores vazios, numéricos e caracteres especiais são inválidos!");
        }
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) throws CustomException {
        validarTexto(nomeAluno);
        this.nomeAluno = nomeAluno;
    }

    public String getDisciplinaMatriculadoAluno() {
        return disciplinaMatriculadoAluno;
    }

    public void setDisciplinaMatriculadoAluno(String disciplinaMatriculadoAluno)  throws CustomException{
        validarTexto(disciplinaMatriculadoAluno);
        this.disciplinaMatriculadoAluno = disciplinaMatriculadoAluno;
    }

    public double getNotaUm() {
        return notaUm;
    }

    public void setNotaUm(double notaUm) throws CustomException {
        validarNota(notaUm);
        this.notaUm = notaUm;
    }

    public double getNotaDois() {
        return notaDois;
    }

    public void setNotaDois(double notaDois) throws CustomException{
        validarNota(notaDois);
        this.notaDois = notaDois;
    }

    public double getNotaTres() {
        return notaTres;
    }

    public void setNotaTres(double notaTres) throws CustomException {
        validarNota(notaTres);
        this.notaTres = notaTres;
    }

    @Override
    public String toString() {
        return String.format("Nome Aluno: %s | Matéria: %s | Nota 1: %.1f | Nota 2: %.1f | Nota 3: %.1f | Nota Final: %.1f",
                nomeAluno, disciplinaMatriculadoAluno, notaUm, notaDois, notaTres, calcularNotaFinal()
        );
    }
}