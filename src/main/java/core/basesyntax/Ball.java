package core.basesyntax;

public class Ball extends ColorSupplier {
    private String color;
    private int number;

    @Override
    public String toString() {
        return "Ball has color " + getRandomColor() + " and number " + getRandomNumber();
    }
}

