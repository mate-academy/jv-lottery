package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {

    public void getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int random = new Random().nextInt(100);
        Ball ball = new Ball(3);
        for (int i = 0; i < ball.getCount(); i++) {
            System.out.println(new Ball(colorSupplier.getRandomColor(), random));
        }
    }
}
