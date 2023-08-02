package br.com.banco.bytebank.modelo.teste;

import br.com.banco.bytebank.modelo.Cliente;
import br.com.banco.bytebank.modelo.ContaCorrente;
import br.com.banco.bytebank.modelo.ContaPoupanca;

public class TesteObject {
    public static void main(String[] args) {

        // Criando objetos das classes ContaCorrente, ContaPoupanca e Cliente
        Object cc = new ContaCorrente(22, 33);
        Object cp = new ContaPoupanca(33, 22);
        Object cliente = new Cliente();

        // Imprimindo os objetos utilizando o método println sobrecarregado
        System.out.println(cc);
        System.out.println(cp);
    }

    // Sobrecarga do método println para diferentes tipos de parâmetros
    static void println() {}
    static void println(int a) {}
    static void println(boolean valor) {}
    static void println(Object referencia){}
}


