package org.example;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public String getRandomColor() {
        String[] colors = {"Red", "Blue", "Green", "Yellow", "Black", "White", "Orange", "Purple"};
        return colors[random.nextInt(colors.length)];
    }
}



