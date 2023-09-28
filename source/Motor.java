public class Motor {
    public String tipo;
    public double potencia;

    public Motor(String tipo, double potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public void ligarMotor() {
        System.out.println("Motor ligado.");
    }
}
