import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class FormatoMoneda {
    public FormatoMoneda(double valor) {
    }
//    BigDecimal decimal = new BigDecimal(valor).setScale(2, BigDecimal.ROUND_HALF_UP);
    public static String formatoMoneda(double valor){
//        if (String moneda == )
        Locale locale = new Locale("en", "US");
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(locale);
        String cantidadFormateada = formatoMoneda.format(valor);
        return cantidadFormateada;
    }

}
