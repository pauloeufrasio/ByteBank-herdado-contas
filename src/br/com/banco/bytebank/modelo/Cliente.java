package br.com.banco.bytebank.modelo;

/**
 *  Classe que representa um cliente no ByteBank
 *
 *  @author paulo henrique
 */

public class Cliente {
    // Criando get quando o valor so retorna
    public String getNome() {
        return nome;
    }
    // Criando set quando for edita alguma informação
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissão() {
        return profissão;
    }

    public void setProfissão(String profissão) {
        this.profissão = profissão;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    private String nome;
    private String cpf;
    private String profissão;
    // Criando conta do tipo classe
    Cliente titular;
}
