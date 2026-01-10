package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int ballsQty = 3;

        for (int i = 0; i < ballsQty;i++) {
            System.out.println(new Lottery().getRandomBall());
        }
    }
}
