package br.com.banco.bytebank.modelo.teste;
import br.com.banco.bytebank.modelo.CalculadorDeImposto;
import br.com.banco.bytebank.modelo.SeguroDeVida;
import br.com.banco.bytebank.modelo.ContaCorrente;


public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente paulo = new ContaCorrente(123,456);
        paulo.deposita(100);

        SeguroDeVida sdv = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registra(paulo);
        calc.registra(sdv);

        System.out.println(calc.getTotalImposto());
    }
}
