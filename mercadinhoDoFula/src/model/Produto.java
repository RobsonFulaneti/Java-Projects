package model;

public class Produto {

    private String prod;
    private double valorProduto;
    private int codigo;

    public String printarProduto(){
        String print = "";
        print += "Produto: " + getProd();
        print += "Valor: " + getValorProduto();
        print += "Codigo: " + getCodigo();
        print += "\n";
        return print;
    }

    public String toString(){
        return "Produto: " + prod + ", Valor: " + valorProduto + ", Codigo: " + codigo;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
