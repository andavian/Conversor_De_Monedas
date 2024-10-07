import java.io.IOException;

public class FiltroMoneda {

    public void filtrarMoneda(Menu menu, ExchangeRate exchangeRate) {
        String base = menu.getBase_code();
        String destino = menu.getCurrencyCode();

        // Accedes al mapa de conversion_rates desde el objeto ExchangeRate
        Double conversionRate = exchangeRate.conversion_rates().get(destino);

        if (conversionRate != null) {
            System.out.println("La tasa de cambio de " + base + " a " + destino + " es: " + conversionRate);
        } else {
            System.out.println("La tasa de cambio para " + destino + " no está disponible.");
        }
    }


}


