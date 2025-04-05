package OSolid.Exemplo2;

public class PagamentoCartaoDebito implements iSistemaPagamento {

    @Override
    public void realizarPagamento(double valor, String metodo) {
        if ("CARTAO_DEBITO".equalsIgnoreCase(metodo)) {
            System.out.println("Pagamento de R$" + valor + " realizado via Cartão de Débito.");
        } else {
            System.out.println("Método de pagamento invalido!");
        }
    }
}

