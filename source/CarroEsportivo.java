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
        System.out.println("Acelerando o carro esportivo.");
    }

    @Override
    public String toString() {
        return "Carro Esportivo:\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nAno: " + getAno() +
                "\nVelocidade Máxima: " + velocidadeMaxima;
    }
}
