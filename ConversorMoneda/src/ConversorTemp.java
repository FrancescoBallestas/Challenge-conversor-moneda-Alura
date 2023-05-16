import javax.swing.*;

public class ConversorTemp {
    public static void conversorTemp() {

        String[] opcionesTemperatura = {"Celsius a Farenheit", "Celsius a Kelvin", "Farenheit a Celsius",
                "Farenheit a kelvin", "kelvin a celsius", "kelvin a farenheit"};

        String seleccion2 = (String) JOptionPane.showInputDialog(
                null,
                "Selecciona una opción:",
                "Conversor de Moneda",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcionesTemperatura,
                opcionesTemperatura[0]);

        if (seleccion2 != null) {
            if (seleccion2.equals(opcionesTemperatura[0])) {
                OperacionesTemp.convertirCelsiusAFahrenheit();
            } else if (seleccion2.equals(opcionesTemperatura[1])) {
                OperacionesTemp.convertirCelsiusAKelvin();
            } else if (seleccion2.equals(opcionesTemperatura[2])) {
                OperacionesTemp.convertirFahrenheitACelsius();
            } else if (seleccion2.equals(opcionesTemperatura[3])) {
                OperacionesTemp.convertirFahrenheitAKelvin();
            } else if (seleccion2.equals(opcionesTemperatura[4])) {
                OperacionesTemp.convertirKelvinACelsius();
            } else if (seleccion2.equals(opcionesTemperatura[5])) {
                OperacionesTemp.convertirKelvinAFahrenheit();
            }
            int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Confirmar cierre", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                ConversorTemp.conversorTemp();
            } else {
                JOptionPane.showMessageDialog(null, "Programa terminado", "Confirmación de cierre", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0); // Cierra el programa
            }
        }


    }

}
