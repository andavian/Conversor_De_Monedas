import java.util.Scanner;

public class Menu {
    private String base_code;
    private String currencyCode;
    public final Scanner keyboard = new Scanner(System.in);

    public String getBase_code() {
        return base_code;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getOptionMenu() {
        return """
                
                **********************************************************************
                    ** Sea bienvenido/a al conversor de Monedas **
                
                        1 - Dolar Americano =>> Peso Argentino
                        2 - Peso Argentino =>> Dolar Americano
                        3 - Dolar Americano =>> Real Brasileño
                        4 - Real Brasileño =>> Dolar Americano
                        5 - Dolar Americano =>> Peso Colombiano
                        6 - Peso Colombiano =>> Dolar Americano
                        7 - Otra
                        9 - Salir
                
                        Selecciona una opción válida
                
                ***********************************************************************
                """;
    }

    private void otraMoneda() {
        System.out.println("Ingrese el código de la moneda base a convertir (ej: USD):");
        base_code = keyboard.nextLine().toUpperCase();  // Asegura que sea en mayúsculas

        System.out.println("Ingrese el código de la moneda destino (ej: PEN):");
        currencyCode = keyboard.nextLine().toUpperCase();  // Asegura que sea en mayúsculas
    }



    public void selectionOption(int option) {
        switch (option) {
            case 1 -> {
                base_code = "USD";
                currencyCode = "ARS";
            }
            case 2 -> {
                base_code = "ARS";
                currencyCode = "USD";
            }
            case 3 -> {
                base_code = "USD";
                currencyCode = "BRL";
            }
            case 4 -> {
                base_code = "BRL";
                currencyCode = "USD";
            }
            case 5 -> {
                base_code = "USD";
                currencyCode = "COP";
            }
            case 6 -> {
                base_code = "COP";
                currencyCode = "USD";
            }
            case 7 -> {
                keyboard.nextLine();
                otraMoneda();
            }

            default -> System.out.println("Opción no válida, intente de nuevo.");
        }

        if (option >= 1 && option <= 7) {
            System.out.println("Moneda base: " + base_code);
            System.out.println("Moneda destino: " + currencyCode);
        }
    }

}



