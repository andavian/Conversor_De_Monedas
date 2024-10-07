import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.JsonSyntaxException;

public class ConsultaAPI {

    ExchangeRate findExchangeRate(String base_code) throws IOException, InterruptedException {
        String baseURL = "https://v6.exchangerate-api.com/v6/";
        String apiKey = "254b1e3a5fd890ec09c4c165";
        String consulta = "/latest/" + base_code.toUpperCase();

        // Concatenar la URL completa
        String direccion = baseURL + apiKey + consulta;



        // Crear cliente HTTP
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        // Realizar la solicitud HTTP
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        // Mostrar la respuesta para propósitos de depuración
        //System.out.println("Respuesta de la API: " + response.body());

        // Manejo de errores si la respuesta está vacía o incorrecta
        if (response.body() == null || response.body().isEmpty()) {
            throw new IOException("Respuesta vacía o nula de la API");
        }

        // Intentar deserializar el JSON
        try {
            return new Gson().fromJson(response.body(), ExchangeRate.class);
        } catch (JsonSyntaxException e) {
            // Si hay un error en el formato del JSON
            System.err.println("Error al deserializar el JSON: " + e.getMessage());
            throw e;
        }
    }
}