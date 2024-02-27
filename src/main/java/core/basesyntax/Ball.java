package main.java.core.basesyntax;

public class Ball {
    String color;
    int number;

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }
    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }
}
