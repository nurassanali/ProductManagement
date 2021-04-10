/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs.pm.data;

public class ProductManagementException extends Exception {
    public ProductManagementException() {
        super();
    }
    
    public ProductManagementException(String message) {
        super(message);
    }
    
    public ProductManagementException(String message, Throwable cause) {
        super(message, cause);
    }
}
