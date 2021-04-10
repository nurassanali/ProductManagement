package labs.pm.app;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Locale;
import labs.pm.data.Drink;
import labs.pm.data.Food;
import labs.pm.data.Product;
import labs.pm.data.ProductManager;
import labs.pm.data.Rating;

public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductManager pm = new ProductManager("en-GB");

        // TODO code application logic here
        pm.createProduct(101, "Tea", BigDecimal.valueOf(1.90), Rating.NOT_RATED);
        pm.printProductReport(42);
        pm.reviewProduct(42, Rating.FOUR_STAR, "nice hot cup of tea");
        pm.reviewProduct(101, Rating.TWO_STAR, "rather weak tea");
        pm.reviewProduct(101, Rating.FOUR_STAR, "fine tea");
        pm.reviewProduct(101, Rating.FOUR_STAR, "good tea");
        pm.reviewProduct(101, Rating.FIVE_STAR, "perfect tea");
        pm.reviewProduct(101, Rating.THREE_STAR, "just add some lemon!");
        System.out.println();

        pm.changeLocale("ru-RU");

        pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        pm.reviewProduct(102, Rating.THREE_STAR, "coffee was ok");
        pm.reviewProduct(102, Rating.ONE_STAR, "where is milk&!");
        pm.reviewProduct(102, Rating.FIVE_STAR, "It's perfect with ten spoons of sugar");
//        pm.printProductReport(p2);

        pm.createProduct(103, "cAKE", BigDecimal.valueOf(3.99), Rating.THREE_STAR, LocalDate.now().plusDays(2));
        pm.reviewProduct(103, Rating.FIVE_STAR, "veri nice cake");
        pm.reviewProduct(103, Rating.FOUR_STAR, "it good, but i've expected more chocolate");
        pm.reviewProduct(103, Rating.FIVE_STAR, "this cake is perfect");

        pm.createProduct(104, "Cookie", BigDecimal.valueOf(2.15), Rating.FOUR_STAR, LocalDate.now());

        pm.createProduct(106, "Chocolate", BigDecimal.valueOf(2.50), Rating.NOT_RATED, LocalDate.now());
        pm.reviewProduct(106, Rating.TWO_STAR, "Too sweet");
        pm.reviewProduct(106, Rating.THREE_STAR, "better then cookie");
        pm.reviewProduct(106, Rating.TWO_STAR, "Too bitter");
        pm.reviewProduct(106, Rating.ONE_STAR, "I don't get it!");
        pm.printProductReport(106);

        Comparator<Product> ratingSorter = (p1, p2) -> p2.getRating().ordinal() - p1.getRating().ordinal();
        pm.printProducts(p -> p.getPrice().floatValue() < 2, ratingSorter);
        Comparator<Product> priceSorter = (p1, p2) -> p2.getPrice().compareTo(p1.getPrice());

        pm.getDiscounts().forEach((rating, discount) -> System.out.println(rating + "\t" + discount));
//        pm.printProducts(ratingSorter.thenComparing(priceSorter));        
//        pm.printProducts(ratingSorter.thenComparing(priceSorter).reversed());       
    }
}
