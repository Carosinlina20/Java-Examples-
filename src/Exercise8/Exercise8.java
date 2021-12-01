package Exercise8;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu nombre: ");
        String text1 = sc.next();

        System.out.println("Escribe tu apellido: ");
        String text2 = sc.next();
        System.out.println("Hola " + text1 + " "  +  text2);

    }
}
