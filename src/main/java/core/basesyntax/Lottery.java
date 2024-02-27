package main.java.core.basesyntax;

import main.java.core.basesyntax.Ball;
import main.java.core.basesyntax.ColorSupplier;

import java.util.Random;

public class Lottery extends ColorSupplier{
    public static String getRandomBall() {
        int ballIndex = new Random().nextInt(100);
        Ball ball = new Ball(getRandomColor(), ballIndex);
        return ball.toString();
    }

}
