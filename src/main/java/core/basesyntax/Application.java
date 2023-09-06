package core.basesyntax;

public class Application {
    private static final int NUNBER_OF_BALLS = 3;
    private static Lottery lottery = new Lottery();
    private static Ball ball = new Ball();

    public static void main(String[] args) {
        for (int i = 0; i < NUNBER_OF_BALLS; i++) {
            ball = lottery.getRandomball();
            System.out.println(ball);
        }
    }
}
