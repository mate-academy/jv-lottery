package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        int i = 0;
        while (i < 3) {
            System.out.println(i + " " + lottery.getRandomBall());
            i++;
        }
    }
}
