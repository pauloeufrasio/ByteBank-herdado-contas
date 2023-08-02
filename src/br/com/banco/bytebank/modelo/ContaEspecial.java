package br.com.banco.bytebank.modelo;

// Classe ContaEspecial que herda da classe Conta
public class ContaEspecial extends Conta {

    // Sobrescrita do método deposita da classe Conta para adicionar o valor ao saldo da conta especial
    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    // Construtor da classe ContaEspecial, que recebe os parâmetros agencia e numero, e chama o construtor da classe Conta usando super()
    public ContaEspecial(int agencia, int numero) {
        super(agencia, numero);
    }
}
