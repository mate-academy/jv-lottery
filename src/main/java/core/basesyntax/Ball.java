package core.basesyntax;

import java.awt.*;
import java.util.Random;

public class Ball {
    private int number;
    private String color;

    @Override
    public String toString() {
        return this.color + " ball with number: " + this.number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }
}
