package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public String toString() {
        return "color: " + this.color + "\n number:" + Integer.toString(this.number);
    }
}
