package br.com.banco.bytebank.modelo;

// Classe ContaPoupanca que herda da classe Conta
public class ContaPoupanca extends Conta {

    // Construtor da classe ContaPoupanca, que recebe os parâmetros agencia e numero, e chama o construtor da classe Conta usando super()
    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    // Sobrescrita do método deposita da classe Conta para deixá-lo vazio, pois a conta poupança não possui lógica de depósito específica
    @Override
    public void deposita(double valor) {
        // Nada a ser feito aqui, pois a conta poupança não permite depósitos normais
    }

    // Sobrescrita do método toString para retornar uma representação da conta poupança
    @Override
    public String toString() {
        return "ContaPoupança " + super.toString();
    }
}
