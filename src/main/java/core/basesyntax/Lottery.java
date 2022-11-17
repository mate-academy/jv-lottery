package core.basesyntax;

import java.util.Random;

public class Lottery {

    public String getRandomBall() {
        int random = new Random().nextInt(100);
        return new Ball(new ColorSupplier().getRandomColor(), random).toString();
    }
}
