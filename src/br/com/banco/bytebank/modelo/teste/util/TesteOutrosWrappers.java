package br.com.banco.bytebank.modelo.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
    public static void main(String[] args) {

        int idade = 29;
        Integer idadeRef = Integer.valueOf(29); // Autoboxing - Conversão de um tipo primitivo (int) para a classe wrapper (Integer).
        System.out.println(idadeRef.intValue()); // Unboxing - Conversão de um objeto wrapper (Integer) para o tipo primitivo (int).

        Double dRef = Double.valueOf(3.2); // Autoboxing - Conversão de um tipo primitivo (double) para a classe wrapper (Double).
        System.out.println(dRef.doubleValue()); // Unboxing - Conversão de um objeto wrapper (Double) para o tipo primitivo (double).

        Boolean dref = Boolean.TRUE; // Autoboxing - Conversão de um tipo primitivo (boolean) para a classe wrapper (Boolean).
        System.out.println(dref.booleanValue()); // Unboxing - Conversão de um objeto wrapper (Boolean) para o tipo primitivo (boolean).

        // Lista do tipo mais genérico, que pode armazenar qualquer subclasse de Number
        List<Number> lista = new ArrayList<>();
        lista.add(10); // Autoboxing - O valor 10 (int) é automaticamente convertido para o objeto Integer e adicionado à lista.
        lista.add(32.6); // Autoboxing - O valor 32.6 (double) é automaticamente convertido para o objeto Double e adicionado à lista.
        lista.add(25.6f); // Autoboxing - O valor 25.6f (float) é automaticamente convertido para o objeto Float e adicionado à lista.

    }
}

