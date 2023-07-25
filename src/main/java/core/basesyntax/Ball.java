package core.basesyntax;

public class Ball {

    private String color;
    private int number;

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
    @Override
    public String toString() {
        return getColor() + " ball with a number " + getNumber();
    }
}
