package core.basesyntax;

public class Ball {
    String colour;
    int number;

    public Ball(String colour, int number) {
        this.colour = colour;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "colour='" + colour + '\'' +
                ", number=" + number +
                '}';
    }
}
