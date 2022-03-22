package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color;
    private int number;
    private Random rnd = new Random();

    public Ball(String color, int number) {
        this.color = color;
        this.number = rnd.nextInt(number);
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color + '\''
                + ", number=" + number
                + '}';
    }
}
