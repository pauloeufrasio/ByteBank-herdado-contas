package br.com.banco.bytebank.modelo.teste;

public class TesteArrayDePrimitivos {

    public static void main(String[] args) {

        // Criação de um array de inteiros com tamanho 5
        int idades[] = new int[5];

        // Loop para preencher o array com os valores i * i
        for (int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
        }

        // Loop para imprimir os valores do array
        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
    }
}
