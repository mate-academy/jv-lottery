package core.basesyntax;

public class Application {

    public static final int AMOUNT_OF_LOTTERY_GAMES = 3;
    
    public static void main(String[] args) {
        
        Lottery lottery = new Lottery();

        for (int i = 0; i < AMOUNT_OF_LOTTERY_GAMES; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
