package br.com.banco.bytebank.modelo.teste;

import br.com.banco.bytebank.modelo.ContaCorrente;

import java.io.*;

public class TesteDeSerializacao {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        // Gravando arquivo pra pasta cc.bin
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));

        // Leitura do objeto serializado
        ContaCorrente cc = (ContaCorrente) ois.readObject();

        // Fechando o stream de leitura
        ois.close();

        // Impressão dos dados do objeto lido
        System.out.println(cc.getSaldo());
        System.out.println(cc.getTitular().getNome());
        System.out.println(cc.getSaldo());
    }
}
