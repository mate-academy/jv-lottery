package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;
    private static Lottery lottery = new Lottery();

    public static void main(String[] args) {
        Ball[] ball = new Ball[NUMBER_OF_BALLS];
        for (int i = 0; i < NUMBER_OF_BALLS; i++) {
            ball[i] = lottery.getRandomball();
            System.out.println(ball[i]);
        }
    }
}
