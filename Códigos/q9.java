public class SituacaoFinanceira {
    private double valorCreditos;
    private double valorDebitos;

    public SituacaoFinanceira(double valorCreditos, double valorDebitos) {
        this.valorCreditos = valorCreditos;
        this.valorDebitos = valorDebitos;
    }

    public double calcularSaldo() {
        return valorCreditos - valorDebitos;
    }

    public static void main(String[] args) {
        SituacaoFinanceira situacao = new SituacaoFinanceira(5000.0, 2300.0);

        System.out.println("Saldo da situação financeira: " + situacao.calcularSaldo());
    }
}

