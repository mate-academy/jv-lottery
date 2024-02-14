package core.basesyntax;

public class Lottery {

    public String getRandomBall() {
        return new ColorSupplier().getRandomColor() + " " + new Ball().getRandomNumber();
    }
}
