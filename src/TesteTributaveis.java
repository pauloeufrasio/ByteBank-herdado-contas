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
