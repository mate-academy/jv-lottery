package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {

        Color[] colors = Color.values();

        Random random = new Random();

        String resultColor = colors[random.nextInt(colors.length)].toString();

        return resultColor;
    }
}
