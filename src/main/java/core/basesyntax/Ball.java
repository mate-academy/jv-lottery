package core.basesyntax;

import java.util.Random;

public class Ball {
    private int number;
    private String color;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public Ball() {

    }

    public Ball getRandomBall() {
        Random random = new Random();

        String color = ColorSupplier.getRandomColor();

        int number = random.nextInt(100);
        return new Ball(color, number);

    }

    @Override
    public String toString() {
        return "Ball{"
                + "number=" + number
                + ", color='" + color + '\''
                + '}';
    }
}
