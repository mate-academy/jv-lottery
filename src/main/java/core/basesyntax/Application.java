package core.basesyntax;

public class Application {
    private static final int BALL_AMOUNT = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < BALL_AMOUNT; i++) {
            String randomColor = lottery.getRandomBall().getColor();
            int randomNumber = lottery.getRandomBall().getNumber();
            System.out.println("Ball number " + randomNumber + " " + randomColor);
        }
    }
}
