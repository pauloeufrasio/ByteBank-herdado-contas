package br.com.banco.bytebank.modelo;

// Classe GuardadorDeContas, respons�vel por armazenar objetos do tipo Conta em um array
public class GuardadorDeContas {

    // Array que guarda as refer�ncias das contas
    private Conta[] referencias;

    // Vari�vel auxiliar que indica a posi��o livre no array
    private int posicaoLivre;

    // Construtor da classe GuardadorDeContas, inicializa o array de refer�ncias com tamanho 10 e define a posi��o livre como 0
    public GuardadorDeContas() {
        this.referencias = new Conta[10];
        this.posicaoLivre = 0;
    }

    // M�todo que adiciona uma refer�ncia de Conta ao array e atualiza a posi��o livre
    public void adiciona(Conta ref) {
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }

    // M�todo que retorna a quantidade de elementos (refer�ncias) armazenados no array
    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    // M�todo que retorna a refer�ncia de Conta armazenada na posi��o especificada do array
    public Conta getReferencia(int pos) {
        return this.referencias[pos];
    }
}


















