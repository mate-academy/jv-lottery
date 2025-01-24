package core.basesyntax;

import java.util.Random;

public class Ball {
    private final Color color;
    private final int number;

    public Ball(Color color) {
        Random random = new Random();
        this.number = random.nextInt(101);
        this.color = color;
    }

    @Override
    public String toString() {
        return String.valueOf(number) + " " + color;
    }
}
