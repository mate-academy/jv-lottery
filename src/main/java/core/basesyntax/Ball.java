package core.basesyntax;

public class Ball {
    int number;
    String color;

    public Ball(int number, String color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.number + this.color;
    }
}
