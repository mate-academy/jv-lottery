package task;

import java.util.Random;
import task.Ball.Color;

public class ColorSupplier {

    private final Random random = new Random();

    public Color getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)];
    }
}
