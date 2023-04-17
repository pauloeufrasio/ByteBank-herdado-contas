package br.com.banco.bytebank.modelo;

import java.io.Serializable;

/**
 *  Classe que representa um cliente no ByteBank
 *
 *  @author paulo henrique
 */

public class Cliente implements Serializable {

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
    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    private String nome;
    private String cpf;
    private String profissao;


}
