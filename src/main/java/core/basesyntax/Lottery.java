package core.basesyntax;

public class Lottery {
    public Ball getRandomBall() {
        String color = new ColorSupplier().getRandomColor().toString();
        int number = new NumberSupplier().getRandomNumber();
        return new Ball(color, number);
    }
}
