package core.basesyntax;

public class Ball {
    final String color;
    final int number;

    public Ball(String color, int number) {
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
        return "Information about ball:\n color: " + getColor().toLowerCase() + " number: " + getNumber();
    }

}
