//Unchecked: Quando estende a classe RunTimeException e nao sao verificado pelo compilador
//public class SaldoInsuficienteException extends RuntimeException{
// Checked: quando estende direto da classe excecao e é verificado pelo compilador
public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(String msg){
        super(msg);
    }
}
