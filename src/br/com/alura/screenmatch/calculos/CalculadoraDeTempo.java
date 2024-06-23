package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Title;
import br.com.alura.screenmatch.modelos.TvShow;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Title title) {
        tempoTotal += title.getDuracaoEmMinutos();
    }
}
