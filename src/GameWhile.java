import java.util.*;

public class GameWhile {

    public static void main(String[] args) {

        int aleatorio = (int) (Math.random() * 100);

        Scanner entrada = new Scanner(System.in);

        int num = 0;
        int intentos = 0;

        while (num != aleatorio) {

            intentos++;

            System.out.println("Introduce un número");

            num = entrada.nextInt();

            if (aleatorio < num) {
                System.out.println("Más bajo");

            } else if (aleatorio > num) {

                System.out.println("Más alto");

            }

        }

        System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos");
    }
}
