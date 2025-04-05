package SSolid.Exemplo2;

public class Main {
    public static void main(String[] args) {
        LeitorDeDados leitor = new LeitorDeDados();
        String idEncomenda = leitor.lerIdEncomenda();
        double peso = leitor.lerPeso();

        CalculadoraDeFrete calculadora = new CalculadoraDeFrete();
        double valorFrete = calculadora.calcularFrete(peso);
        calculadora.mostrarValorFrete(valorFrete);

        SalvarDados salvarDados = new SalvarDados();
        salvarDados.salvarEmArquivo(idEncomenda, valorFrete);

        leitor.fecharScanner();
    }
}
