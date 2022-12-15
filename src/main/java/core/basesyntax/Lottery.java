package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {

    public Lottery(String color, int number) {
        super(color, number);
    }

    public Ball getRundomBall() {
        int number = new Random().nextInt(100);

        return new Ball("" + getRandomColor(), number);
    }
}

