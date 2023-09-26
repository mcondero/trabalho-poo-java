public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double quilometragem;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = 0.0;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void rodar(double quilometrosPercorridos) {
        if (quilometrosPercorridos > 0) {
            quilometragem += quilometrosPercorridos;
        }
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022);

        meuCarro.setMarca("Honda");
        meuCarro.setModelo("Civic");
        meuCarro.setAno(2023);

        meuCarro.rodar(100.5);
        meuCarro.rodar(50.2);

        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Ano: " + meuCarro.getAno());
        System.out.println("Quilometragem: " + meuCarro.getQuilometragem());
    }
}
