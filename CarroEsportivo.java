public class CarroEsportivo extends Carro {
    private double velocidadeMaxima;

    public CarroEsportivo(String marca, String modelo, int ano, double velocidadeMaxima) {
        super(marca, modelo, ano);
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void acelerar() {
        System.out.println("Acelerando o carro esportivo!");
    }

    @Override
    public String toString() {
        return "Carro Esportivo:\n" +
               "Marca: " + getMarca() + "\n" +
               "Modelo: " + getModelo() + "\n" +
               "Ano: " + getAno() + "\n" +
               "Velocidade Máxima: " + velocidadeMaxima + " km/h";
    }

    public static void main(String[] args) {
        CarroEsportivo carroEsportivo = new CarroEsportivo("Ferrari", "458 Italia", 2023, 340.0);

        System.out.println(carroEsportivo.toString());

        carroEsportivo.acelerar();
    }
}
