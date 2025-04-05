package OSolid.Exemplo2;

public class PagamentoCartaoCredito implements iSistemaPagamento {

    @Override
    public void realizarPagamento(double valor, String metodo) {
        if ("CARTAO_CREDITO".equalsIgnoreCase(metodo)) {
            System.out.println("Pagamento de R$" + valor + " realizado via Cartão de Crédito. ");
        } else {
            System.out.println("Método de pagamento invalido!");
        }
    }
}
