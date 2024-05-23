import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Filme {
    String nome;
    boolean incluidoNoPlano;
    int anoLancamento;
    double somaAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica() {
        System.out.println(nome);
        System.out.println(anoLancamento);
        System.out.println(duracaoEmMinutos);
    }

    void avalia(double nota) {
        somaAvaliacoes+= nota;
        totalDeAvaliacoes++;
    }

    double calculaMedia() {
        return somaAvaliacoes / totalDeAvaliacoes;
    }


}
