package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery[] lottery = new Lottery[3];
        for (int i = 0; i < lottery.length; i++) {
            lottery[i] = new Lottery();
            System.out.println("Ball number " + (i + 1) + ":" + lottery[i].getRandomBall());
        }
    }
}
