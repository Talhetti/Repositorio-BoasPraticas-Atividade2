package SSolid.Exemplo2;

import java.util.Scanner;

public class LeitorDeDados {
    Scanner sc = new Scanner(System.in);

    //ler o id da encomenda
    public String lerIdEncomenda() {
        System.out.println("Digite o ID da encomenda: ");
        return sc.nextLine();
    }

    //ler o peso da encomenda
    public double lerPeso() {
        System.out.println("Digite o peso (em kg): ");
        return sc.nextDouble();
    }

    //fechar o Scanner usando método
    public void fecharScanner() {
        sc.close();
    }
}
