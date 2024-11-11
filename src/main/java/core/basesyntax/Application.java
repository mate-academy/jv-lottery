package core.basesyntax;

public class Application {
    static int ballCount = 3;
    static Lottery lottery = new Lottery();

    public static void main(String[] args) {
        for(int i =0; i < ballCount; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
