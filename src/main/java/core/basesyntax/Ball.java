package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color;
    private int number;

    public void setColor() {
        ColorSupplier color = new ColorSupplier();
        this.color = color.getRandomColor();
    }

    public void setNumber() {
        this.number = new Random().nextInt(100);
    }

    @Override
    public String toString() {
        return "Color = " + color + ", number = " + number;
    }


}
