package estruturarepeticao4;

import java.util.Scanner;

public class EstruturaRepeticao4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i = 1;
        while (i < 50) {
            if ((i % 2) != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}