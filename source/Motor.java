public class Motor {
    private String tipo;
    private double potencia;

    public Motor(String tipo, double potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

class Associacao
{
    public static void main (String[] args)
    {
        Carro carro = new Carro("Fusca");
        Motor motor = new Motor("V8");
    }
    
    public void ligar() {
        System.out.println("Motor ligado.");
    }
}
