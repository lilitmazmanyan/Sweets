package com.SweetestProject.Candies;

public class IceCream extends Sweets implements Melting {
    String type;
    String filling;

    public IceCream(int price, int shelfLifeInMonths, int temperature, int weightOfUnit, double sugarInUnit, String type, String filling) {
        super(price, shelfLifeInMonths, temperature, weightOfUnit, sugarInUnit);
        this.type = type;
        this.filling = filling;
    }

    @Override
    public void wrap() {
        System.out.println("Wrapped in cold");
    }

    @Override
    public void melt() {
        System.out.println("Ice cream melted and now it is all on your clothes");
    }
}
