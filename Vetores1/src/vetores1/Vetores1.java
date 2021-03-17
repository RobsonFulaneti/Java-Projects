package vetores1;

import java.util.Arrays;

public class Vetores1 {

    public static void main(String[] args) {
        double v[] = {3.5, 2.75, 9, -4.5};
        String mes[] = {"jan", "fev", "mar", "abr", "maio", "jun", "jul", "ago",
                "set", "out", "nov", "dez"};
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int c = 0; c < mes.length; c++) {
            System.out.println("O mês de " + mes[c] + " tem " + dias[c]
                    + " dias");
        }
        System.out.println("");
        Arrays.sort(v);
        for (double valor : v) {
            System.out.print("Os valores estão em ordem devido ao metodo Sort ");
            System.out.println(valor);

        }
    }
}
