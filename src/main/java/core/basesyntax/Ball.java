package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public String toString() {
        return "Ball color: " + this.color + " with number: " + this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public enum Color {
        YELLOW,
        RED,
        GREEN,
        ORANGE,
        PURPLE,
        BLUE,
        PINK
    }
}

