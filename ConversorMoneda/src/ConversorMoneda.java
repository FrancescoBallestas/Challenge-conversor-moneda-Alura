import javax.swing.*;

public class ConversorMoneda {

    public static void conversorMoneda() {


        String[] opcionesMonedas = {"Pesos a Dólar", "Pesos a Euro", "Pesos a Libras Esterlina",
                "Pesos a Yen Japones", "Pesos a Won Sul-Coreano", "Dólar a Pesos",
                "Euro a Pesos", "Libras Esterlina a Pesos", "Yen Japones a Pesos",
                "Won Sul-Coreano a Pesos"};
        String seleccion = (String) JOptionPane.showInputDialog(
                null,
                "Selecciona una opción:",
                "Conversor de Moneda",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcionesMonedas,
                opcionesMonedas[0]);

        if (seleccion != null) {
            if (seleccion.equals(opcionesMonedas[0])) {
                OperacionesMoneda.convertirPesosADolares();
            } else if (seleccion.equals(opcionesMonedas[1])) {
                OperacionesMoneda.convertirPesosAEuros();
            } else if (seleccion.equals(opcionesMonedas[2])) {
                OperacionesMoneda.convertirPesosALibrasEsterlinas();
            } else if (seleccion.equals(opcionesMonedas[3])) {
                OperacionesMoneda.convertirPesosAYenJapones();
            } else if (seleccion.equals(opcionesMonedas[4])) {
                OperacionesMoneda.convertirPesosAWonSulCoreano();
            } else if (seleccion.equals(opcionesMonedas[5])) {
                OperacionesMoneda.convertirDolaresAPesos();
            } else if (seleccion.equals(opcionesMonedas[6])) {
                OperacionesMoneda.convertirEurosAPesos();
            } else if (seleccion.equals(opcionesMonedas[7])) {
                OperacionesMoneda.convertirLibrasEsterlinasAPesos();
            } else if (seleccion.equals(opcionesMonedas[8])) {
                OperacionesMoneda.convertirYenJaponesAPesos();
            } else if (seleccion.equals(opcionesMonedas[9])) {
                OperacionesMoneda.convertirWonSulCoreanoAPesos();
            }
        }
    }
}

