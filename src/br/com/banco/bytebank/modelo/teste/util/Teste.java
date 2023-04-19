package br.com.banco.bytebank.modelo.teste.util;

import br.com.banco.bytebank.modelo.Conta;
import br.com.banco.bytebank.modelo.ContaCorrente;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        // Criar lista de Conta que só aceita referencia do tipo Conta
        ArrayList <Conta>lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22,11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(21,22);
        lista.add(cc2);

        System.out.println("Tamanho: " +lista.size());
        // Criar cast de uma referencia generica pra uma referencia especifica
        Conta  ref = (Conta) lista.get(0);
        System.out.println(ref.getNumero());

        // remover elemento da  lista
        lista.remove(0);
        System.out.println("tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(22,311);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(22,422);
        lista.add(cc4);

        // Criar laço para accesar cada elemento
        for (int i = 0; i < lista.size(); i++){
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }
        System.out.println("--------------");
        // jeito simplificado de accesar elementos com laço for
        for (Object oRef :lista){
            System.out.println(oRef);

        }
    }
}
