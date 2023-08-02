package br.com.banco.bytebank.modelo.teste.util;

import br.com.banco.bytebank.modelo.Cliente;
import br.com.banco.bytebank.modelo.Conta;
import br.com.banco.bytebank.modelo.ContaCorrente;
import br.com.banco.bytebank.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TesteLambdas {

    public static void main(String[] args) {

        // Criação de contas e clientes
        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        // Criando uma lista do tipo Conta
        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        // Function Object = Um objeto que encapsula uma função
        // Ordenando a lista de contas por número de conta usando Lambdas
        lista.sort((Conta c1, Conta c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));

        // Criando outra função com Lambdas para ordenar a lista por nome do titular
        Comparator<Conta> camp = (Conta c1, Conta c2) -> {
            String nomeC1 = c1.getTitular().getNome();
            String nomeC2 = c2.getTitular().getNome();
            return nomeC1.compareTo(nomeC2);
        };

        lista.sort(camp);

        // Utilizando o método forEach para imprimir os dados das contas de forma mais enxuta
        lista.forEach(conta -> System.out.println(conta + ", " + conta.getTitular().getNome()));
    }
}

