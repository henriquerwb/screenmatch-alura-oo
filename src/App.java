import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
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

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(interstellar);
        calculadora.inclui(house);
        System.out.println(calculadora.getTempoTotal());

    }
}
