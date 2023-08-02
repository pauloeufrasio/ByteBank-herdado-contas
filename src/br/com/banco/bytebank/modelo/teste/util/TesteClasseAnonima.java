package br.com.banco.bytebank.modelo.teste.util;

import br.com.banco.bytebank.modelo.Cliente;
import br.com.banco.bytebank.modelo.Conta;
import br.com.banco.bytebank.modelo.ContaCorrente;
import br.com.banco.bytebank.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteClasseAnonima {
    public static void main(String[] args) {
        // Criação das contas e clientes
        Conta cc1 = new ContaCorrente(22, 33); // Conta corrente com agência 22 e número 33
        Cliente clienteCC1 = new Cliente(); // Cliente para a conta cc1
        clienteCC1.setNome("Nico"); // Definindo o nome do cliente para "Nico"
        cc1.setTitular(clienteCC1); // Associando o cliente à conta cc1
        cc1.deposita(333.0); // Depositando 333.0 na conta cc1

        Conta cc2 = new ContaPoupanca(22, 44); // Conta poupança com agência 22 e número 44
        Cliente clienteCC2 = new Cliente(); // Cliente para a conta cc2
        clienteCC2.setNome("Guilherme"); // Definindo o nome do cliente para "Guilherme"
        cc2.setTitular(clienteCC2); // Associando o cliente à conta cc2
        cc2.deposita(444.0); // Depositando 444.0 na conta cc2

        Conta cc3 = new ContaCorrente(22, 11); // Conta corrente com agência 22 e número 11
        Cliente clienteCC3 = new Cliente(); // Cliente para a conta cc3
        clienteCC3.setNome("Paulo"); // Definindo o nome do cliente para "Paulo"
        cc3.setTitular(clienteCC3); // Associando o cliente à conta cc3
        cc3.deposita(111.0); // Depositando 111.0 na conta cc3

        Conta cc4 = new ContaPoupanca(22, 22); // Conta poupança com agência 22 e número 22
        Cliente clienteCC4 = new Cliente(); // Cliente para a conta cc4
        clienteCC4.setNome("Ana"); // Definindo o nome do cliente para "Ana"
        cc4.setTitular(clienteCC4); // Associando o cliente à conta cc4
        cc4.deposita(222.0); // Depositando 222.0 na conta cc4

        // Criação de uma lista do tipo Conta
        List<Conta> lista = new ArrayList<>();
        lista.add(cc1); // Adicionando a conta cc1 à lista
        lista.add(cc2); // Adicionando a conta cc2 à lista
        lista.add(cc3); // Adicionando a conta cc3 à lista
        lista.add(cc4); // Adicionando a conta cc4 à lista

        // Laço for-each para imprimir os dados das contas
        for (Conta conta : lista) {
            System.out.println(conta + "," + conta.getTitular().getNome());
            // Imprime as informações da conta (toString()) e o nome do titular
        }

        // Function Object = Um objeto que encapsula uma função

        // Ordenando a lista de contas por número de conta usando uma classe anônima
        lista.sort(new Comparator<Conta>() {
            @Override
            public int compare(Conta c1, Conta c2) {
                return Integer.compare(c1.getNumero(), c2.getNumero());
            }
        });

        // Criando outra classe anônima para ordenar a lista por nome do titular
        Comparator<Conta> camp = new Comparator<Conta>() {
            @Override
            public int compare(Conta c1, Conta c2) {
                String nomeC1 = c1.getTitular().getNome();
                String nomeC2 = c2.getTitular().getNome();
                return nomeC1.compareTo(nomeC2);
            }
        };

        // Imprimindo a lista de contas após a ordenação por nome do titular
        for (Conta conta : lista) {
            System.out.println(conta + ", " + conta.getTitular().getNome());
            // Imprime as informações da conta (toString()) e o nome do titular
        }
    }
}

