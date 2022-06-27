package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            System.out.println(i + " Ball" + Lottery.getRandomBall());
        }
    }
}

