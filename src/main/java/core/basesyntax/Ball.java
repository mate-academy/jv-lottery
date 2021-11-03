package core.basesyntax;

public class Ball {

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Lottery lottery = new Lottery();
    private String color = colorSupplier.getRandomColor();
    private int number = lottery.getRandomBall();

    public String toString() {
        String readyBall = color + " " + number;
        return readyBall;
    }
}
