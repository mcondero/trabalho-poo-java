public class Main {
    public static void main(String[] args) {
        System.out.println("Questão 1:");
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022);
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Ano: " + meuCarro.getAno());

        System.out.println("\nQuestão 2:");
        meuCarro.setQuilometragem(10000);
        System.out.println("Quilometragem atual: " + meuCarro.getQuilometragem());
        meuCarro.rodar(200);
        System.out.println("Quilometragem após rodar 200 km: " + meuCarro.getQuilometragem());

        System.out.println("\nQuestão 3:");
        CarroEsportivo carroEsportivo = new CarroEsportivo("Ferrari", "458 Italia", 2023, 320.0);
        System.out.println("Velocidade Máxima: " + carroEsportivo.getVelocidadeMaxima());
        carroEsportivo.acelerar();
        System.out.println(carroEsportivo.toString());

        System.out.println("\nQuestão 4:");
        Motor motor = new Motor("Gasolina", 200.0);
        Carro carroComMotor = new Carro("Toyota", "Corolla", 2022, motor);
        carroComMotor.ligarCarro();
    }
}
