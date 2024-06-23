import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.TvShow;

public class App {
    public static void main(String[] args) {
        TvShow house = new TvShow();
        house.setNome("House M.D.");
        house.setAnoLancamento(2004);
        house.setSeasons(8);
        house.setMinutesPerEpisode(50);
        house.setEpisodesPerSeason(23);
        System.out.println(house.getDuracaoEmMinutos());

        Filme interstellar = new Filme();
        interstellar.setNome("Interstellar");
        interstellar.setDiretor("Christopher Nolan");
        interstellar.setAnoLancamento(2014);
        interstellar.setDuracaoEmMinutos(169);
        interstellar.setIncluidoNoPlano(true);
        interstellar.avalia(8);
        interstellar.avalia(9);
        interstellar.avalia(10);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(interstellar);
        calculadora.inclui(house);
        System.out.println(calculadora.getTempoTotal());


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(interstellar);

        Episodio episodio = new Episodio();
        episodio.setNome("Piloto");
        episodio.setNumero(1);
        episodio.setTvshow(house);
        episodio.setTotalVisualizacoes(500);
        filtro.filtra(episodio);

    }
}
