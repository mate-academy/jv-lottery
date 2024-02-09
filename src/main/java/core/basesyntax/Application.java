package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        ColorSupplier colorSupplier = new ColorSupplier();
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(lottery.getRandomBall());
        Ball ball1 = new Ball();
        ball1.setColor(colorSupplier.getRandomColor());
        ball1.setNumber(lottery.getRandomBall());
        Ball ball2 = new Ball();
        ball2.setColor(colorSupplier.getRandomColor());
        ball2.setNumber(lottery.getRandomBall());
        System.out.println("Your ball is " + ball.getColor() + " " + ball.getNumber());
        System.out.println("Your ball is " + ball1.getColor() + " " + ball1.getNumber());
        System.out.println("Your ball is " + ball2.getColor() + " " + ball2.getNumber());
    }
}
