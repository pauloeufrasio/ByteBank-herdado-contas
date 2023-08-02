package br.com.banco.bytebank.modelo.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
    public static void main(String[] args) {

        int idade = 29;
        Integer idadeRef = Integer.valueOf(29); // Autoboxing - Convers�o de um tipo primitivo (int) para a classe wrapper (Integer).
        System.out.println(idadeRef.doubleValue()); // Obt�m o valor primitivo (int) do objeto Integer e imprime seu valor convertido para double.

        System.out.println(Integer.MAX_VALUE); // Imprime o valor m�ximo que um objeto Integer pode armazenar.
        System.out.println(Integer.MIN_VALUE); // Imprime o valor m�nimo que um objeto Integer pode armazenar.

        System.out.println(Integer.SIZE); // Imprime o tamanho em bits que um objeto Integer ocupa na mem�ria.
        System.out.println(Integer.BYTES); // Imprime o n�mero de bytes que um objeto Integer ocupa na mem�ria.

        int valor = idadeRef.intValue(); // Unboxing - Obt�m o valor primitivo (int) do objeto Integer e atribui � vari�vel 'valor'.

        String s = args[0]; // Obt�m o primeiro argumento da linha de comando e atribui � vari�vel 's'.
        int numero = Integer.parseInt(s); // Converte a string 's' para um valor inteiro usando o m�todo parseInt da classe Integer.
        System.out.println(numero); // Imprime o valor inteiro convertido.

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29); // Autoboxing - Adiciona o valor inteiro 29 � lista de Integer.

    }
}

