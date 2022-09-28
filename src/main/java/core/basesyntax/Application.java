package core.basesyntax;

public class Application {
    public void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[] {
                lottery.getRandomBall(),
                lottery.getRandomBall(),
                lottery.getRandomBall()
        };
        for (Ball ball : balls) {
            System.out.println(ball);
        }
    }
}
