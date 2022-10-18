package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int INITITERRATOR = 0;
        final int MAXVALUE = 3;
        Lottery lottery = new Lottery();
        for (int i = INITITERRATOR; i < MAXVALUE; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
