package OSolid.Exemplo2;

public class PagamentoBoleto implements iSistemaPagamento {

    @Override
    public void realizarPagamento(double valor, String metodo) {
        if ("BOLETO".equalsIgnoreCase(metodo)) {
            System.out.println("Pagamento de R$" + valor + " realizado via BOLETO.");
        } else {
            System.out.println("Método de pagamento invalido!");
        }
    }
}
