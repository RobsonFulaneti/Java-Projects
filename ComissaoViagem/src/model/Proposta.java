package model;

public class Proposta {
    private int numProposta;//só é acessado aqui dentro, o get e set acessam a varivel
    private String destino;//só é acessado aqui dentro, o get e set acessam a varivel
    private Comissao comissao;//1 objeto, dentro da proposta irá existir comissão

    @Override
    public String toString() {
        return "Proposta{" +
                "numProposta=" + numProposta +
                ", destino='" + destino + '\'' +
                ", comissao=" + comissao +
                '}';
    }

    public Comissao getComissao() {
        return comissao;
    }

    public void setComissao(Comissao comissao) {
        this.comissao = comissao;
    }//this aponta para as variaveis da classe

    public int getNumProposta() {
        return numProposta;
    }

    public void setNumProposta(int numProposta) {
        this.numProposta = numProposta;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

}