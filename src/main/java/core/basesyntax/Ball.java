package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    @Override
    public String toString() {
        return "The Ball color is " + color + "and number " + number;
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

    enum Colors {
        RED,
        GREEN,
        YELLOW,
        BLUE,
    }
}
