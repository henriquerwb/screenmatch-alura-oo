package br.com.alura.screenmatch.modelos;

public class Title {
    String nome;
    private boolean incluidoNoPlano;
    private int anoLancamento;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public void exibeFichaTecnica() {
        System.out.println(nome);
        System.out.println(anoLancamento);
        System.out.println(duracaoEmMinutos);
    }

    public void avalia(double nota) {
        somaAvaliacoes+= nota;
        totalDeAvaliacoes++;
    }

    public double retornaMedia() {
        return somaAvaliacoes / totalDeAvaliacoes;
    }

    public double calculaMedia() {
        return somaAvaliacoes / totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
    }


    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}
