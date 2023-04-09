package modelo;

import teste.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(int agencia, int numero){  // Criando construtor especifico dessa classe atribuirdo parametro agencia e numero
        super(agencia,numero); // chamando classe mae


    }
    // regra nova implementando no codigo

    @Override // Anotação na configuração
    public void saca(double valor) throws SaldoInsuficienteException {
        double valorSacar = valor + 0.2;
        super.saca(valor);
    }

    @Override
    public void deposita(double valor) {
       super.saldo += valor;
    }

    @Override
    public double getValorImposto() {
        return 0;
    }
}
