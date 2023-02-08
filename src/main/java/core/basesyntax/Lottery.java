package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Color color = new ColorSupplier().getRandomColor();
        int number = new Random().nextInt(100);
        return  new Ball(color, number);
    }
}
