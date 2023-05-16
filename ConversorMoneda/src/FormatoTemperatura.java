import java.text.DecimalFormat;

public class FormatoTemperatura {

    public FormatoTemperatura(DecimalFormat valor) {

    }

    public static String formatoTemperatura(double valor) {

        // Formato con símbolo de grado Celsius (°C)
        DecimalFormat formatoCelsius = new DecimalFormat("#.## °C");
        String temperaturaCelsius = formatoCelsius.format(valor);

        // Formato con símbolo de grado Fahrenheit (°F)
        DecimalFormat formatoFahrenheit = new DecimalFormat("#.## °F");
        String temperaturaFahrenheit = formatoFahrenheit.format(valor);

        // Formato Kelvin
        DecimalFormat formatoKelvin = new DecimalFormat("#.###");
        String temperaturaKelvin = formatoKelvin.format(valor);

        return temperaturaCelsius;
    }

}
