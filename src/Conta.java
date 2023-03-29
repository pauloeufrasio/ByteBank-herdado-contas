public class Conta {
    // Declarando os atributos da classe conta Privados
    private double saldo;
    private int agencia;
    // Criando atributo static obs: static é um metodo da classe e metodos static pra invocar voce chama atraves da classe
    private static int total=0;

        public Conta(){

        }

    public static void setTotal(int total) {
        Conta.total = total;
    }

    public static int getTotal() {
        return total;
    }
    // Criando construtor e passando parametro agencia e numero como argumento ou seja toda vez que instanciar a classe Conta terá que ter agencia e numero
    public Conta(int agencia, int numero){
        // Criando um contador de contas total++
        total++;
        System.out.println("Total de contas é "+total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println(" Estou criando uma conta " + agencia);

    }
    // Criando get quando o valor so retorna
    public double getSaldo() {
        return saldo;
    }
    // Criando set quando for edita alguma informação
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    // Criando condição Não pode valor menor ou igual a zero
    public void setAgencia(int agencia) {
        if (agencia <= 0 ) {
            System.out.println(" Não pode valor menor ou igual a zero ");
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }
    // Criando condição Não pode valor menor ou igual a zero
    public void setNumero(int numero) {
        if (numero <= 0 ) {
            System.out.println(" Não pode valor menor ou igual a zero ");
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
    public void deposita(double valor){
        this.saldo += valor;
    }
    // Criando o metodo saca que tambem recebe valor como parametro obs: A variavel (valor) é diferente da variavel do metodo deposita.
    public boolean saca(double valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println(" Voce retirou $" + valor + " e o valor atual é $" +this.saldo);
            return true;
        }
        else {
            System.out.println("Voce nao tem saldo suficiente pra completar essa transação seu saldo é "+ this.saldo);
            return false;
        }
    }
    // Criando metodo transfere recebendo valor como parametro e conta destino
    public boolean transfere (double valor, Conta destino){
        if (this.saldo >= valor){
            this.saldo -= valor;
            // inserindo variavel (valor) dentro da conta destino
            destino.deposita(valor);
            System.out.println("Transferencia realizada com sucesso seu saldo é $" +this.saldo+ " e o valor transferido foi de $" +valor);
            return true;
        }
        System.out.println("Voce nao tem saldo suficiente pra completar essa transação seu saldo é de " +this.saldo);
        return false;
    }

}
