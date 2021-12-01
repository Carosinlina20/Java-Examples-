package ClassString;

public class ClassString {

    public static void main(String[] args) {

        String name = "Juan david";

        System.out.println("Mi nombre es " + name);

        System.out.println("Mi nombre tiene " + name.length() + "letras.");

        System.out.println("La primera letra de mi nombre es " + name.charAt(0));

        int ultima_letra;
        ultima_letra = name.length();

        System.out.println("Y la ultima letra es la " + name.charAt(ultima_letra - 1));


    }
}
