package core.basesyntax;

public class Ball {
    private final String color;
    private final int num;

    public Ball(String color, int num) {
        this.color = color;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Color is: " + color + " Number is: " + num;
    }
}
