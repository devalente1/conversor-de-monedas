import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public Conversion hacerConversion(String monedaInicial, String monedaFinal, float cantidad) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/c28187d3f1f757bdf53f1b22/pair/"
                + monedaInicial + "/" + monedaFinal + "/" + cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            //System.out.println("JSON RAW RECIBIDO: " + response + "\n");
            return new Gson().fromJson(response.body(), Conversion.class);
        } catch (Exception e) {
            throw new RuntimeException("No se encontró esa conversión");
        }
    }
}
