package br.com.banco.bytebank.modelo.teste.util;

import br.com.banco.bytebank.modelo.Conta;
import br.com.banco.bytebank.modelo.ContaCorrente;
import br.com.banco.bytebank.modelo.ContaPoupanca;

import java.util.ArrayList;

public class TesteListEquals {
    public static void main(String[] args) {

        // Criar uma lista de Conta que só aceita referência do tipo Conta
        ArrayList<Conta> lista = new ArrayList<Conta>(); // Uso de Generics

        Conta cc = new ContaCorrente(23, 20);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        Conta cc3 = new ContaPoupanca(22, 22);
        lista.add(cc3);

        // Verificar se existe uma conta igual a cc2 na lista
        boolean existe = lista.contains(cc2);
        System.out.println("Já existe? " + existe);

        // Jeito simplificado de acessar elementos com laço for-each
        for (Conta conta : lista) {
            System.out.println(conta);
        }
    }
}

