package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color;
    private int number;

    public void setColor() {
        this.color = new ColorSupplier().getRandomColor().toString();
    }

    public void setNumber() {
        this.number = new Random().nextInt(100);
    }

    @Override
    public String toString() {
        return "Ball{" + "color='" + color + '\'' + ", number=" + number + '}';
    }
}
