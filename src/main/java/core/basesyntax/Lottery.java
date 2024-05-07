package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        String color = Color.getRandomColor().toString();
        int number = new Random().nextInt(100) + 1;
        return new Ball(color, number);
    }
}
