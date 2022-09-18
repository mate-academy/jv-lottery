package core.basesyntax;

public class Ball {
    colors color;
    int number;

    @Override
    public String toString() {
        return "Ball " + number + " with " + color + " color".toString();
    }
}
