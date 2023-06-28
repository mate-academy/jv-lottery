package core.basesyntax;

import java.text.MessageFormat;

public class Ball {
    private String color;
    private int number;

    Ball() {

    }

    Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Ball'{'color=''{0}'', number={1}'}'", color, number);
    }
}
