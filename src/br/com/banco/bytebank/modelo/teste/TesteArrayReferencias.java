package br.com.banco.bytebank.modelo.teste;

import br.com.banco.bytebank.modelo.Cliente;
import br.com.banco.bytebank.modelo.Conta;
import br.com.banco.bytebank.modelo.ContaCorrente;
import br.com.banco.bytebank.modelo.ContaPoupanca;

public class TesteArrayReferencias {
    public static void main(String[] args) {

        // criar objeto  que guarda 5 referencias de contas, obs: nenhuma conta foi criado e sim um array que guarda 5 referencia
        Conta[] referencias = new Conta[5];

        // criar conta poupança
        ContaCorrente cc1 = new ContaCorrente(22,11);
        // acessar contas na posição 0
        referencias[0] = cc1;

        // Criar outro objeto Conta Corrente
        ContaPoupanca cc2 = new ContaPoupanca(22,44);
        // acessano noca conta criada na posição 1
        referencias[1] = cc2;

        // Criar cliente
        Cliente cliente = new Cliente();
        //referencias[2] = cliente;

        // Cast de referencia transformando refencia do tipo mais generico pra um tipo mais especifico
        ContaPoupanca ref = (ContaPoupanca) referencias[1]; // type cast
        // imprimir xerox pelo array e buscando numero
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());




    }
}
