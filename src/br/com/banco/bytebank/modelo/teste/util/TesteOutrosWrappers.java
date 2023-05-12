package br.com.banco.bytebank.modelo.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
    public static void main(String[] args) {

        int idade = 29;
        Integer idadeRef = Integer.valueOf(29); // Autoboxing
        System.out.println(idadeRef.intValue());// Unboxing

        Double dRef = Double.valueOf(3.2);// autoboxing
        System.out.println(dRef.doubleValue()); // unboxing

        Boolean dref = Boolean.TRUE; // autoboxing
        System.out.println(dref.booleanValue()); // unboxing

        // Lista do tipo mais generico
        List<Number> lista = new ArrayList<>();
        lista.add(10);
        lista.add(32.6);
        lista.add(25.6f);


    }
}
