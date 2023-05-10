package br.com.banco.bytebank.modelo.teste.util;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {

        int[] idades = new int[5];
        String[] nomes = new String[5];

        // idade é um tipo primitivo
        int idade = 29; // Integer
        // int é um primitivo, não uma referência. Assim, o certo é utilizarmos o Integer
        Integer idadeRef = new Integer(29);
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(idade);



    }
}
