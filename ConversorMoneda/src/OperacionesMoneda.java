import javax.swing.*;

public class OperacionesMoneda {
    public static void convertirPesosADolares() {
        double pesosCop = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en COP:"));
        double factorDolar = 0.00022;
        double dolarUs = pesosCop * factorDolar;
        JOptionPane.showMessageDialog(null, "Tienes: " + FormatoMoneda.formatoMoneda(dolarUs),
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void convertirPesosAEuros() {
        double pesosCop = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en COP:"));
        double factorEuro = 0.00024;
        double euro = pesosCop * factorEuro;
        String resultado = FormatoMoneda.formatoMoneda(euro);
        JOptionPane.showMessageDialog(null, "Euros: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void convertirPesosALibrasEsterlinas() {
        double pesosCop = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en COP:"));
        double factorLibra = 0.00017718791;
        double libras = pesosCop * factorLibra;
        String resultado = FormatoMoneda.formatoMoneda(libras);
        JOptionPane.showMessageDialog(null, "Libras Esterlinas: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void convertirPesosAYenJapones() {
        double pesosCop = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en COP:"));
        double factorYen = 0.030189697;
        double yen = pesosCop * factorYen;
        String resultado = FormatoMoneda.formatoMoneda(yen);
        JOptionPane.showMessageDialog(null, "Yen Japones : " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void convertirPesosAWonSulCoreano() {
        double pesosCop = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en COP:"));
        double factorWon = 0.29669638;
        double won = pesosCop * factorWon;
        JOptionPane.showMessageDialog(null, "Won Sul-Coreano : " + FormatoMoneda.formatoMoneda(won), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

//    conversion inversa
    public static void convertirDolaresAPesos() {
        double dolares = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en USD:"));
        double factorCop = 4520.0298;
        double pesosCop = dolares * factorCop;
        JOptionPane.showMessageDialog(null, "Pesos: " + FormatoMoneda.formatoMoneda(pesosCop), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void convertirEurosAPesos() {
        double euros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en EUR:"));
        double factorCop = 4911.8132;
        double pesosCop = euros * factorCop;
        JOptionPane.showMessageDialog(null, "Pesos: " + FormatoMoneda.formatoMoneda(pesosCop), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void convertirLibrasEsterlinasAPesos() {
        double libras = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en GBP:"));
        double factorCop = 4911.8132;
        double pesosCop = libras * factorCop;
        JOptionPane.showMessageDialog(null, "Pesos: " + FormatoMoneda.formatoMoneda(pesosCop), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void convertirYenJaponesAPesos() {
        double yen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en JPY:"));
        double factorCop = 33.162845;
        double pesosCop = yen * factorCop;
        JOptionPane.showMessageDialog(null, "Pesos: " + FormatoMoneda.formatoMoneda(pesosCop), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void convertirWonSulCoreanoAPesos() {
        double won = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en KRW:"));
        double factorCop = 3.3771618;
        double pesosCop = won * factorCop;
        JOptionPane.showMessageDialog(null, "Pesos: " + FormatoMoneda.formatoMoneda(pesosCop), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
