package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color;
    private int number;

    public void setColor() {
        ColorSupplier colorSupplier = new ColorSupplier();
        this.color = colorSupplier.getRandomColor();
    }

    public void setNumber() {
        Random random = new Random();
        this.number = random.nextInt(100);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()
                + "color: "
                + this.color
                + ", number: "
                + this.number;
    }
}
