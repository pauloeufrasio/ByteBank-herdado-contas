package teste;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.SaldoInsuficienteException;

public class TesteSacar {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123,456);
        conta.deposita(200);

        try {
            conta.saca(155);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("EX: " + ex.getMessage());
        }
        System.out.println(conta.getSaldo());

    }
}
