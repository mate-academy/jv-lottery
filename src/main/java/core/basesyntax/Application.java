package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        final int MAGIC_THREE = 3;
        Lottery lottery = new Lottery();
        for (int i = 0; i < MAGIC_THREE; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
