package core.basesyntax;

public class Ball {

    private String color;
    private int number;

    Ball(int number, String color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public java.lang.String toString() {
        return "Create ball with " + number + " number and " + color + " color";
    }
}

