package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        Color[] colors = Color.values();
int randomIndex = random.nextInt(colors.length);

        return colors[randomIndex].name();

    }
}
