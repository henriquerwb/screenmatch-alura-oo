package br.com.alura.ScreenMatchOO.modelos;

public class Aluno {
    private String nome;
    private double notas;
    private int quantidadeDeNotas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }

    public int getQuantidadeDeNotas() {
        return quantidadeDeNotas;
    }

    public void cadastrarNota(double nota) {
        notas+= nota;
        quantidadeDeNotas++;
    }

    public double calcularMedia() {
        return notas / quantidadeDeNotas;
    }
}
