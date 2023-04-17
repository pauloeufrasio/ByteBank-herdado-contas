package br.com.banco.bytebank.modelo.teste;

public class teste {

    // Array[]
    public static void main(String[] args) {

        // Cria Array e atribuir 5 idades
        int idades[] = new int[5];// inicializa o array com os valores padroes

        // inicializar array colocar na posição desejada e atribuir um valor pra cada posição
        //idades[0] = 29;
        //idades[1] = 39;
        //idades[2] = 49;
        //idades[3] = 59;
        //idades[4] = 69;

        // acessar posição atraves dos numeros da idade
        //int idade1 = idades[4];

        //System.out.println(idade1);

        // Iniciaizar array com laço for
        for (int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
        }
        // imprimir array com laço for
        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);

        }

    }
}
