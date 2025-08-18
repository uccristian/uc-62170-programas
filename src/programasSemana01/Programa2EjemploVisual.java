package programasSemana01;

import javax.swing.JOptionPane;

public class Programa2EjemploVisual {

    public static void main(String[] args) {
        String entrada1, entrada2;
        int num1, num2, num3;

        entrada1 = JOptionPane.showInputDialog("Ingrese num1: ");
        entrada2 = JOptionPane.showInputDialog("Ingrese num2: ");

        num1 = Integer.parseInt(entrada1);
        num2 = Integer.parseInt(entrada2);

        num3 = num1 + num2;

        JOptionPane.showMessageDialog(null, "La suma es: " + num3, "Resutado",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
