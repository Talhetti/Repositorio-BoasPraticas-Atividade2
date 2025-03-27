package LSOLID.Exemplo2;

public class ContaPoupanca extends ContaBancaria {

    @Override
    public void sacar(double valor) {
        if(valor >= 0 && saldo >= valor){
            saldo -= valor;
        }
    }

    @Override
    public void depositar(double valor) {
        if(valor >= 0){
            saldo += valor;
        }
    }

    //@Override
    //public void sacar(double valor) {
    //    throw new UnsupportedOperationException("Resgate não é permitido direto.");
    //}
}
