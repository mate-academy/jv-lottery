package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int k = 0; k < 3; k++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}

