package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        private static final int LOTTERY_ARRAY_LENGTH = 3;
        
        Ball[] lotteryBall = new Ball[LOTTERY_ARRAY_LENGTH];
        Lottery lottery = new Lottery();
        for(int i=0; i< lotteryBall.length; i++){
            lotteryBall[i] = lottery.getRandomBall();
            System.out.println(lotteryBall[i].toString());
        }
    }
}
