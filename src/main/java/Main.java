import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Florian");
        names.add("Martin");
        names.add("Dominic");
        names.add("roter-button");
        names.add("weiter button");

        for (String name : names) {
            if(name.length() >= 7) {
                System.out.println(name);
            }
        }

        List<Product> products = names.stream()
                .filter(name -> name.length() >= 7)
                .filter(name -> name.length() < 10)
                .map(name -> new Product(String.valueOf(name.length()), name))
//                .mapToInt(name -> name.length())
                .collect(Collectors.toList());
//                .forEach(name -> System.out.println(name));

        System.out.println(products);
    }
}
