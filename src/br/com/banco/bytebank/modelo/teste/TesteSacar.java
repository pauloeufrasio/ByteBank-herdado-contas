package br.com.banco.bytebank.modelo.teste;

import br.com.banco.bytebank.modelo.Conta;
import br.com.banco.bytebank.modelo.ContaCorrente;
import br.com.banco.bytebank.modelo.SaldoInsuficienteException;

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
