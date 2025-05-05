package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_USERS = 3;

    public static void main(String[] args) {

        User[] users = new User[NUMBER_OF_USERS];
        Lottery lottery = new Lottery();
        for (int i = 0; i < users.length;i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
