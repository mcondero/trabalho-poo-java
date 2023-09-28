public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double quilometragem;
    private Motor motor;

    public Carro(String marca, String modelo, int ano, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public void rodar(double distancia) {
        if (distancia > 0) {
            quilometragem += distancia;
        } else {
            System.out.println("A distância percorrida deve ser maior que zero.");
        }
    }

    public void ligarCarro() {
        System.out.println("Carro ligado.");
        motor.ligar();
    }
}
