package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier color = new ColorSupplier();
        Random random = new Random();
        Ball bullet = new Ball();
        bullet.setNumber(random.nextInt(100));
        bullet.setColor(color.getRandomColor());
        return bullet;
    }
}
