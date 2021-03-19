/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        Product product1 = new Product(101, "Tea", BigDecimal.valueOf(1.90));
        Product p2 = new Drink(102, "Coffee", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
        Product p3 = new Food(103, "cAKE", BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
        Product p4 = new Product();
        Product p5 = p3.applyRating(Rating.THREE_STAR);
        
        System.out.println(product1.getId() + " " + product1.getName() + " "
                + product1.getPrice() + " " + product1.getDiscount() + " "
                + product1.getRating().getStars());

        System.out.println(p2.getId() + " " + p2.getName() + " "
                + p2.getPrice() + " " + p2.getDiscount() + " "
                + p2.getRating().getStars());

        System.out.println(p3.getId() + " " + p3.getName() + " "
                + p3.getPrice() + " " + p3.getDiscount() + " "
                + p3.getRating().getStars());
        
        System.out.println(p4.getId() + " " + p4.getName() + " "
                + p4.getPrice() + " " + p4.getDiscount() + " "
                + p4.getRating().getStars());

        System.out.println(p5.getId() + " " + p5.getName() + " "
                + p5.getPrice() + " " + p5.getDiscount() + " "
                + p5.getRating().getStars());

    }

}
