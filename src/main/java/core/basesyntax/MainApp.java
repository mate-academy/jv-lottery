package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < 10; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
