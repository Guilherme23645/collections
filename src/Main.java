import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        var value1 = new BigDecimal("0.1");
        var value2 = new BigDecimal("0.2");

        System.out.println(value1.multiply(value2));
    }
}