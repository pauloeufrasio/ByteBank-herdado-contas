package br.com.banco.bytebank.modelo;

public class GuardadorDeContas {

    // Criar Array pra guardar contas
    private Conta[] referencias;
    // criando variavel auxiliar que mostra posição disponiveis
    private int posicaoLivre;

    // Construtor de guardador de contas
    public GuardadorDeContas(){
        this.referencias = new Conta[10];
        this.posicaoLivre = 0;
    }
    // criar metodo que guarda contas registrada
    public void adiciona(Conta ref){
        this.referencias[this.posicaoLivre]= ref;
        this.posicaoLivre++;

    }

    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    public Conta getReferencia(int pos) {
        return this.referencias[pos];
    }
}


















