package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] randomBalls = new Ball[3];
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            randomBalls[i] = lottery.getRandomBall();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(randomBalls[i]);
        }
    }
}
