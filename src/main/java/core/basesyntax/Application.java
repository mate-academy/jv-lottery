package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball ball;
        for (int i = 0; i < 3; i++) {
            ball = lottery.getRandomBall();
            System.out.println(ball.getColor() + " " + ball.getNumber());
        }
    }
}
