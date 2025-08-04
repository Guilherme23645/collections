import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> shoplist = new LinkedHashMap<>();
        shoplist.put("bread",10);
        shoplist.put("apples",6);
        shoplist.put("bananas",12);
        shoplist.put("watermelon",2);
        shoplist.put("orange",5);
        shoplist.put("milk",2);
        shoplist.forEach((item, amount) -> System.out.printf("%s: %s%n",item,amount));
    }
}