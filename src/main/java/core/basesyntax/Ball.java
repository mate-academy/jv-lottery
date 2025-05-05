package core.basesyntax;

public class Ball {

    private final String color;
    private final int number;

    public Ball(String color,int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return " Ball Color " + color + " and number " + number;
    }
}
