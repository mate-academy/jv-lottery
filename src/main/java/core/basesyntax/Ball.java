package core.basesyntax;

public class Ball {
    private String color;
    private int num;

    public Ball(String color, int num) {
        this.color = color;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Ball{color = " + color + ", number = " + num + '}';
    }
}
