package core.basesyntax;


public class Application {
    public static void main(String[] args) {
        Ball[] balls = new Ball[3];
        for (Ball ball : balls) {
            ball = Lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}