package core.basesyntax;

import javax.swing.*;
import java.util.Random;

public class Lottery {
    public Ball getRandomBall(Ball ball) {
        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(new Random().nextInt(100));

        return ball;
    }

}
