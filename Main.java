public class Main {
  public static void main(String[] args) {
      Motor motor = new Motor("Gasolina", 200.0);
      System.out.println("Tipo de Motor: " + motor.getTipo());
      System.out.println("Potência do Motor: " + motor.getPotencia());

      Carro carro = new Carro("Toyota", "Corolla", 2022, "Diesel", 180.0);
      System.out.println("\nDetalhes do Carro:");
      System.out.println("Marca: " + carro.getMarca());
      System.out.println("Modelo: " + carro.getModelo());
      System.out.println("Ano: " + carro.getAno());
      System.out.println("Tipo de Motor: " + carro.getMotor().getTipo());
      System.out.println("Potência do Motor: " + carro.getMotor().getPotencia());

      carro.ligarCarro();

      CarroEsportivo carroEsportivo = new CarroEsportivo("Ferrari", "458 Italia", 2023, 340.0);
      System.out.println("\nDetalhes do Carro Esportivo:");
      System.out.println(carroEsportivo.toString());
      carroEsportivo.acelerar();

      carro.getMotor().desligar();
  }
}
