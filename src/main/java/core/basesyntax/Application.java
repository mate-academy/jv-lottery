package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball ball1 = lottery.getRandomBall();
        Ball ball2 = lottery.getRandomBall();
        Ball ball3 = lottery.getRandomBall();

        Ball[] res = new Ball[] {ball1, ball2, ball3};

        for (Ball ball : res) {
            System.out.println(ball);
        }
    }
}
