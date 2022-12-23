package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    private final Random random = new Random();

    public Lottery(int number, String color) {
        super(number, color);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Ball getRandomBall() {
        int number = random.nextInt(100);
        return new Ball(number,"" + getRandomColor());
    }
}
