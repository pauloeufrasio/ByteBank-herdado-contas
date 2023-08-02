package br.com.banco.bytebank.modelo;

public class SeguroDeVida implements Tributavel {

    // Implementação do método getValorImposto() da interface Tributavel
    @Override
    public double getValorImposto() {
        return 42;
    }
}
