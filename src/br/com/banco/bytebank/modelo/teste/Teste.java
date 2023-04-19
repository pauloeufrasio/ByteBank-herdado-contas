package br.com.banco.bytebank.modelo.teste;

import br.com.banco.bytebank.modelo.Conta;
import br.com.banco.bytebank.modelo.ContaCorrente;
import br.com.banco.bytebank.modelo.GuardadorDeContas;

public class Teste {
    public static void main(String[] args) {

        GuardadorDeContas guardadorDeContas = new GuardadorDeContas();
        // criando conta e guardando pelo metodo adiciona
        Conta cc = new ContaCorrente(22,11);
        guardadorDeContas.adiciona(cc);

        Conta cc2 = new ContaCorrente(21,22);
        guardadorDeContas.adiciona(cc2);
        // criar variavel para saber quantos elementos o guardador de contas registrou
        int tamanho = guardadorDeContas.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardadorDeContas.getReferencia(1);
        System.out.println(ref.getNumero());

    }
}
