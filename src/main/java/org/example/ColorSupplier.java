package org.example;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public Color getRandomColor() {

        Color[] color = Color.values();
        return color[random.nextInt(color.length)];
    }
}



