package core.basesyntax;

public class Ball {
    public Ball(ENUMdifferenColor color, int number) {
        this.color = color;
        this.number = number;
    }

    private ENUMdifferenColor color;
    private int number;

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }
}
