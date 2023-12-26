package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
       Random random = new Random();
       ColorSupplier colorSupplier = new ColorSupplier();
       return new Ball(colorSupplier.getRandomColor(), random.nextInt(100)).toString();
    }
}
