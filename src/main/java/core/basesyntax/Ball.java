package main.java.core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(java.lang.String color) {
        this.color = color;
    }

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color
                + '\'' + ", number="
                + number +
                '}';
    }
}