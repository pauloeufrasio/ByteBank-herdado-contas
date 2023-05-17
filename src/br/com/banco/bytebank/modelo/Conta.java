package br.com.banco.bytebank.modelo;

/**
 * Classe que representa a conta.
 *
 * @author Paulo Henrique.
 */

// Definição public: visivel em todos os lugares
public abstract class Conta {
    // Declarando os atributos da classe conta Privados
    protected double saldo;
    private int agencia;
    // Criando atributo static obs: static � um metodo da classe e metodos static pra invocar voce chama atraves da classe
    private static int total = 0;

    public Conta() {

    }

    public static void setTotal(int total) {
        Conta.total = total;
    }

    public static int getTotal() {
        return total;
    }

    /**
     * Construtor para inicializar o objeto Conta a partir da agencia e numero
     *
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero) {
        // Criando um contador de contas total++
        total++;
        //System.out.println("Total de contas � " + total);
        this.agencia = agencia;
        this.numero = numero;
        //System.out.println(" Estou criando uma conta " + agencia);

    }

    // Criando get quando o valor so retorna
    public double getSaldo() {
        return saldo;
    }

    // Criando set quando for edita alguma informa��o
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    // Criando condi��o N�o pode valor menor ou igual a zero
    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println(" Nao pode valor menor ou igual a zero ");
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    /**
     * Criando condição Nao pode valor menor ou igual a zero
     *
     * @param numero
     */
    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println(" Nao pode valor menor ou igual a zero ");
        }
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    private int numero;
    private Cliente titular;

    // Criando o metodo deposita que recebe (valor) como parametro e retorna saldo o que ta nele mesmo mais o (valor)
    public abstract void deposita(double valor);

    /**
     * Valor precisa ser maior que o saldo
     * Criando o metodo saca que tambem recebe valor como parametro obs: A variavel (valor) � diferente da variavel do metodo deposita.
     *
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) throws SaldoInsuficienteException {
        // Problema
        if (this.saldo < valor) {
            // Lan�ar exce��o retornando uma mensagem da exce��o
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + " Valor: " + valor);
        }
        // Se for maior que o valor
        this.saldo -= valor;
        System.out.println("Transacao concluida o saldo total do valor é " + this.saldo);
    }

    /**
     * Tem exceção Criada SaldoInsuficienteException
     * Criando metodo transfere recebendo valor como parametro e conta destino
     *
     * @param valor
     * @param destino
     * @throws SaldoInsuficienteException
     */
    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);

    }

    // Criar metodo pra comparar se conta e igual a outra conta
    @Override
    public boolean equals(Object ref) {
        // Cast
        Conta outra = (Conta) ref;

        if (this.agencia != outra.agencia) {
            return false;
        }
        if (this.numero != outra.numero) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Saldo: " + this.saldo;
    }

}
