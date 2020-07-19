package com.SweetestProject.Candies;

import com.SweetestProject.Additional.Wrapable;

public abstract class Sweets implements Wrapable {
    int price;
    int shelfLifeInMonths;
    int temperature;
    int weightOfUnit;
    double sugarInUnit;

    public int getPrice() {
        return price;
    }

    public int getShelfLifeInMonths() {
        return shelfLifeInMonths;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getWeightOfUnit() {
        return weightOfUnit;
    }

    public double getSugarInUnit() {
        return sugarInUnit;
    }

    public Sweets(int price, int shelfLifeInMonths, int temperature, int weightOfUnit, double sugarInUnit) {
        this.price = price;
        this.shelfLifeInMonths = shelfLifeInMonths;
        this.temperature = temperature;
        this.weightOfUnit = weightOfUnit;
        this.sugarInUnit = sugarInUnit;
    }

    @Override
    abstract public void wrap();

}



