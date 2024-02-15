package core.basesyntax;

import java.util.Random;

public class Ball {
    private Color color;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private int number;

    @Override
    public String toString() {
        return "Ball{"
                +
                "number="
                + number
                + '}';
    }
}
