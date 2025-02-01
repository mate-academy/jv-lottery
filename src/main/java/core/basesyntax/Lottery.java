package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        int index = new Random().nextInt(100);
        String color = getRandomColor();
        Ball ball = new Ball(color,index);
        return ball;
    }
}
