package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public String getRandomBall(Lottery ball) {
        int number = new Random().nextInt(100);
        return "Ball has number: " + number + " and color: " + ball.getRandomColor();
    }
}
