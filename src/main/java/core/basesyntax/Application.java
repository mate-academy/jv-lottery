package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery first = new Lottery();
        first.getRandomBall();
        Lottery second = new Lottery();
        second.getRandomBall();
        Lottery third = new Lottery();
        third.getRandomBall();
        Ball[] balls = new Ball[]{first, second, third};
        for (Ball ball : balls) {
            System.out.println(ball);
        }
    }
}
