/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs.pm.data;

public enum Rating {
    NOT_RATED("-_-"),
    ONE_STAR("*"),
    TWO_STAR("**"),
    THREE_STAR ("****"),
    FOUR_STAR("****"),
    FIVE_STAR("*****");

    private String stars;
    private Rating(String stars) {
        this.stars = stars;
    }
    
    public String getStars() {
        return stars;
    }
}
