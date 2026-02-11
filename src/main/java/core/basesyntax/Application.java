package core.basesyntax;

public class Application {
    public static final int ballAmount = 3;

    public static void main(String[] args) {

        for (int i = 0; i < ballAmount; i++) {
            System.out.println(new Lottery().getRandomBall());
        }
    }
}
