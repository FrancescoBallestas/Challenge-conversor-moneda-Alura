import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class OperacionesMoneda {
    public static void convertirPesosADolares() {
        try {
            double pesosCop = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en COP:"));
            double factorDolar = 0.00022;
            double dolarUs = pesosCop * factorDolar;
            Locale locale = new Locale("en", "US");
            NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(locale);
            JOptionPane.showMessageDialog(null, "Tienes: "
                            + formatoMoneda.format(dolarUs), "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
        }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un monto válido en pesos",
                        "Error de entrada", JOptionPane.ERROR_MESSAGE);
            }
    }

    public static void convertirPesosAEuros() {
        try {
            double pesosCop = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en COP:"));
            double factorEuro = 0.00024;
            double euro = pesosCop * factorEuro;
            Locale locale = new Locale("es", "ES");
            NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(locale);
            JOptionPane.showMessageDialog(null, "Tienes: "
                            + formatoMoneda.format(euro), "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
        }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un monto válido en pesos",
                        "Error de entrada", JOptionPane.ERROR_MESSAGE);
            }
    }

    public static void convertirPesosALibrasEsterlinas() {
        try {
        double pesosCop = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en COP:"));
        double factorLibra = 0.00017718791;
        double libras = pesosCop * factorLibra;
        Locale locale = new Locale("en-GB", "GB");
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(locale);
    JOptionPane.showMessageDialog(null, "Tienes: "
            + formatoMoneda.format(libras), "Resultado",
            JOptionPane.INFORMATION_MESSAGE);
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un monto válido en pesos",
                    "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void convertirPesosAYenJapones() {
        try{
        double pesosCop = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en COP:"));
        double factorYen = 0.030189697;
        double yen = pesosCop * factorYen;
        Locale locale = new Locale("ja", "JP");
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(locale);
        JOptionPane.showMessageDialog(null, "Tienes: "
                        + formatoMoneda.format(yen), "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un monto válido en pesos",
                    "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void convertirPesosAWonSulCoreano() {
        try{
        double pesosCop = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en COP:"));
        double factorWon = 0.29669638;
        double won = pesosCop * factorWon;
        Locale locale = new Locale("ko", "KR");
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(locale);
        JOptionPane.showMessageDialog(null, "Tienes: "
                        + formatoMoneda.format(won), "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un monto válido en pesos",
                    "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

//conversion inversa
    public static void convertirDolaresAPesos() {
        try{
        double dolares = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en USD:"));
        double factorCop = 4520.0298;
        double pesosCop = dolares * factorCop;
        Locale locale = new Locale("es", "CO");
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(locale);
        JOptionPane.showMessageDialog(null, "Tienes: "
                        + formatoMoneda.format(pesosCop), "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un monto válido en pesos",
                    "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void convertirEurosAPesos() {
        try{
        double euros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en EUR:"));
        double factorCop = 4911.8132;
        double pesosCop = euros * factorCop;
        Locale locale = new Locale("es", "CO");
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(locale);
        JOptionPane.showMessageDialog(null, "Tienes: "
                        + formatoMoneda.format(pesosCop), "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un monto válido en pesos",
                    "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void convertirLibrasEsterlinasAPesos() {
        try{
        double libras = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en GBP:"));
        double factorCop = 4911.8132;
        double pesosCop = libras * factorCop;
        Locale locale = new Locale("es", "CO");
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(locale);
        JOptionPane.showMessageDialog(null, "Tienes: "
                        + formatoMoneda.format(pesosCop), "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un monto válido en pesos",
                    "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void convertirYenJaponesAPesos() {
        try{
        double yen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en JPY:"));
        double factorCop = 33.162845;
        double pesosCop = yen * factorCop;
        Locale locale = new Locale("es", "CO");
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(locale);
        JOptionPane.showMessageDialog(null, "Tienes: "
                        + formatoMoneda.format(pesosCop), "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un monto válido en pesos",
                    "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void convertirWonSulCoreanoAPesos() {
        try{
        double won = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en KRW:"));
        double factorCop = 3.3771618;
        double pesosCop = won * factorCop;Locale locale = new Locale("es", "CO");
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(locale);
        JOptionPane.showMessageDialog(null, "Tienes: "
                        + formatoMoneda.format(pesosCop), "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un monto válido en pesos",
                    "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }
}
