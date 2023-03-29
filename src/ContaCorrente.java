public class ContaCorrente extends Conta  {
    public ContaCorrente(int agencia, int numero){  // Criando construtor especifico dessa classe atribuirdo parametro agencia e numero
        super(agencia,numero); // chamando classe mae


    }
    // regra nova implementando no codigo

    @Override // Anotação na configuração
    public boolean saca(double valor) {
        double valorSacar = valor + 0.2;
        return super.saca(valor);
    }
}
