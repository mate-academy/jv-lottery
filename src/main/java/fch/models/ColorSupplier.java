package fch.models;

import java.util.Random;

public class ColorSupplier {

    /*
    ColorSupplier has a single method that return a random Color (Enum).
     */

    private int index = new Random().nextInt(Color.values().length);

    public Color getRandomColor() {
        return Color.values()[index];
    }

}
