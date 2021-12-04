package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public ColorSupplier() {

    }

    public String getRandomColor() {

        int colors = 0;
        for (Color color : Color.values()) {
            colors++;
        }

        Random random = new Random();

        int colorNumber = random.nextInt(colors - 1);

        colors = 0;

        String resultColor = "";

        for (Color color : Color.values()) {
            if (colors == colorNumber) {
                resultColor = color.toString();
            }
            colors++;
        }

        return resultColor;
    }
}
