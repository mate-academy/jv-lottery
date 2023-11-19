package core.basesyntax;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Number number = new Number();

    public Ball getRandomBall() {
        return new Ball(number.getRandomInt(), colorSupplier.getRandomColor());
    }
}
