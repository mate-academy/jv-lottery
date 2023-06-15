package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        Ball[] newBall = new Ball[NUMBER_OF_BALLS];
        for (int i = 0; i < newBall.length; i++) {
            newBall[i] = new Ball();
        }

        System.out.println(newBall);
    }
}
