package br.com.banco.bytebank.modelo.teste.util;

import br.com.banco.bytebank.modelo.Conta;
import br.com.banco.bytebank.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteListEquals {
    public static void main(String[] args) {
        // Criar lista de Conta que s� aceita referencia do tipo Conta
        ArrayList <Conta>lista = new ArrayList<Conta>();// Generics


        Conta cc = new ContaCorrente(22,11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(21,22);
        lista.add(cc2);

        // Criar variael pra saber se existe conta
        boolean existe = lista.contains(cc2);
        System.out.println("Ja existe " + existe);

        // jeito simplificado de accesar elementos com la�o for
        for (Conta conta :lista){
            System.out.println(conta);

        }
    }
}
