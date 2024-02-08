package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        int counter = 0;
        while (counter < 3) {
            System.out.println(lottery.getRandomBall());
            counter++;
        }
    }
}
