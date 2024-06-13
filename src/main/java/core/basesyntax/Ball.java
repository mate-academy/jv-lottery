package core.basesyntax;

import java.util.Random;

public class Ball extends Lottery {
    private String color;
    private int number;

    protected void setColorNumber() {
        this.color = new ColorSupplier().getRandomColor();
        this.number = new Random().nextInt(100);
    }

    @Override
    public String toString() {
        return "Ball{"
                + "number="
                + number
                + ", color='"
                + color
                + '\''
                + '}';
    }
}
