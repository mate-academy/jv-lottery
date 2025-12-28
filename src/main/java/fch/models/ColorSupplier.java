package fch.models;

import java.util.Random;

public class ColorSupplier {

    /*
    ColorSupplier has a single method that return a random Color (Enum).
     */

    public Color getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        Color result = Color.values()[index];
        return result;
    }

}
