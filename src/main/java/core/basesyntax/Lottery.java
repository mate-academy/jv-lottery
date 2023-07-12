package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {

    @Override
    public String getRandomColor() {
        return super.getRandomColor();
    }

    public String getRandomBall() {
        int number = new Random().nextInt(100);
        String ball = getRandomColor() + " " + number;
        return ball;
    }
}
