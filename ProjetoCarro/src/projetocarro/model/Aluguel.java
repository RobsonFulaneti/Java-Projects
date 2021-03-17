package projetocarro.model;

public class Aluguel {
    private int diarias;
    private Carro carroEncontrado;
    private Cliente cliente;

    @Override
    public String toString() {
        return "Aluguel{" + "diarias=" + diarias + ", carroEncontrado=" + carroEncontrado + ", cliente=" + cliente + '}';
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarroEncontrado() {
        return carroEncontrado;
    }

    public void setCarroEncontrado(Carro carroEncontrado) {
        this.carroEncontrado = carroEncontrado;
    }

    public int getDiarias() {
        return diarias;
    }

    public void setDiarias(int diarias) {
        this.diarias = diarias;
    }
}
