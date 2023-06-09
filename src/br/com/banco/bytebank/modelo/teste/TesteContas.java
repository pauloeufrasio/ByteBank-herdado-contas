package br.com.banco.bytebank.modelo.teste;
import br.com.banco.bytebank.modelo.ContaCorrente;
import br.com.banco.bytebank.modelo.ContaEspecial;
import br.com.banco.bytebank.modelo.ContaPoupanca;
import br.com.banco.bytebank.modelo.SaldoInsuficienteException;
// java.lang.String
public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException {

        // Criando Conta cc
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.0);
        // atribuir valor atrave do metodo deposita herdado da classe mae
        ContaPoupanca cp = new ContaPoupanca(123,456);
        cp.deposita(200);
        // Resultado do valor na tela
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
        // atribuir valor pelo metodo transfere herdado da classe mae
        cc.transfere(10.0,cp);
        System.out.println(cp.getSaldo());
        System.out.println(cc.getSaldo());
        ContaEspecial es = new ContaEspecial(555,874);
        es.deposita(200);
        System.out.println(es.getSaldo());


    }
}
