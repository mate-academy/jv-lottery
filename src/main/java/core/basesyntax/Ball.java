package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color;
    private int number;

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return color + " ball by number " + number;
    }
}
