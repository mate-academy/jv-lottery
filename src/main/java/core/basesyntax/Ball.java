package core.basesyntax;

public class Ball {

    private String color;
    private int number;
    private int count;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public Ball(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Ball{" + "color='" + color + '\'' + ", number=" + number + '}';
    }

    public int getCount() {
        return count;
    }
}
