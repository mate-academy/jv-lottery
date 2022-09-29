package core.basesyntax;

import java.util.Random;

public class Ball {
    private Color color = ColorSupplier.getRandomColor();
    private int number = new Random().nextInt(100);

    public int getNumber() {
        return number;
    }

    public Color getColor() {
        return color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball color: " + this.color + ". Ball number: " + this.number;
    }
}
