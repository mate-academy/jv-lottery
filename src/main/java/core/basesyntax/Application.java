package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        int NUMBER_OF_LOTTERY = 3;
        Lottery[] lottery = new Lottery [NUMBER_OF_LOTTERY];
        for(int i = 0; i < lottery.length; i++) {
            lottery[i] = new Lottery();
        }
        for (int i = 0; i < lottery.length; i++) {
            System.out.println(lottery[i].getRandomBall().color + " " + lottery[i].getRandomBall().number);
        }
    }

}
