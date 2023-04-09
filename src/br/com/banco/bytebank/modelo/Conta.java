package br.com.banco.bytebank.modelo;

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

    // Criando construtor e passando parametro agencia e numero como argumento ou seja toda vez que instanciar a classe bytebank.bytebank.banco.modelo.bytebank.banco.modelo.Conta ter� que ter agencia e numero
    public Conta(int agencia, int numero) {
        // Criando um contador de contas total++
        total++;
        System.out.println("Total de contas � " + total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println(" Estou criando uma conta " + agencia);

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
            System.out.println(" N�o pode valor menor ou igual a zero ");
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    // Criando condi��o N�o pode valor menor ou igual a zero
    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println(" N�o pode valor menor ou igual a zero ");
        }
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    private int numero;
    String titular;

    // Criando o metodo deposita que recebe (valor) como parametro e retorna saldo o que ta nele mesmo mais o (valor)
    public abstract void deposita(double valor);

    // Criando o metodo saca que tambem recebe valor como parametro obs: A variavel (valor) � diferente da variavel do metodo deposita.
    public void saca(double valor) throws SaldoInsuficienteException {
        // Problema
        if (this.saldo < valor) {
            // Lan�ar exce��o retornando uma mensagem da exce��o
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + " Valor: " + valor);
        }
        // Se for maior que o valor
        this.saldo -= valor;
        System.out.println("Transa��o concluida o saldo total do valor � " + this.saldo);
    }

    // Criando metodo transfere recebendo valor como parametro e conta destino
    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);

    }
}
