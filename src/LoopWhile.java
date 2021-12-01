import javax.swing.*;

public class LoopWhile {
    public static void main(String[] args) {

        String password = "Carol";

        String pass = "";

        while (password.equals(pass) == false) {

            pass = JOptionPane.showInputDialog("Introduce l contraseña por favor");

            if (password.equals(pass) == false) {

                System.out.println("Contraseña incorrecta");


            }

        }

        System.out.println("Contraseña correcta.");

    }
}
