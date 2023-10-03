package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random =new Random();
    public Ball getRandomBall() {
        Ball newOne = new Ball();
        newOne.setNumber(random.nextInt(100));
        ColorSupplier color = new ColorSupplier();
        newOne.setColor(color.getRandomColor());
        return newOne;
    }
}
