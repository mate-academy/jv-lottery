package core.basesyntax;

public class Ball {
    protected final int randomBalls = 3;
    private Colors colors;
    private int number;

    @Override
    public String toString() {
        return "Ball{" + "color='" + colors
                + '\'' + ", number=" + number
                + '}';
    }

    public void setColor(String color) {
        this.colors = Colors.valueOf(color);
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
