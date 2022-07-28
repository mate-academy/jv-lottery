package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(new Lottery().getRandomBall().toString());
        }
    }
}
