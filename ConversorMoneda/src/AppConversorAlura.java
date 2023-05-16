import javax.swing.*;

public class AppConversorAlura {

    public static void main(String[] args) {

        String[] menu = {"Conversor de Moneda", "Conversor de Temperatura"};
        String seleccion = (String) JOptionPane.showInputDialog(
                null,
                "Selecciona una opción:",
                "Conversor de Moneda",
                JOptionPane.QUESTION_MESSAGE,
                null,
                menu,
                menu[0]);

        if (seleccion != null) {
            if (seleccion.equals(menu[0])) {
                ConversorMoneda.conversorMoneda();
            } else if (seleccion.equals(menu[1])) {
                ConversorTemp.conversorTemp();
            }
        }
    }
}
