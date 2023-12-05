package core.basesyntax;

public class Ball {
    private String color;
    private int namber;

    public Ball(String color, int namber) {
        this.color = color;
        this.namber = namber;
    }

    @Override
    public String toString() {
        return color + " " + namber;
    }
}
