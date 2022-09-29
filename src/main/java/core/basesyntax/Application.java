package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] balls = new Ball[3];
        for (Ball ball : balls) {
            System.out.println(ball = Lottery.getRandomBall());
        }
    }
}
