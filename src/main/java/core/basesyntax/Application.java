package core.basesyntax;

public class Application {
    public static final int LOTTERY_SIZE = 3;

    public static void main(String[] args) {
        Ball[] balls = new Ball[LOTTERY_SIZE];
        Lottery lottery = new Lottery();
        for (int i = 0; i < LOTTERY_SIZE; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
