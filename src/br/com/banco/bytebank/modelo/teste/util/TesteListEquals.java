package br.com.banco.bytebank.modelo.teste.util;

import br.com.banco.bytebank.modelo.Conta;
import br.com.banco.bytebank.modelo.ContaCorrente;
import br.com.banco.bytebank.modelo.ContaPoupanca;

import java.util.ArrayList;

public class TesteListEquals {
    public static void main(String[] args) {

        // Criar lista de Conta que só aceita referencia do tipo Conta
        ArrayList <Conta>lista = new ArrayList<Conta>();// Generics

        Conta cc = new ContaCorrente(23,20);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22,22);
        lista.add(cc2);

        Conta cc3 = new ContaPoupanca(22,22);
        lista.add(cc3);

        // Criar variael pra saber se existe conta
        boolean existe = lista.contains(cc2);
        System.out.println("Ja existe " + existe);

        // jeito simplificado de accesar elementos com laço for
        for (Conta conta :lista){
            System.out.println(conta);

        }
    }
}
