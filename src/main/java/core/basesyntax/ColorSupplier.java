package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
   private Random random = new Random();

    public String getRandomColor() {
        Colors[] colors = Colors.values();
        int randomIndex = random.nextInt(colors.length);
        String randomColor = colors[randomIndex].name();
        return randomColor;
    }
}
