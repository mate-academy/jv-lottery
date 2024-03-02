package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    private Random random = new Random();

    String getRandomColor() {
        Color[] colors = Color.values();
        int randomIndex = random.nextInt(colors.length);
        //return String.valueOf(colors[randomIndex]);
        return colors[randomIndex].name();
    }
}
