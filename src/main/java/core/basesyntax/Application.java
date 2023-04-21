package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[] {lottery.getRandomBall(), lottery.getRandomBall(),
                lottery.getRandomBall()};
        for (int i = 0; i < balls.length; i++) {
            System.out.println(balls[i]);
        }
    }
}
