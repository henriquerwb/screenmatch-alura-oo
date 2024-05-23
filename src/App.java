public class App {
    public static void main(String[] args) {
        Filme topGun = new Filme();
        topGun.nome = "Top Gun";
        topGun.anoLancamento = 1940;
        topGun.somaAvaliacoes = 8.5;
        topGun.duracaoEmMinutos = 200;
        topGun.incluidoNoPlano = true;


        topGun.exibeFichaTecnica();
        topGun.avalia(5.2);
        topGun.avalia(7.2);
        topGun.avalia(8.2);
        topGun.avalia(3.5);
        System.out.println(topGun.calculaMedia());
    }
}
