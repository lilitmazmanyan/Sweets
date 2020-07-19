package com.SweetestProject.Candies;


public abstract class Candies extends Sweets {

    public Candies(int price, int shelfLifeInMonths, int temperature, int weightOfUnit, double sugarInUnit) {
        super(price, shelfLifeInMonths, temperature, weightOfUnit, sugarInUnit);
    }

    @Override
    public void wrap() {
        System.out.println("Wrapped carefully");
    }
}
