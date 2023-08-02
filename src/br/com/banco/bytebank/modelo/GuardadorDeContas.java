package br.com.banco.bytebank.modelo;

// Classe GuardadorDeContas, responsável por armazenar objetos do tipo Conta em um array
public class GuardadorDeContas {

    // Array que guarda as referências das contas
    private Conta[] referencias;

    // Variável auxiliar que indica a posição livre no array
    private int posicaoLivre;

    // Construtor da classe GuardadorDeContas, inicializa o array de referências com tamanho 10 e define a posição livre como 0
    public GuardadorDeContas() {
        this.referencias = new Conta[10];
        this.posicaoLivre = 0;
    }

    // Método que adiciona uma referência de Conta ao array e atualiza a posição livre
    public void adiciona(Conta ref) {
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }

    // Método que retorna a quantidade de elementos (referências) armazenados no array
    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    // Método que retorna a referência de Conta armazenada na posição especificada do array
    public Conta getReferencia(int pos) {
        return this.referencias[pos];
    }
}


















