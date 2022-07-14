package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "The ball's color is " + color + " and number is " + number + ".";
    }
}
