package br.com.banco.bytebank.modelo;

public class CalculadorDeImposto {
    private double totalImposto;

    // Método para registrar um objeto tributável e calcular seu imposto
    public void registra(Tributavel t) {
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    // Método para obter o total de imposto acumulado
    public double getTotalImposto() {
        return this.totalImposto;
    }
}

