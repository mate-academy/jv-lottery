package core.basesyntax;

import java.awt.*;

public class Ball {
    private String color;
    private int number;

    public String getColor() {
        return color;
    }

    public void setColor(Color getRandomColor) {
        this.color = String.valueOf(getRandomColor);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public String toString() {
        return color + number
    }
}
