package OSolid.Exemplo2;

public interface iSistemaPagamento {
    //objetivo é usar interface para implementar o principio open/closed
    void realizarPagamento(double valor, String metodo);
}

