package com.SweetestProject.Additional;

import com.SweetestProject.Candies.ChocolateBars;
import com.SweetestProject.Candies.IceCream;
import com.SweetestProject.Candies.Sweets;

public class Functionality {

    static int getWeigthOfPresent(PresentBoxes p) {
        int weight = 0;
        for (Sweets s : p.getPresent()) {
            weight += s.getWeightOfUnit();
        }
        return weight;
    }

    static int calculateThePrice(PresentBoxes p) {
        double sum = 0;
        for (Sweets s : p.getPresent()) {
            if (!(s instanceof IceCream) || !(s instanceof ChocolateBars)) {
                sum += s.getPrice() / s.getWeightOfUnit();
            } else sum += s.getPrice();
        }
        return (int) (Math.ceil((sum + 300) / 10.0)) * 10;   //returns with tenth approximate
//        return (int) (Math.ceil((sum + 300) / 100.0)) * 100;   //returns with hundredth approximate

    }

    static int lifeOnShelf(PresentBoxes p) {
        int onShelf = 99;
        for (Sweets s : p.getPresent()) {
            if (s.getShelfLifeInMonths() < onShelf) {
                onShelf = s.getShelfLifeInMonths();
            }
        }
        return onShelf;
    }


}
