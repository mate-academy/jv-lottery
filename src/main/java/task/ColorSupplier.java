package task;

import java.util.Random;
import task.Ball.Color;

public class ColorSupplier {

    private final Random random = new Random();

    public Color getRandomColor() {

        Color[] values = Color.values();
        int idx = random.nextInt(values.length);
        return values[idx];
    }
}
