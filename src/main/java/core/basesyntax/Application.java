package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        ColorSupplier colorSupplier = new ColorSupplier();
        Ball ball = new Ball();
        ball.color = colorSupplier.getRandomColor();
        ball.number = lottery.getRandomBall();
        Ball ball1 = new Ball();
        ball1.color = colorSupplier.getRandomColor();
        ball1.number = lottery.getRandomBall();
        Ball ball2 = new Ball();
        ball2.color = colorSupplier.getRandomColor();
        ball2.number = lottery.getRandomBall();
        System.out.println("Your ball is " + ball.color + " " + ball.number);
        System.out.println("Your ball is " + ball1.color + " " + ball.number);
        System.out.println("Your ball is " + ball2.color + " " + ball.number);
    }
}
