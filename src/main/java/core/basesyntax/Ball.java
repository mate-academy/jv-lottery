package core.basesyntax;

public class Ball {
    private String color;
    private int numOfColor;

    public Ball(String color, int numOfColor) {
        this.color = color;
        this.numOfColor = numOfColor;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", numOfColor=" + numOfColor +
                '}';
    }
}
