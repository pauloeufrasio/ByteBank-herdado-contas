package br.com.banco.bytebank.modelo;

import br.com.banco.bytebank.modelo.Conta;

public class ContaEspecial extends Conta {
    @Override
    public void deposita(double valor) {
        super.saldo += valor;

    }
    public ContaEspecial(int agencia, int numero){
        super(agencia, numero);
    }
}
