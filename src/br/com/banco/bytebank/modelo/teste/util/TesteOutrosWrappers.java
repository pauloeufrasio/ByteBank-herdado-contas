package br.com.banco.bytebank.modelo.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
    public static void main(String[] args) {

        int idade = 29;
        Integer idadeRef = Integer.valueOf(29); // Autoboxing - Convers�o de um tipo primitivo (int) para a classe wrapper (Integer).
        System.out.println(idadeRef.intValue()); // Unboxing - Convers�o de um objeto wrapper (Integer) para o tipo primitivo (int).

        Double dRef = Double.valueOf(3.2); // Autoboxing - Convers�o de um tipo primitivo (double) para a classe wrapper (Double).
        System.out.println(dRef.doubleValue()); // Unboxing - Convers�o de um objeto wrapper (Double) para o tipo primitivo (double).

        Boolean dref = Boolean.TRUE; // Autoboxing - Convers�o de um tipo primitivo (boolean) para a classe wrapper (Boolean).
        System.out.println(dref.booleanValue()); // Unboxing - Convers�o de um objeto wrapper (Boolean) para o tipo primitivo (boolean).

        // Lista do tipo mais gen�rico, que pode armazenar qualquer subclasse de Number
        List<Number> lista = new ArrayList<>();
        lista.add(10); // Autoboxing - O valor 10 (int) � automaticamente convertido para o objeto Integer e adicionado � lista.
        lista.add(32.6); // Autoboxing - O valor 32.6 (double) � automaticamente convertido para o objeto Double e adicionado � lista.
        lista.add(25.6f); // Autoboxing - O valor 25.6f (float) � automaticamente convertido para o objeto Float e adicionado � lista.

    }
}

