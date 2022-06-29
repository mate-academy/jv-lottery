package core.basesyntax;

import java.util.Random;

public class Ball extends ColorSupplier {

    private int number;
    private String color;

    public int getNumber() {
        return this.number = (int) (Math.random() * 100);
    }

    public String getColor() {
        return this.color = getRandomColor();
    }

    @Override
    public String toString() {
        return "Ball{" +
                "number=" + number +
                ", color='" + color + '\'' +
                '}';
    }
}


