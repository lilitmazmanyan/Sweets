package com.SweetestProject.Additional;

import com.SweetestProject.Factories.Darionk;
import com.SweetestProject.Factories.GrandCandy;

import java.util.ArrayList;

import static com.SweetestProject.Additional.Functionality.*;
import static com.SweetestProject.Candies.CandyTypes.*;

public class Helper {

    public static void main(String[] args) {
        PresentBoxes present1 = new PresentBoxes(GrandCandy.getInstrance().produceSweetsGrandCandy(new int[]{5, 3},
                new ArrayList<>() {{
                    add(Iris);
                    add(Batonchik);
                }}));

        PresentBoxes present2 = new PresentBoxes(GrandCandy.getInstrance().produceSweetsGrandCandy(new int[]{10, 5, 10},
                new ArrayList<>() {{
                    add(Marshmallow);
                    add(Moskvichka);
                    add(Batonchik);
                }}));

        PresentBoxes present3 = new PresentBoxes(Darionk.getInstrance().produceSweetsDaroink(new int[]{5, 2, 6, 9, 3},
                new ArrayList<>() {{
                    add(Moskvichka);
                    add(IceCream);
                    add(ChocolateBars);
                    add(Batonchik);
                    add(Cookies);
                }}));


        System.out.println("Present 1\n\tPrice: " + calculateThePrice(present1) + "\n\tWeigth: " + getWeigthOfPresent(present1));
        System.out.println(String.format("Life on the shelf of Present1 is %s months", lifeOnShelf(present1)));

        System.out.println();

        System.out.println("Present 3\n\tPrice: " + calculateThePrice(present3) + "\n\tWeigth: " + getWeigthOfPresent(present3));
        System.out.println(String.format("Life on the shelf of Present3 is %s months", lifeOnShelf(present3)));

    }

}

