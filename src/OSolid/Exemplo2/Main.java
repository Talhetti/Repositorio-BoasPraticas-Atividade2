package OSolid.Exemplo2;

public class Main {
    public static void main(String[] args) {
        PagamentoCartaoDebito pagamentoCartao = new PagamentoCartaoDebito();
        pagamentoCartao.realizarPagamento(100.00, "CARTAO_DEBITO");

        PagamentoCartaoCredito pagamentoCartaoCredito = new PagamentoCartaoCredito();
        pagamentoCartaoCredito.realizarPagamento(150.00, "CARTAO_CREDITO");

        PagamentoPix pagamentoPix = new PagamentoPix();
        pagamentoPix.realizarPagamento(100.00, "PIX");

        PagamentoBoleto pagamentoBoleto = new PagamentoBoleto();
        pagamentoBoleto.realizarPagamento(120.00, "BOLETO");
    }
}

