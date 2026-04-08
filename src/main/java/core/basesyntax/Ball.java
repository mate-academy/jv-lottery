package core.basesyntax;

import java.util.Random;

public class Ball {
    enum color {
        RED,
        BLUE,
        YELLOW,
    }
    private int number;
    static color color;
    private String colorName;
    Random numGen = new Random();

    Ball() {
        this.number = numGen.nextInt(100);
        this.colorName = ColorSupplier.getRandomColor();
    }

    public int getNumber() {
        return number;
    }

    public String getColorName() {
        return colorName;
    }

    @Override
    public String toString() {
        return "Ball #" + getNumber() + ", coloured " + getColorName();
    }
}
