import java.util.Map;

public record ExchangeRate(
        String result,
        String base_code,
        Map<String, Double> conversion_rates
) {
}
