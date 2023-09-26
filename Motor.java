class Motor {
  private String tipo;
  private double potencia;
  private boolean ligado;

  public Motor(String tipo, double potencia) {
      this.tipo = tipo;
      this.potencia = potencia;
      this.ligado = false;
  }

  public String getTipo() {
      return tipo;
  }

  public double getPotencia() {
      return potencia;
  }

  public boolean isLigado() {
      return ligado;
  }

  public void ligar() {
      ligado = true;
      System.out.println("Motor ligado");
  }

  public void desligar() {
      ligado = false;
      System.out.println("Motor desligado");
  }
}

class Carro {
  private String marca;
  private String modelo;
  private int ano;
  private double quilometragem;
  private Motor motor;

  public Carro(String marca, String modelo, int ano, String tipoMotor, double potenciaMotor) {
      this.marca = marca;
      this.modelo = modelo;
      this.ano = ano;
      this.quilometragem = 0.0;
      this.motor = new Motor(tipoMotor, potenciaMotor);
  }

  public void ligarCarro() {
      if (!motor.isLigado()) {
          motor.ligar();
          System.out.println("Carro ligado");
      } else {
          System.out.println("Carro já está ligado");
      }
  }

  public static void main(String[] args) {
      Carro meuCarro = new Carro("Toyota", "Corolla", 2022, "Gasolina", 150.0);

      meuCarro.ligarCarro();
      meuCarro.ligarCarro();

      meuCarro.motor.desligar();
  }
}
