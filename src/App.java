import br.com.alura.ScreenMatchOO.modelos.*;
import br.com.alura.ScreenMatchOO.modelos.Aluno;

public class App {
    public static void main(String[] args) {
        Livro senhorDosAneis = new Livro();

        senhorDosAneis.setAutor("Tolkien");
        senhorDosAneis.setTitulo("Senhor dos Anéis");

        senhorDosAneis.exibirDetalhes();
    }
}
