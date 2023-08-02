package br.com.banco.bytebank.modelo.teste;

import br.com.banco.bytebank.modelo.Conta;
import br.com.banco.bytebank.modelo.ContaCorrente;
import br.com.banco.bytebank.modelo.SaldoInsuficienteException;

public class TesteSacar {
    public static void main(String[] args) {
        // Criando uma conta corrente com n�mero de ag�ncia 123 e n�mero da conta 456
        Conta conta = new ContaCorrente(123, 456);
        // Depositando 200 na conta
        conta.deposita(200);

        try {
            // Tentando sacar 155 da conta
            conta.saca(155);
        } catch (SaldoInsuficienteException ex) {
            // Se houver uma exce��o do tipo SaldoInsuficienteException, entra neste bloco e exibe a mensagem de erro
            System.out.println("EX: " + ex.getMessage());
        }

        // Exibindo o saldo atual da conta ap�s a tentativa de saque
        System.out.println(conta.getSaldo());
    }
}
