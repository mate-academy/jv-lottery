package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    public Lottery(String color, int number) {
        super(color, number);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Ball getRandomBall() {
        Random random = new Random();
        int number = random.nextInt(100);
        return new Ball("" + getRandomColor(),number);
    }
}
