package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(String c, int number) {
        this.color = c;
        this.number = number;
    }

    public String toString() {
        return this.color + " " + this.number;
    }
}
