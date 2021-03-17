package poo1;

class Aluno {

    String nome;
    float nota1;
    float nota2;
    float nota3;

    float media() {
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    String status(float media) {
        if (media >= 7) {
            return "aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}