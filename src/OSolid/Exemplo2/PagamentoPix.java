package OSolid.Exemplo2;

public class PagamentoPix implements iSistemaPagamento {

    @Override
    public void realizarPagamento(double valor, String metodo) {
        if ("PIX".equalsIgnoreCase(metodo)) {
            System.out.println("Pagamento de R$" + valor + " realizado via PIX.");
        } else {
            System.out.println("Método de pagamento invalido!");
        }
    }
}

