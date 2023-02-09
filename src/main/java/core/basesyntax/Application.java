package core.basesyntax;

public class Application {
    public static final int countOfBalls = 3;
    public static void main(String[] args) {
        Ball[] randomBalls = new Ball[countOfBalls];
        Lottery lottery = new Lottery();
        for (int i = 0; i < randomBalls.length; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
