package core.basesyntax;

public class Lottery {
    public String getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = String.valueOf(colorSupplier.getRandomColor());
        ball.setColor(randomColor);
        int randomNum = ball.getRandomNumber();
        ball.setNumber(randomNum);
        String result = ball.getColor() + " " + ball.getNumber();
        return result;
    }
}
