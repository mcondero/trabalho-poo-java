public class Motor {
    private String tipo;
    private double potencia;

    public Motor(String tipo, double potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public void ligar() {
        System.out.println("Motor ligado.");
    }
}
