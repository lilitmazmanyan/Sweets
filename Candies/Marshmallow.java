package com.SweetestProject.Candies;

public class Marshmallow extends Candies implements Melting {

    public Marshmallow(int price, int shelfLifeInMonths, int temperature, int weightOfUnit, double sugarInUnit) {
        super(price, shelfLifeInMonths, temperature, weightOfUnit, sugarInUnit);
    }

    @Override
    public void melt() {
        System.out.println("Melted and ready to be consumed :D");
    }
}
