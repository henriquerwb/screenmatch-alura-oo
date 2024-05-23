public class Exercicios {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Calculadora calc = new Calculadora();
        Carro corsa = new Carro();
        Aluno pedro = new Aluno();

        pedro.nome = "Pedro Henrique Gomes Bezerra";
        pedro.idade = 23;

        pessoa1.exibirMensagem();
        System.out.println(calc.multiplicaPorDois(20));
        corsa.exibeFichaTecnica();
        System.out.println(corsa.calculaIdadeDoCarro(2008));

        pedro.exibeInformacoes();
    }
}
