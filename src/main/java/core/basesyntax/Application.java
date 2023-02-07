package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int Ball = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(new Lottery(Ball).getRandomBall());
        }
    }
}
