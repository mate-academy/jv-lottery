package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    public Lottery(int number, String color) {
        super(number, color);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    private final Random random = new Random();

    public Ball getRandomBall() {
        int number = random.nextInt(100);
        return new Ball(number,"" + getRandomColor());
    }
}
