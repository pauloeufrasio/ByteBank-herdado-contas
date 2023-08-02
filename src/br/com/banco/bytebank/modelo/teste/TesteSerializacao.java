package br.com.banco.bytebank.modelo.teste;

import br.com.banco.bytebank.modelo.Cliente;
import br.com.banco.bytebank.modelo.ContaCorrente;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException {

        // Criando um objeto Cliente
        Cliente cliente = new Cliente();
        cliente.setNome("Paulo");
        cliente.setProfissao("Dev");
        cliente.setCpf("123456789");

        // Criando uma conta corrente
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.setTitular(cliente);
        cc.deposita(222.3);

        // Gravando o objeto ContaCorrente no arquivo cc.bin
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();
    }
}

