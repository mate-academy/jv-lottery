package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public static String getRandomColor() {
        int randomNum = new Random().nextInt(String.values().length);
        return String.values()[randomNum];
    }
}

