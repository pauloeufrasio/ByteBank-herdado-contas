package br.com.banco.bytebank.modelo;

import java.io.Serializable;

/**
 *  Classe que representa um cliente no ByteBank
 *
 *  @author paulo henrique
 */

// Classe Cliente
public class Cliente implements Serializable {

    // Atributos da classe Cliente
    private String nome;
    private String cpf;
    private String profissao;

    // Método getter para o atributo "nome": retorna o valor do atributo "nome"
    public String getNome() {
        return nome;
    }

    // Método setter para o atributo "nome": atualiza o valor do atributo "nome" com o valor passado como parâmetro
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para o atributo "cpf": retorna o valor do atributo "cpf"
    public String getCpf() {
        return cpf;
    }

    // Método setter para o atributo "cpf": atualiza o valor do atributo "cpf" com o valor passado como parâmetro
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Método getter para o atributo "profissao": retorna o valor do atributo "profissao"
    public String getProfissao() {
        return profissao;
    }

    // Método setter para o atributo "profissao": atualiza o valor do atributo "profissao" com o valor passado como parâmetro
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
