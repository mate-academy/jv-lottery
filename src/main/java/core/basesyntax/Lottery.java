package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int rand = 101;
    private Color color = new ColorSupplier().getRandomColor();

    public Ball getRandomBall() {
        return new Ball(color.name().toLowerCase(),
                new Random().nextInt(rand));
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
