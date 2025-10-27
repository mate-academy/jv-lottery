package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[3];
        for (Ball ball : balls) {
            ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
