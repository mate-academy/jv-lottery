package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        int i = 1;
        while (i < 4) {
            System.out.println(i + " " + lottery.getRandomBall());
            i++;
        }
    }
}
