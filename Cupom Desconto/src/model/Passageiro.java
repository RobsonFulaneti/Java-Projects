package model;

public class Passageiro {

    private String pax;
    private int numeroTel;
    private int codigo;

    public String printarPax(){
        String print = "";
        print += "Nome do Pax = " + getPax() + "\n";
        print += "Celular do Pax = " + getNumeroTel() + "\n";
        print += "Cupom cadastrado = " + getCodigo() + "\n";
        print += "\n";
        return print;
    }

    @Override
    public String toString(){
        return "Nome do Aluno = " + pax + ", numero tel = " + numeroTel;
    }

    public String getPax() {
        return pax;
    }

    public void setPax(String pax) {
        this.pax = pax;
    }

    public int getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(int numeroTel) {
        this.numeroTel = numeroTel;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
