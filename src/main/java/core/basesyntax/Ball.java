package core.basesyntax;

public class Ball {
    String color;
    int number;

    Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return color;
    }


}
