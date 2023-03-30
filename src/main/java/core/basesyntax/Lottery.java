package core.basesyntax;

public class Lottery {
    public String getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor().toString();
        int randomNum = ball.getRandomNumber();
        ball.setColor(randomColor);
        ball.setNumber(randomNum);
        return ball.getColor() + " " + ball.getNumber();
    }
}
