public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 3);

        System.out.println("Área do retângulo: " + retangulo.calcularArea());

        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
    }
}
