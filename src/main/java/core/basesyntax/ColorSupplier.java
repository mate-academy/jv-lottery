package core.basesyntax;

import java.util.Random;
import java.util.concurrent.Callable;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        Color[] colors = Color.values();
        int randomIndex = random.nextInt(colors.length);

        return colors[randomIndex].name();
    }
}
