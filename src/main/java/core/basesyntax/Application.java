package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball ball1 = new Lottery().getRandomBall();
        Ball ball2 = new Lottery().getRandomBall();
        Ball ball3 = new Lottery().getRandomBall();
        Ball[] balls = new Ball[] {ball1, ball2, ball3};
        for (Ball ball : balls) {
            System.out.println(theBall.toString());
        }
    }
}
