package core.basesyntax;

package org.example;

import java.util.Random;

public class ColorSupplier {
    public  Random random = new Random();

    public String getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)].name();

    }
    return null;
}

