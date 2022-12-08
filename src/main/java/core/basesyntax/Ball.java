package core.basesyntax;

import static core.basesyntax.Lottery.getRandomBall;

public class Ball {
    private String color;
    private int number;

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
        return "Lottery{color = " + getRandomBall().getColor()
                + ", number = " + getRandomBall().getNumber() + "}";
    }
}
