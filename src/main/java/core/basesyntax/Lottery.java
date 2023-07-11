package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        int number = new Random().nextInt(100);
        String ball = (new ColorSupplier()).getRandomColor() + " " + number;
        return ball;
    }
}
