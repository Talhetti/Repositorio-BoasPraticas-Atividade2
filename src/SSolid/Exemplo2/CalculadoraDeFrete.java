package SSolid.Exemplo2;

public class CalculadoraDeFrete {
    //calcular o valor do frete
    public double calcularFrete(double peso) {
        return peso * 10;
    }

    //mostrar o valor do frete
    public void mostrarValorFrete(double valorFrete) {
        System.out.println("Valor do frete calculado: " + valorFrete);
    }
}

