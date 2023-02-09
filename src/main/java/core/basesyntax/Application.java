package core.basesyntax;

public class Application {
    private static final int LOTTERY_COUNTER = 3;
    public static void main(String[] args) {
        Lottery lottery1 = new Lottery();
        Ball [] balls = new Ball[LOTTERY_COUNTER];
        for (int i = 0; i < LOTTERY_COUNTER; i++) {
            balls[i] = lottery1.getRandomBall();
            System.out.println(balls[i]);
        }
	}
}

