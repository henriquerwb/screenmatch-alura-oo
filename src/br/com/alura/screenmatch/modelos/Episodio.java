package br.com.alura.screenmatch.modelos;

public class Episodio {
    private int numero;
    private String nome;
    private TvShow tvshow;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TvShow getTvshow() {
        return tvshow;
    }

    public void setTvshow(TvShow tvshow) {
        this.tvshow = tvshow;
    }
}
