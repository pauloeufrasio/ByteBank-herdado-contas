package br.com.banco.bytebank.modelo;

import java.io.Serializable;

// Classe ContaCorrente que herda da classe Conta e implementa as interfaces Tributavel e Serializable
public class ContaCorrente extends Conta implements Tributavel, Serializable {

    // Construtor da classe ContaCorrente, que recebe os parâmetros agencia e numero, e chama o construtor da classe Conta usando super()
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    // Sobrescrita do método saca da classe Conta, adicionando uma taxa de 0.2 ao valor do saque
    @Override
    public void saca(double valor) throws SaldoInsuficienteException {
        double valorSacar = valor + 0.2;
        super.saca(valor);
    }

    // Sobrescrita do método deposita da classe Conta, adicionando o valor ao saldo da conta
    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    // Implementação do método getValorImposto da interface Tributavel, que retorna o valor do imposto (0, pois é uma conta corrente)
    @Override
    public double getValorImposto() {
        return 0;
    }

    // Sobrescrita do método toString para exibir informações sobre a conta corrente
    @Override
    public String toString() {
        return "ContaCorrente, " + super.toString();
    }
}
