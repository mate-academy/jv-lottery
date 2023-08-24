package core.basesyntax;

public class Lottery extends ColorSupplier {

    public Ball getRandomBall() {
        String color = getRandomColor();
        int number = getRandomNumber();
        return new Ball(color, number);
    }
}
