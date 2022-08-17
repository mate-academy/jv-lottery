package core.basesyntax;

public class Ball extends Lottery {
    private String color;
    private int number;

    public enum Colors {
        RED, BLUE, GREEN, YELLOW, PURPLE
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return color + " " + number;
    }
}
