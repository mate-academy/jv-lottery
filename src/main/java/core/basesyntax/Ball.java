package core.basesyntax;

public class Ball {

    ColorSupplier colorSupplier = new ColorSupplier();
    Lottery lottery = new Lottery();
    String color = colorSupplier.getRandomColor();
    int number = lottery.getRandomBall();

    public String toString() {
        String readyBall = color + " " + number;
        return readyBall;
    }



}
