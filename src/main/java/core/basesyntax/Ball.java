package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color;
    Random random = new Random();

    private int number = random.nextInt(100);

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "color: " + this.color + " number: " + this.number;
    }
}
