package exercise6;
//Ejercicio 6

// crea un programa que realice esta operación num1 / num2 * (num3 - num2)
// dónde los valores de las variables sean 67, 3 y 1 respectivamente.
public class Exercise6 {

    public static void main(String[] args) {
        int num1 = 67;
        int num2 = 3;
        int num3 = 1;

        int rest;
        rest = num3 - num2;

        double divide;
        divide = (double) num1 / (double) num2;

        double multiply;
        multiply = (double) rest * divide;

        System.out.println("El resultado de la resta es= " + rest + "de la division=" + divide + "Por lo que el resultado de toda la operacion es=" + multiply);

    }


}





