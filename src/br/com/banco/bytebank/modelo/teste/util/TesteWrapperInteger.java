package br.com.banco.bytebank.modelo.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
    public static void main(String[] args) {

        int idade = 29;
        Integer idadeRef = Integer.valueOf(29); // Autoboxing - Conversão de um tipo primitivo (int) para a classe wrapper (Integer).
        System.out.println(idadeRef.doubleValue()); // Obtém o valor primitivo (int) do objeto Integer e imprime seu valor convertido para double.

        System.out.println(Integer.MAX_VALUE); // Imprime o valor máximo que um objeto Integer pode armazenar.
        System.out.println(Integer.MIN_VALUE); // Imprime o valor mínimo que um objeto Integer pode armazenar.

        System.out.println(Integer.SIZE); // Imprime o tamanho em bits que um objeto Integer ocupa na memória.
        System.out.println(Integer.BYTES); // Imprime o número de bytes que um objeto Integer ocupa na memória.

        int valor = idadeRef.intValue(); // Unboxing - Obtém o valor primitivo (int) do objeto Integer e atribui à variável 'valor'.

        String s = args[0]; // Obtém o primeiro argumento da linha de comando e atribui à variável 's'.
        int numero = Integer.parseInt(s); // Converte a string 's' para um valor inteiro usando o método parseInt da classe Integer.
        System.out.println(numero); // Imprime o valor inteiro convertido.

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29); // Autoboxing - Adiciona o valor inteiro 29 à lista de Integer.

    }
}

