import javax.swing.*;

public class OperacionesTemp {

    public static void convertirCelsiusAFahrenheit() {
        try{
        double gradosCelsius = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los grados Celsius:"));
        double fahrenheit = (gradosCelsius * 1.8) + 32;
        JOptionPane.showMessageDialog(null, "Tienes: "
                        + FormatoTemperatura.formatoTemperatura(fahrenheit),
                    "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un monto válido en pesos",
                    "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void convertirCelsiusAKelvin() {
        try{
        double gradosCelsius = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los grados Celsius:"));
        double factorKelvin = 273.15;
        double kelvin = gradosCelsius + factorKelvin;
        JOptionPane.showMessageDialog(null, "Tienes: "
                        + FormatoTemperatura.formatoTemperatura(kelvin),
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un monto válido en pesos",
                    "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void convertirFahrenheitACelsius() {
        try{
        double gradosFahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los grados Fahrenheit:"));
        double celsius = (gradosFahrenheit - 32) / 1.8;
        JOptionPane.showMessageDialog(null, "Tienes: "
                        + FormatoTemperatura.formatoTemperatura(celsius),
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un monto válido en pesos",
                    "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void convertirFahrenheitAKelvin() {
        try{
        double gradosFahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los grados Fahrenheit:"));
        double factorKelvin = -272.15;
        double kelvin = ((gradosFahrenheit - 32) / 1.80 ) + factorKelvin;
        JOptionPane.showMessageDialog(null, "Tienes: "
                        + FormatoTemperatura.formatoTemperatura(kelvin),
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un monto válido en pesos",
                    "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void convertirKelvinACelsius() {
        try{
        double gradosKelvin = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los grados Kelvin:"));
        double factorCelsius = -272.15;
        double celsius = gradosKelvin + factorCelsius;
        JOptionPane.showMessageDialog(null, "Tienes: "
                        + FormatoTemperatura.formatoTemperatura(celsius),
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un monto válido en pesos",
                    "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void convertirKelvinAFahrenheit() {
        try{
        double gradosKelvin = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los grados Kelvin:"));
        double fahrenheit = 1.8 * ( gradosKelvin - 273.15) + 32;
        JOptionPane.showMessageDialog(null, "Tienes: "
                        + FormatoTemperatura.formatoTemperatura(fahrenheit),
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un monto válido en pesos",
                    "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

}
