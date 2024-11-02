package mate.academy.supplier;

import java.util.Random;
import mate.academy.model.Ball;
import mate.academy.model.Color;

public class Lottery {
    private static final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        Color color = new ColorSupplier().getRandomColor();
        int number = new Random().nextInt(MAX_NUMBER);
        return new Ball(color, number);
    }
}
