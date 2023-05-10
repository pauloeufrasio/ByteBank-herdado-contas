package br.com.banco.bytebank.modelo;

public class ContaPoupanca extends Conta {
    // Criando construtor especifico dessa classe atribuirdo parametro agencia e numero
    public ContaPoupanca(int agencia, int numero){ // Chamando classe mãe
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {

    }

    @Override
    public String toString() {
        return "ContaPoupança " + super.toString();
    }
}
