package core.basesyntax;

public class Lottery {

    public Ball getRandomBall() {

        Ball randomBall = new Ball();
        String color = new ColorSupplier().getRandomColor();
        int number = new Constant().getBallNumber();
        randomBall.setColor(color);
        randomBall.setNumber(number);
        return randomBall;
    }
}
