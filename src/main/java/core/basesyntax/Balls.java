package core.basesyntax;

public class Balls {
    private String color;
    private int number;

    public Balls(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Color is " + color + ", number is " + number;
    }
}
