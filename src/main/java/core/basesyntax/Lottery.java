package core.basesyntax;

import java.util.Random;

public class Lottery {

    public static Ball getRandomBall() {
        Random random = new Random();
        Ball a = new Ball();
        a.setNumber(random.nextInt(100));
        a.setColor(ColorSupplier.getRandomColor());
        return a;
    }

}