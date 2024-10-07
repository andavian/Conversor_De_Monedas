import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        Menu menu = new Menu();
        ConsultaAPI consultaAPI = new ConsultaAPI();
        FiltroMoneda filtro = new FiltroMoneda();



        while (true) {
            System.out.println(menu.getOptionMenu());
            int option = menu.keyboard.nextInt();

            if (option == 9) {
               break;
            }

            menu.selectionOption(option);

            // Llamas a la API para obtener las tasas de cambio
            ExchangeRate exchangeRate = consultaAPI.findExchangeRate(menu.getBase_code());

            // Filtras la tasa de cambio basada en la opción seleccionada
            filtro.filtrarMoneda(menu, exchangeRate);
        }
    }
}