package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public static String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(Color.values().length);
        Color randomColor = Color.values()[index];
        return String.valueOf(randomColor);
    }

}