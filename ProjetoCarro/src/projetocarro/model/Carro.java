package projetocarro.model;

public class Carro {

    private String marcaCarro;
    private int anoCarro;
    private String modeloCarro;
    private String estadoCarro;
    private String corCarro;
    private int idCarro;
    private double valorAluguel;

    public String printarCarro() {
        String print = "";
        print += "Marca: " + getMarcaCarro() + "\n";
        print += "Modelo: " + getModeloCarro() + "\n";
        print += "Ano: " + getAnoCarro() + "\n";
        print += "Cor: " + getCorCarro() + "\n";
        print += "Ano: " + getAnoCarro() + "\n";
        print += "ID: " + getIdCarro() + "\n";
        print += "Valor do aluguel diário: " + getValorAluguel() + "\n";
        print += "\n";
        return print;
    }

    @Override
    public String toString() {
        return "Carro{" + "marcaCarro=" + marcaCarro + ", anoCarro=" + anoCarro + ", "
                + "modeloCarro=" + modeloCarro + ", estadoCarro=" + estadoCarro + ", corCarro="
                + corCarro + ", idCarro=" + idCarro + ", valorAluguel=" + valorAluguel + '}';
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public String getMarcaCarro() {
        return marcaCarro;
    }

    public void setMarcaCarro(String marcaCarro) {
        this.marcaCarro = marcaCarro;
    }

    public int getAnoCarro() {
        return anoCarro;
    }

    public void setAnoCarro(int anoCarro) {
        this.anoCarro = anoCarro;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public String getEstadoCarro() {
        return estadoCarro;
    }

    public void setEstadoCarro(String estadoCarro) {
        this.estadoCarro = estadoCarro;
    }

    public String getCorCarro() {
        return corCarro;
    }

    public void setCorCarro(String corCarro) {
        this.corCarro = corCarro;
    }

}
