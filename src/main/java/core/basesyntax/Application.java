package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery rndLottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            System.out.println(rndLottery.getRandomBall());
        }
    }
}
