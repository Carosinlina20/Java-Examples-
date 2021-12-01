package Exercise7;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int restult;


        System.out.println("escriba el primer número: ");
        num1 = sc.nextInt();

        System.out.println("escriba el segundo número: ");
        num2 = sc.nextInt();

        restult = num1 + num2;

        System.out.println("el resultado es " + restult);


    }
}
