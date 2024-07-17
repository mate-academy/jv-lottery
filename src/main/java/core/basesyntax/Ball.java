package core.basesyntax;

import java.util.Random;

public class Ball {
    private Color color;
    private int number;

    public Ball(Color color) {
        this.color = color;
        this.number = new Random().nextInt(100);
    }

    @Override
    public String toString() {
        return color + " ball # " + number;
    }
}
