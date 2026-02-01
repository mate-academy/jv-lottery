package core.basesyntax;

public class Application {
    private static final int MAX_BALL = 3;

    public static void main(String[] args) {

        Lottery rand = new Lottery();

        Ball[] arr = new Ball[MAX_BALL];
        for (int i = 0;i < MAX_BALL;i++) {
            arr[i] = rand.getRandomBall();
        }

        for (int i = 0;i < MAX_BALL;i++) {
            System.out.println(arr[i].toString());
        }
    }
}
