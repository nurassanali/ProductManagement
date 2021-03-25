package labs.pm.app;

import java.math.BigDecimal;
import java.time.LocalDate;
import labs.pm.data.Drink;
import labs.pm.data.Food;
import labs.pm.data.Product;
import labs.pm.data.Rating;

public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Product product1 = new Drink(101, "Tea", BigDecimal.valueOf(1.90), Rating.THREE_STAR);
        Product p2 = new Drink(102, "Coffee", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
        Product p3 = new Food(103, "cAKE", BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
        Product p4 = new Food(104, "Cookie", BigDecimal.valueOf(2.15), Rating.FOUR_STAR, LocalDate.now());
        Product p5 = p3.applyRating(Rating.THREE_STAR);
        
        System.out.println(product1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

    }

}
