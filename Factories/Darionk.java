package com.SweetestProject.Factories;

import com.SweetestProject.Candies.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Darionk extends Factories {
    final String address;
    final String phoneNumb;
    final Batonchik batonchik = new Batonchik(2300, 10, 30, 50, 0.9);
    final IceCream iceCream = new IceCream(100, 2, 25, 150, 0.3, "Caramel", "NoFilling");
    final Iris iris = new Iris(1200, 16, 35, 30, 0.03);
    final Cookies cookies = new Cookies(2700, 3, 25, 30, 0.6, "Heart Shaped");
    final Marshmallow marshmallow = new Marshmallow(1600, 6, 50, 10, 0.5);
    final Moskvichka moskvichka = new Moskvichka(1700, 15, 30, 20, 0.09);
    final ChocolateBars chocolateBars = new ChocolateBars(410, 3, 20, 200, 0.6, "Dark");

    private static Darionk instance;

    private Darionk() {
        this.address = setAddress();
        this.phoneNumb = setPhoneNumb();
    }

    public static Darionk getInstrance() {
        return instance == null ? new Darionk() : instance;
    }

    public ArrayList<Sweets> produceSweetsDaroink(int[] counts, ArrayList<CandyTypes> whatToCreate) {  //could have been with varargs
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
        return "Սևանի փող., 86/1";
    }

    @Override
    String setPhoneNumb() {
        return "(010)447520";
    }
}
