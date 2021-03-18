/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs.pm.app;

import java.math.BigDecimal;
import labs.pm.data.Product;

/**
 *
 * @author Assanali
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Product product1 = new Product();
        product1.setId(101);
        product1.setName("Tea");
        product1.setPrice(BigDecimal.valueOf(34.45));
        
        System.out.println(product1);
        
    }
    
}
