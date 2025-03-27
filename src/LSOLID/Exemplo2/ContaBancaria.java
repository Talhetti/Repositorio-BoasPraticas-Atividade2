package LSOLID.Exemplo2;

public class ContaBancaria {
    protected double saldo;

    public void depositar(double valor) {
        if(valor >= 0){
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if(valor >= 0 && saldo >= valor){
            saldo -= valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}


