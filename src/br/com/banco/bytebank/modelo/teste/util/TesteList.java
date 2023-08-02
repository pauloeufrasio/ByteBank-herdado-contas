package br.com.banco.bytebank.modelo.teste.util;

import br.com.banco.bytebank.modelo.Conta;
import br.com.banco.bytebank.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteList {
    public static void main(String[] args) {
        // Criar uma lista de Conta que só aceita referências do tipo Conta
        List<Conta> lista = new ArrayList<Conta>(); // Uso de Generics

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(21, 22);
        lista.add(cc2);

        System.out.println("Tamanho: " + lista.size());

        // Criar cast de uma referência genérica para uma referência específica
        Conta ref = (Conta) lista.get(0);
        System.out.println(ref.getNumero());

        // Remover elemento da lista
        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(22, 311);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(22, 422);
        lista.add(cc4);

        // Criar laço para acessar cada elemento
        for (int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }
        System.out.println("--------------");

        // Jeito simplificado de acessar elementos com laço for-each
        for (Conta conta : lista) {
            System.out.println(conta);
        }
    }
}
