package com.SweetestProject.Candies;


public class ChocolateBars extends Candies implements Melting {
    String type;

    public ChocolateBars(int price, int shelfLifeInMonths, int temperature, int weightOfUnit, double sugarInUnit, String type) {
        super(price, shelfLifeInMonths, temperature, weightOfUnit, sugarInUnit);
        this.type = type;
    }

    @Override
    public void wrap() {
        System.out.println("Chocolate Bars are fully wrapped");
    }

    @Override
    public void melt() {
        System.out.println("It melts aboove ~25C degrees");
    }
}
