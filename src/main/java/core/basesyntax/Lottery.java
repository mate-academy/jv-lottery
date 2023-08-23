package core.basesyntax;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        String color = getRandomColor();
        int randomNum = getRandomINum();
        return new Ball(color, randomNum);
    }
}
