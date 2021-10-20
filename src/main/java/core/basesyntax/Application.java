package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            ball = lottery.getRandomBall();
            System.out.println(ball.toString());
        }
    }
}

