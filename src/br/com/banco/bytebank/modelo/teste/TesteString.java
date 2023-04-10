package br.com.banco.bytebank.modelo.teste;

public class TesteString {
    public static void main(String[] args) {
        // String e uma classe
        // uma String nao pode ser auterado
        String nome =" Alura "; // object literal

        // pra alterar tem que criar uma nova String utilizando replace
        String outra = nome.replace("A", "a");

        System.out.println(outra);
    }

}
