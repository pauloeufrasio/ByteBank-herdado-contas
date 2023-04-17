package br.com.banco.bytebank.modelo.teste;

import br.com.banco.bytebank.modelo.ContaCorrente;

public class TesteArrayReferencias {
    public static void main(String[] args) {

        // criar objetos que guarda 5 referencias de contas, obs: nenhuma conta foi criado e sim um array que guarda 5 referencia
        ContaCorrente[] contas = new ContaCorrente[5];
        // criar conta corrente
        ContaCorrente cc1 = new ContaCorrente(22,11);
        // acessar contas na posição 0
        contas[0] = cc1;
        // Criar outro objeto
        ContaCorrente cc2 = new ContaCorrente(22,44);
        // acessano noca conta criada na posição 1
        contas[1] = cc2;
        // imprimir xerox pelo array e buscando numero
        System.out.println(contas[0].getNumero());




    }
}
