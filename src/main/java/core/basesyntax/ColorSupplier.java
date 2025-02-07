package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String randomColor;
    public String getRandomColor() {

        String randomColor;

        Random random = new Random();
        Colors[] colors = Colors.values();
        int randomIndex = random.nextInt(colors.length);

        return randomColor = String.valueOf(colors[randomIndex]);
    }
}
