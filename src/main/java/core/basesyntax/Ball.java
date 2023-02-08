package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color = new ColorSupplier().getRandomColor();
    private int number = new Random().nextInt(100);

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
