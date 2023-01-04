package core.basesyntax;

public class Ball {
    protected String color;
    protected int number;

    @Override
    public String toString() {
        return "Ball{"
                + "color='"
                + color
                + '\''
                + ", number='"
                + number
                + '\''
                + '}';
    }
}
