package com.SweetestProject.Factories;

import com.SweetestProject.Candies.*;
import com.SweetestProject.Candies.Sweets;

import java.util.ArrayList;
import java.util.Arrays;

public class GrandCandy extends Factories {
    final String address;
    final String phoneNumb;
    final Batonchik batonchik = new Batonchik(2800, 12, 25, 50, 0.3);
    final IceCream iceCream = new IceCream(250, 2, 17, 100, 60, "Chocolate", "Strawberry");
    final Iris iris = new Iris(2200, 15, 30, 20, 0.1);
    final Cookies cookies = new Cookies(450, 1, 30, 30, 0.3, "Oval");
    final Marshmallow marshmallow = new Marshmallow(1900, 7, 10, 20, 0.05);
    final Moskvichka moskvichka = new Moskvichka(2400, 12, 25, 10, 0.1);
    final ChocolateBars chocolateBars = new ChocolateBars(510, 6, 25, 100, 60, "Milk");

    private static GrandCandy instance;

    private GrandCandy() {
        this.address = setAddress();
        this.phoneNumb = setPhoneNumb();
    }

    public static GrandCandy getInstrance() {
        return instance == null ? new GrandCandy() : instance;
    }

    /*
    Should have created a compliance between candies list and their counts
     */
    public ArrayList<Sweets> produceSweetsGrandCandy(int[] counts, ArrayList<CandyTypes> whatToCreate) {  //could have been with varargs
        ArrayList<Sweets> currentPresent = new ArrayList<>();
        int min = Math.min(counts.length, whatToCreate.size());
        for (int i = 0; i < min; i++) {
            currentPresent.addAll(Arrays.asList(produceSweets(whatToCreate.get(i), counts[i])));
        }
        return currentPresent;
    }

    private Sweets[] produceSweets(CandyTypes ct, int count) {
        Sweets[] arr = new Sweets[count];
        int k = 0;
        for (int i = 0; i < count; i++) {
            switch (ct) {
                case Batonchik:
                    arr[k++] = batonchik;
                    break;
                case Iris:
                    arr[k++] = iris;
                    break;
                case Marshmallow:
                    arr[k++] = marshmallow;
                    break;
                case Moskvichka:
                    arr[k++] = moskvichka;
                    break;
                case IceCream:
                    arr[k++] = iceCream;
                    break;
                case ChocolateBars:
                    arr[k++] = chocolateBars;
                    break;
                case Cookies:
                    arr[k++] = cookies;
                    break;

            }
        }
        return arr;
    }

    @Override
    String setAddress() {
        return "Mashtoci 5A";
    }

    @Override
    String setPhoneNumb() {
        return "(010) 532926";
    }
}
