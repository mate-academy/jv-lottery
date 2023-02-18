package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public String getColor() {
        return new ColorSupplier().getRandomColor();
    }

    public int getNumber() {
        return new Number().randomNumberForBall();
    }

    @Override
    public String toString() {
        String ball = "Color is: " + color + ", Number: " + number;
        return ball;
    }
}
