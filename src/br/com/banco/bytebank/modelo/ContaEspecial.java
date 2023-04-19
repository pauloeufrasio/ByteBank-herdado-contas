package br.com.banco.bytebank.modelo;

public class ContaEspecial extends Conta {
    @Override
    public void deposita(double valor) {
        super.saldo += valor;

    }
    public ContaEspecial(int agencia, int numero){
        super(agencia, numero);
    }
}
