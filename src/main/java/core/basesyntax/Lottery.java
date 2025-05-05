package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final ColorSupplier colors;

    public Lottery() {
        this.colors = new ColorSupplier();
    }

    public Ball getRandomBall() {
        Random random = new Random();
        String randColor = colors.getRandomColor();
        int randNumber = random.nextInt(100) + 1;
        return new Ball(randColor, randNumber);
    }
}
