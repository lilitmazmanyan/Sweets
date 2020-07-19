package com.SweetestProject.Candies;

public class Cookies extends Sweets {
    String shape;

    public Cookies(int price, int shelfLifeInMonths, int temperature, int weightOfUnit, double sugarInUnit, String shape) {
        super(price, shelfLifeInMonths, temperature, weightOfUnit, sugarInUnit);
        this.shape = shape;
    }

    @Override
    public void wrap() {
        System.out.println("Cookies are not wrapped;");
    }
}
