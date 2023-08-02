package br.com.banco.bytebank.modelo;

public class CalculadorDeImposto {
    private double totalImposto;

    // M�todo para registrar um objeto tribut�vel e calcular seu imposto
    public void registra(Tributavel t) {
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    // M�todo para obter o total de imposto acumulado
    public double getTotalImposto() {
        return this.totalImposto;
    }
}

