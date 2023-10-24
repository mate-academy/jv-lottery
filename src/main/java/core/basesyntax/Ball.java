package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{color='" + getColor() + "', number=" + getNumber() + "}";
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

}
