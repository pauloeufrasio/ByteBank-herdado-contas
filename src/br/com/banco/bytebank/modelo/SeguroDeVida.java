package br.com.banco.bytebank.modelo;

public class SeguroDeVida implements Tributavel {

    // Implementa��o do m�todo getValorImposto() da interface Tributavel
    @Override
    public double getValorImposto() {
        return 42;
    }
}
