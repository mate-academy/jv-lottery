package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        int i = 0;
        do {
            System.out.println(lottery.getRandomBall());
            i++;
        } while (i != 3);
    }
}
